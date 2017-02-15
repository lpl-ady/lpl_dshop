package com.dshop.controller.admin.index;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

import com.alibaba.fastjson.JSONObject;
import com.dshop.bean.DshopGoods;
import com.dshop.bean.DshopGoodsAttribute;
import com.dshop.bean.DshopGoodsCategory;
import com.dshop.bean.DshopStoreBindCategory;
import com.dshop.constants.Constants;
import com.dshop.service.CategoryService;
import com.dshop.service.GoodsAttrService;
import com.dshop.service.GoodsService;
import com.dshop.util.FileUtil;
import com.dshop.util.KeyBuilder;
import com.dshop.web.view.ActionResult;
import com.dshop.web.view.JsonActionResult;
import com.dshop.web.view.ModelView;

@Controller
@RequestMapping("/admin/goods")
public class GoodsController {

	@Resource
	private GoodsService goodsService;
	
	@Resource
	private CategoryService categoryService;
	
	@Resource
	private GoodsAttrService goodsAttrService;
	
	private Logger loger = Logger.getLogger(GoodsController.class);
	
	@RequestMapping("add")
    public ModelAndView index(HttpServletRequest request,HttpServletResponse response){
		ModelView mv = new ModelView();
		
		int storeId = 1;
		
		DshopStoreBindCategory dce = new DshopStoreBindCategory();
		dce.setCateId1(-1);//占位
		dce.setStoreId(storeId);
		dce.setSbcStatus((byte)1);
		
		List<DshopGoodsCategory> dsbcList = categoryService.selectStoreBindCategroyByExample(dce);
		mv.setAttribute("cateList", dsbcList);
		mv.setAttribute("storeId", storeId);
		
		return ActionResult.viewAdmin(mv,"goods/add_base");
	}
	
	/**
	 * 商品基本信息添加
	 * @param dshopGoods
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("addBaseAction")
    public JsonActionResult addBaseAction(DshopGoods dshopGoods,HttpServletRequest request,HttpServletResponse response){
		JSONObject object = new JSONObject();
		object.put("code", Constants.OPERATE_FAIL);
		if(null != dshopGoods){
			if(dshopGoods.getCateId3() > 0)
				dshopGoods.setCateId(dshopGoods.getCateId3());
			dshopGoods.setGoodsAddTime(new Date());
		}
		int result = goodsService.insertSelective(dshopGoods);
		if(result > 0)
		{
			object.put("code", Constants.OPERATE_SUCCESS);
			object.put("goodsId", dshopGoods.getGoodsId());
			return new JsonActionResult(object.toString(), response);
		}
		return new JsonActionResult(object.toString(), response);
	}
	
	/**
	 * 商品属性信息添加
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("addAttrAction")
    public JsonActionResult addAttrAction(int goodId,HttpServletRequest request,HttpServletResponse response){
		JSONObject object = new JSONObject();
		object.put("code", Constants.OPERATE_FAIL);
		String[] goodsAttrValue = request.getParameterValues("goodsAttrValue");
		String[] goodsAttrCostprice = request.getParameterValues("goodsAttrCostprice");
		String[] goodsAttrToprice = request.getParameterValues("goodsAttrToprice");
		String[] goodsAttrStock = request.getParameterValues("goodsAttrStock");
		if(null != goodsAttrValue && null != goodsAttrCostprice && null != goodsAttrToprice && null != goodsAttrStock){
			int succCount = 0;
			for(int i = 0; i < goodsAttrValue.length; i++){
				DshopGoodsAttribute dga = new DshopGoodsAttribute();
				dga.setGoodsId(goodId);
				dga.setGoodsAttrCostprice(new BigDecimal(goodsAttrCostprice[i]).setScale(2, BigDecimal.ROUND_HALF_UP));
				dga.setGoodsAttrToprice(new BigDecimal(goodsAttrToprice[i]).setScale(2, BigDecimal.ROUND_HALF_UP));
				dga.setGoodsAttrStock(Integer.parseInt(goodsAttrStock[i]));
				dga.setGoodsAttrValue(goodsAttrValue[i]);
				dga.setGoodsAttrName("");
				int count = goodsAttrService.insertSelective(dga);
				if(count > 0)
					succCount++;
			}
			
			if(succCount == goodsAttrValue.length){
				object.put("code", Constants.OPERATE_SUCCESS);
				return new JsonActionResult(object.toString(), response);
			}
		}
		
		return new JsonActionResult(object.toString(), response);
	}
	
	/**
	 * 商品主图添加
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("addSingleImage")
    public JsonActionResult addImage(HttpServletRequest request,HttpServletResponse response){
		
		JSONObject object = new JSONObject();
		
		MultipartHttpServletRequest multipartRequest  =  (MultipartHttpServletRequest) request;
		MultipartFile imgFile  =  multipartRequest.getFile("file");
		
		if(null != imgFile)
		{
			//判断图片大小
			if(!FileUtil.decideImgSize(imgFile)){
				object.put("code",Constants.IMG_SIZE_ERROR);
				return new JsonActionResult(object.toString(), response);
			}
			//判断图片类型
			if(!FileUtil.decideImgType(imgFile)){
				object.put("code",Constants.IMG_TYPE_ERROR);
				return new JsonActionResult(object.toString(), response);
			}
		}
		
		//存储路径
		String path =  request.getSession().getServletContext().getRealPath("/upload/goods/");
		
		String imgName= KeyBuilder.generate();
		String fileName = imgFile.getOriginalFilename();
		String[] suffixs = fileName.split("\\.");
		String suffix = "." + suffixs[suffixs.length-1];
		imgName = imgName + suffix;
		
		//创建文件
		File dirPath = new File(path);  
		
		if (!dirPath.exists()) {  
			dirPath.mkdir();   
		}
		
		try {
			FileOutputStream fileZhu = new FileOutputStream(path+"/"+imgName);
			fileZhu.write(imgFile.getBytes());
			fileZhu.close();
		} catch (IOException e) {
			loger.info("图片上传出错：",e);
			object.put("code",Constants.IMG_UPLOAD_ERROR);
			return new JsonActionResult(object.toString(), response);
		}
		object.put("code",Constants.IMG_UPLOAD_SUCCESS);
		object.put("imgName", imgName);
		return new JsonActionResult(object.toString(), response);
	}
	
	@RequestMapping("addMultiImage")
    public JsonActionResult addMultiImage(HttpServletRequest request,HttpServletResponse response){
		
		return new JsonActionResult("", response);
	}
	
}
