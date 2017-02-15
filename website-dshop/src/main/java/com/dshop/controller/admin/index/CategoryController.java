package com.dshop.controller.admin.index;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.dshop.bean.DshopGoodsCategory;
import com.dshop.bean.DshopStoreBindCategory;
import com.dshop.bean.example.DshopGoodsCategoryExample;
import com.dshop.service.CategoryService;
import com.dshop.web.view.JsonActionResult;

@Controller
@RequestMapping("/admin/category")
public class CategoryController {

	@Resource
	private CategoryService categoryService;
	
	@RequestMapping("selectByPid")
    public JsonActionResult index(int pid,HttpServletRequest request,HttpServletResponse response){
		JSONObject object = new JSONObject();
		DshopGoodsCategoryExample dce = new DshopGoodsCategoryExample();
		dce.createCriteria().andCateParentIdEqualTo(pid);
		List<DshopGoodsCategory> cateList = categoryService.selectByExample(dce);
		object.put("cateList", cateList);
		return new JsonActionResult(object.toString(), response);
	}
	
	@RequestMapping("selectByPidAndStoreId")
    public JsonActionResult index(int pid,int storeId,String cate,HttpServletRequest request,HttpServletResponse response){
		JSONObject object = new JSONObject();
		
		DshopStoreBindCategory dsce = new DshopStoreBindCategory();
		if(cate.equals("cateId2"))
			dsce.setCateId2(-1);//占位
		if(cate.equals("cateId3"))
			dsce.setCateId3(-1);//占位
		dsce.setStoreId(storeId);
		dsce.setSbcStatus((byte)1);
		
		List<DshopGoodsCategory> dsbcList = new ArrayList<DshopGoodsCategory>();
		
		try {
			dsbcList = categoryService.selectStoreBindCategroyByExample(dsce);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//移除不为当前父类的商品类别
		for(Iterator<DshopGoodsCategory> it = dsbcList.iterator(); it.hasNext();){
			DshopGoodsCategory dgc = it.next();
			if(dgc.getCateParentId() != pid){
				it.remove();
			}
		}
		
		object.put("cateList", dsbcList);
		return new JsonActionResult(object.toString(), response);
	}
}
