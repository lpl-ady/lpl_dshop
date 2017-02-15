package com.dshop.web.view;

import java.util.List;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.dshop.bean.DshopAdmin;
import com.dshop.bean.SystemRight;
import com.dshop.util.RightDemo;

public class ActionResult {

	public static ModelAndView viewpc(String template) {
		
		return viewpc(null,template);
	}

	public static ModelAndView viewpc(ModelView model, String template) {
		template = "webpc/" + template;
		if(model != null)
			return new ModelAndView(template,model.getModel());
		else
			return new ModelAndView(template);
	}
	
	public static ModelAndView viewAdmin(String template) {
		
		return viewAdmin(null,template);
	}
	
	public static ModelAndView viewAdmin404() {
		
		return viewAdmin(null,"common/404");
	}

	public static ModelAndView viewAdmin(ModelView model, String template) {
		
		List<SystemRight> list = RightDemo.getSystemRightList();
		
		if(null == model)
			model = new ModelView();
		
		ServletRequestAttributes attrs =(ServletRequestAttributes) RequestContextHolder.getRequestAttributes();  
		Object obj = attrs.getRequest().getSession().getAttribute("admin");
		
		if(null != obj)
			model.setAttribute("admin",(DshopAdmin)obj);
		
		model.setAttribute("rightList", list);
		template = "manager/" + template;
		return new ModelAndView(template,model.getModel());
	}
	
}
