package com.dshop.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class SecurityFilter implements Filter{

	private String excludeUrl;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		this.excludeUrl = filterConfig.getInitParameter("excludeUrl");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
			HttpServletRequest req = (HttpServletRequest) request;   
		    HttpSession session = req.getSession();   
		    if (session.getAttribute("admin") != null || req.getRequestURI().equals(this.excludeUrl)) {
		         chain.doFilter(request, response);   
		    } else {
		    	req.getRequestDispatcher("/admin/login").forward(request, response);   
		    }    
	}

	@Override
	public void destroy() {
		
	}

}
