package com.dshop.controller.admin.index;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dshop.bean.DshopAdmin;
import com.dshop.bean.example.DshopAdminExample;
import com.dshop.constants.Constants;
import com.dshop.controller.BaseController;
import com.dshop.service.AdminService;
import com.dshop.util.Md5Util;
import com.dshop.web.view.ActionResult;
import com.dshop.web.view.JsonActionResult;

@Controller
@RequestMapping("/admin")
public class AdminController extends BaseController{
	
	@Resource
	private AdminService adminService;
	
	/**
	 * 后台首页
	 */
	@RequestMapping("index")
    public ModelAndView index(HttpServletRequest request,HttpServletResponse response){
		
		return ActionResult.viewAdmin("index/index");
	}
	
	/**
	 * 新增管理员页面
	 */
	@RequestMapping("manager/add")
    public ModelAndView addManager(HttpServletRequest request,HttpServletResponse response){
		
		return ActionResult.viewAdmin("addManager");
	}
	
	/**
	 * 新增管理员动作
	 */
	@RequestMapping("manager/addAction")
    public JsonActionResult addManagerAction(DshopAdmin dsd ,HttpServletRequest request,HttpServletResponse response){
		Long time = new Date().getTime();
		dsd.setAdminRegisterTime(time.intValue());
		dsd.setAdminPassword(Md5Util.signStr(dsd.getAdminPassword(),Constants.ADMINKEY));
		int count = adminService.insertSelective(dsd);
		String result;
		if(count > 0)
			result = "1";
		else
			result = "-1";
		return new JsonActionResult(result,response);
	}
	
	/**
	 * 管理员登录页面
	 */
	@RequestMapping("login")
    public ModelAndView login(HttpServletRequest request,HttpServletResponse response){
		
		return ActionResult.viewAdmin("index/login");
	}
	
	/**
	 * 管理员登录动作
	 */
	@RequestMapping("loginAction")
    public JsonActionResult loginAction(HttpServletRequest request,HttpServletResponse response){
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		DshopAdminExample de = new DshopAdminExample();
		de.createCriteria().andAdminNameEqualTo(username).andAdminPasswordEqualTo(Md5Util.signStr(password, Constants.ADMINKEY));
		
		List<DshopAdmin> list = adminService.selectByExample(de);
		if(CollectionUtils.isNotEmpty(list)){
			request.getSession().setAttribute("admin", list.get(0));
			return new JsonActionResult("1",response);
		}
		else
			return new JsonActionResult("-1",response);
	}
	
	/**
	 * 后台404页面
	 */
	@RequestMapping("error404")
    public ModelAndView error404(HttpServletRequest request,HttpServletResponse response){

		return ActionResult.viewAdmin404();
	}
}
