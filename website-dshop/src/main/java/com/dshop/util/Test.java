package com.dshop.util;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	static String [] attr1 = {"蓝色","红色","绿色"};
	static String [] attr2 = {"L","M"};
	static String [] attr3 = {"亚麻","纯棉"};
	static List<String> resultLit = new ArrayList<String>();
	public static void main(String[] args) {

//		for(int i = 1;i <= 2 ; i++){
//			for(int j = 0;j<attr1.length;j++){
//				System.out.println(attr1[j]);
//				for(int k = 0;k<attr2.length;k++){
//					System.out.println(attr1[j]+attr2[k]);
//					for(int n = 0 ;n<attr3.length;n++){
//						System.out.println(attr1[j]+attr2[k]+attr3[n]);
//					}
//				}
//			}
//		}
		forx(3,"");
		for(String str :resultLit){
			System.out.println(str);
		}
	}
	public static void forx(int t,String result){
		if(t>0)
		{
		   if(t==1){	
				for(int j = 0;j<attr1.length;j++){
					System.out.println(result + attr1[j]);
					forx(--t,attr1[j]);
				}
		   }
		   if(t==2){	
				for(int j = 0;j<attr2.length;j++){
					System.out.println(result + attr2[j]);
					forx(--t,attr2[j]);
				}
		   }
		   if(t==3){	
				for(int j = 0;j<attr3.length;j++){
					System.out.println(result + attr3[j]);
					forx(--t,attr3[j]);
				}
		   }
		}
	}
}
