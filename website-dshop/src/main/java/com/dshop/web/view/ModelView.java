package com.dshop.web.view;

import java.util.HashMap;
import java.util.Map;

public class ModelView {

	private Map<String , Object> model;
	
	public void setAttribute(String key,Object obj){
		 getModel().put(key, obj);
	}
	
	public boolean containsAttribute(String key){
		return getModel().containsKey(key);
	}
	
	public Object getAttribute(String key){
		return getModel().get(key);
	}
	
	public Map<String , Object> getModel(){
		if(null == this.model){
			this.model = new HashMap<String, Object>();
		}
		return this.model;
	}
}
