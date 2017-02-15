package com.dshop.util;

public class PageUtils {
	
	public static int getPageCount(int pageSize, int totalCount) {
		int totalPage = 0;
		if (totalCount % pageSize == 0) {
			totalPage = totalCount / pageSize;
		} else {
			totalPage = (totalCount / pageSize) + 1;
		}
		
		return totalPage;
	}
}
