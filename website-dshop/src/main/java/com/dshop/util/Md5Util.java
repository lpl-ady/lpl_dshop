package com.dshop.util;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5Util {

    public Md5Util()
    {
    }
    
    /**
     * 加签
     * @param param   参数
     * @param signKey 商户秘钥
     * @return 签名串
     */
    public static String signStr(String param, String signKey) {
    	
    	if(StringUtil.isEmpty(param) && StringUtil.isEmpty(param))
    		return null;
    	
        // 传递字典排序
        StringBuilder buffer = new StringBuilder("signKey=").append(signKey);
        buffer.append(param);
        String sign = encode(buffer.toString());
        return sign;
      }

    public static String encode(String source)
    {
        try {
			char result[];
			MessageDigest digester = MessageDigest.getInstance("MD5");
			byte sbs[] = source.getBytes("UTF8");
			digester.update(sbs);
			byte rbs[] = digester.digest();
			int j = rbs.length;
			result = new char[j * 2];
			int k = 0;
			for(int i = 0; i < j; i++)
			{
			    byte b = rbs[i];
			    result[k++] = hexs[b >>> 4 & 15];
			    result[k++] = hexs[b & 15];
			}

			return new String(result);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
        return null;
    }

    private static char hexs[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'a', 'b', 'c', 'd', 'e', 'f'
    };
}
