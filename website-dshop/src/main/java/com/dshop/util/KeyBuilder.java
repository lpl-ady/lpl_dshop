package com.dshop.util;

import java.util.Random;

/**
 * 自定义主键生成器
 * @author lpl
 *
 */
public class KeyBuilder{
	
	private static long uniqueID = System.currentTimeMillis();
	
	public static String generate() {
		uniqueID++;
		return String.valueOf(uniqueID * 1000L + (long)(new Random()).nextInt(999));
	}
}
