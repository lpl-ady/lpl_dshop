package com.dshop.util;

public class CommUtil {

	public static boolean isContainString(String[] imgType, String type) {
		for(String str : imgType){
			if(str.equals(type))
				return true;
		}
		return false;
	}

}
