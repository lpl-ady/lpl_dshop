package com.dshop.web.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.View;

import com.dshop.controller.BaseController;

@Controller
public class JsonActionResult extends BaseController implements View{

	private String str;
	
	public JsonActionResult(String str,HttpServletResponse response) {
		this.str = str;
		try {
			render(null,null,response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String getContentType() {
		return "UTF-8";
	}

	@Override
	public void render(Map<String, ?> model, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		response.setHeader("Pragma", "No-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setHeader("Content-Type", "text/html; charset=utf-8");
		response.setCharacterEncoding("UTF-8");
		response.setDateHeader("Expires", -1);
		PrintWriter pw = null;
		
		try {
			pw =  response.getWriter();
			pw.write(this.str);
			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(pw!=null){
				pw.close();
			}
		}
	}
}
