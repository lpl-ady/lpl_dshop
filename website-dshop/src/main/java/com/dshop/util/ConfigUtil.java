package com.dshop.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class ConfigUtil {
	
	// 配置文件目录
	private static String configFolder = "";

	// 设置文件目录
	public static void setConfigFolder(String folderpath) {
		configFolder = folderpath;
	}

	// 获取文件目录
	public static String getConfigFolder() {
		return configFolder;
	}

	// 公用配置文件映射对象
	public static class Config {
		
		public static Properties pro = null;
		
		static {
			String filepath = configFolder + "properties/config.properties";
			try {
				pro = loadProperty(filepath);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		private static Properties loadProperty(String filePath) throws Exception {
			
			InputStream fin = null;
			Properties pro = new Properties();
			try {
				fin = Config.class.getClassLoader().getResourceAsStream(filePath);
				pro.load(new InputStreamReader(fin, "UTF-8"));
			} catch (IOException e) {
				throw e;
			} finally {
				if (fin != null) {
					fin.close();
				}
			}
			return pro;
		}
	}

	/**
	 * 获取配置的值
	 * 
	 * @param key
	 * @return
	 */
	public static String getConfigValue(String key) {
		if(null != Config.pro.getProperty(key))
			return Config.pro.getProperty(key);
		else
			return "";
	}

	/**
	 * 获取配置的所有值
	 * 
	 * @param key
	 * @return
	 */
	public static Properties getConfigProperties() {
		return Config.pro;
	}
}
