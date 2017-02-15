package com.dshop.util;

import org.springframework.web.multipart.MultipartFile;


public class FileUtil {

	
	/**
	 * 判断图片大小是否符合要求
	 */
	public static boolean decideImgSize(MultipartFile imgFile){
		String size = String.format("%.1f",imgFile.getSize() / 1024.0);
		float imgSize = Float.parseFloat(ConfigUtil.getConfigValue("imgSize"));
		if(Float.parseFloat(size) < imgSize)
			return true;
		return false;
	}
	
	/**
	 * 判断图片类型是否指定类型
	 */
	public static boolean decideImgType(MultipartFile imgFile){
		String[] fileType = StringUtil.split(imgFile.getContentType(), "/");
		if(!fileType[0].equals("image"))
			return false;
		String[] imgType = StringUtil.split(ConfigUtil.getConfigValue("imgType"),"|");
		if(CommUtil.isContainString(imgType,fileType[1]))
			return true;
		return false;
	}
}
