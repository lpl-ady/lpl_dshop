package com.dshop.controller.web.index;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dshop.controller.BaseController;
import com.dshop.web.view.ActionResult;
import com.dshop.web.view.ModelView;

@Controller
@RequestMapping("/")
public class IndexController extends BaseController{
	
	@RequestMapping("index")
    public ModelAndView index(HttpServletRequest request,HttpServletResponse response){
    	
		ModelView model = new ModelView();
    	
		return ActionResult.viewpc(model,"index/demo");
    }

}
