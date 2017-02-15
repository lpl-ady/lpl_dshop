package com.dshop.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;

	public class StringUtil {
	
		public static String urlDecode(String content, String charset) {
			try {
				if (content != null) {
					return URLDecoder.decode(content, charset);
				} else {
					return "";
			}
		} catch (UnsupportedEncodingException ex) {
			return content;
		}
	}
	
	public static String urlEncode(String content, String charset) {
		try {
			return URLEncoder.encode(content, charset);
		} catch (UnsupportedEncodingException ex) {
			return content;
		}
	}
	
	public static boolean isEmpty(String str) {
		return (str == null) || (str.equals(""));
	}
	
	private static final char[] HEX_DIGITS = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd',
			'e', 'f' };
	
	public static String toHexString(byte[] buf) {
		return toHexString(buf, null, Integer.MAX_VALUE);
	}
	
	public static String toHexString(byte[] buf, String sep, int lineLen) {
		if (buf == null)
			return null;
		if (lineLen <= 0)
			lineLen = Integer.MAX_VALUE;
		StringBuffer res = new StringBuffer(buf.length * 2);
		for (int i = 0; i < buf.length; i++) {
			int b = buf[i];
			res.append(HEX_DIGITS[(b >> 4) & 0xf]);
			res.append(HEX_DIGITS[b & 0xf]);
			if (i > 0 && (i % lineLen) == 0)
				res.append('\n');
			else if (sep != null && i < lineLen - 1)
				res.append(sep);
		}
		return res.toString();
	}
	
	private static final int charToNibble(char c) {
		if (c >= '0' && c <= '9') {
			return c - '0';
		} else if (c >= 'a' && c <= 'f') {
			return 0xa + (c - 'a');
		} else if (c >= 'A' && c <= 'F') {
			return 0xA + (c - 'A');
		} else {
			return -1;
		}
	}
	
	public static byte[] fromHexString(String text) {
		text = text.trim();
		if (text.length() % 2 != 0)
			text = "0" + text;
		int resLen = text.length() / 2;
		int loNibble, hiNibble;
		byte[] res = new byte[resLen];
		for (int i = 0; i < resLen; i++) {
			int j = i << 1;
			hiNibble = charToNibble(text.charAt(j));
			loNibble = charToNibble(text.charAt(j + 1));
			if (loNibble == -1 || hiNibble == -1)
				return null;
			res[i] = (byte) (hiNibble << 4 | loNibble);
		}
		return res;
	}
	
	public static String ToDBC(String input) {
		char[] c = input.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 12288) {
				c[i] = (char) 32;
				continue;
			}
			if (c[i] > 65280 && c[i] < 65375)
				c[i] = (char) (c[i] - 65248);
		}
		return new String(c);
	}
	
	public static String MultiLileTextToHtml(String source) {
		if (isEmpty(source)) {
			return "";
		}
		String chrChang;
		source = source.replaceAll("&", "&amp;");
		source = source.replaceAll("<", "&lt;");
		source = source.replaceAll(">", "&gt;");
		source = source.replaceAll("  ", "&nbsp;&nbsp;");
		chrChang = String.valueOf((char) 10);
		source = source.replaceAll(chrChang, "<br />");
		chrChang = String.valueOf((char) 34);
		source = source.replaceAll(chrChang, "&quot;");
		chrChang = String.valueOf((char) 32);
		source = source.replaceAll(chrChang, "&nbsp;");
		chrChang = String.valueOf((char) 13);
		source = source.replaceAll(chrChang, "");
		return source;
	}
	
	public static String HtmlToMultiLileText(String source) {
		if (isEmpty(source)) {
			return "";
		}
		String chrChang;
		source = source.replaceAll("&amp;", "&");
		source = source.replaceAll("&lt;", "<");
		source = source.replaceAll("&gt;", ">");
		source = source.replaceAll("&nbsp;&nbsp;", "	");
		chrChang = String.valueOf((char) 10);
		source = source.replaceAll("<br\\s*/>", chrChang);
		chrChang = String.valueOf((char) 34);
		source = source.replaceAll("&quot;", chrChang);
		chrChang = String.valueOf((char) 32);
		source = source.replaceAll("&nbsp;", chrChang);
		return source;
	}
	
	// public static final String getRealIp(HttpServletRequest request) {
	// String ip = getHeader(request, "x-forwarded-for");
	// if (StringUtils.isNotBlank(ip))
	// return pickIp(ip);
	// ip = getHeader(request, "Proxy-Client-IP");
	// if (StringUtils.isNotBlank(ip))
	// return pickIp(ip);
	// ip = getHeader(request, "WL-Proxy-Client-IP");
	// if (StringUtils.isNotBlank(ip)) {
	// return pickIp(ip);
	// }
	// return request.getRemoteAddr();
	// }
	
	private static final String pickIp(String ip) {
		if (ip.indexOf(",") > -1)
			return ip.split(",")[0];
		return ip;
	}
	
	// private static final String getHeader(HttpServletRequest request,
	// String headName) {
	// String value = request.getHeader(headName);
	// return (!StringUtils.isBlank(value)) &&
	// (!"unknown".equalsIgnoreCase(value)) ? value : "";
	// }
	/**
	 * 字符串按字节截取
	 * 
	 * @param str
	 *            原字符
	 * @param len
	 *            截取长度
	 * @return String
	 * @author wangwei
	 */
	public static String splitString(String str, int length) {
		return splitString(str, length, "...");
	}
	
	public static String splitString(String str, int length, String end) {
		if (str == null)
			return null;
		// 先转为英文字符长度
		// length = length * 2;
		StringBuilder sb = new StringBuilder();
		StringBuilder sbTemp = new StringBuilder();
		int currentLength = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			// 先删除sbTemp中的字符再添加
			if (sbTemp.length() > 0) {
				sbTemp.deleteCharAt(0);
			}
			sbTemp.append(c);
	
			// 检查是否ascii字符，如果是，ascii字符长度为1，其它字符长度为2
			if (StringUtils.isAsciiPrintable(sbTemp.toString()))
				currentLength++;
			else
				currentLength = currentLength + 2;
	
			if (currentLength <= length)
				sb.append(c);
			if (currentLength >= length)
				break;
		}
		String rs = sb.toString();
		if (rs.length() < str.length()) {
			return rs + end;
		}
		return rs;
	}
	
	/**
	 * 
	 * @param str
	 *            要处理的字符串
	 * @param stripChars
	 *            要除去的字符，如果为 <code>null</code> 表示除去空白字符
	 * @param mode
	 *            <code>-1</code> 表示trimStart， <code>0</code> 表示trim全部，
	 *            <code>1</code> 表示trimEnd
	 * @return
	 */
	public static String trim(String str, String stripChars, int mode) {
		if (str == null) {
			return null;
		}
		int length = str.length();
		int start = 0;
		int end = length;
		// 扫描字符串头部
		if (mode <= 0) {
			if (stripChars == null) {
				while ((start < end) && (Character.isWhitespace(str.charAt(start)))) {
					start++;
				}
			} else if (stripChars.length() == 0) {
				return str;
			} else {
				while ((start < end) && (stripChars.indexOf(str.charAt(start)) != -1)) {
					start++;
				}
			}
		}
	
		// 扫描字符串尾部
		if (mode >= 0) {
			if (stripChars == null) {
				while ((start < end) && (Character.isWhitespace(str.charAt(end - 1)))) {
					end--;
				}
			} else if (stripChars.length() == 0) {
				return str;
			} else {
				while ((start < end) && (stripChars.indexOf(str.charAt(end - 1)) != -1)) {
					end--;
				}
			}
		}
	
		if ((start > 0) || (end < length)) {
			return str.substring(start, end);
		}
	
		return str;
	}
	
	/**
	 * 从res开始位置截取len长度 如果res的长度大于len则截取，否则不截取
	 * 
	 * @param res
	 * @param len
	 * @return
	 */
	public static String cutString(String res, int len) {
		if (isEmpty(res)) {
			return "";
		}
		if (res.length() <= len) {
			return res;
		}
		return res.substring(0, len);
	}
	
	/**
	 * 获取一个非null的字符串
	 * 
	 * @param str
	 * @return
	 */
	public static String getString(String str) {
		return str == null ? "" : str;
	}
	
	/**
	 * 判断字符是否为空
	 * 
	 * @param value
	 * @return
	 */
	public static Boolean IsEmpty(String value) {
		return value == null || value.length() == 0;
	}
	
	/**
	 * 字符串转整形
	 * 
	 * @param s
	 * @param value
	 * @return
	 */
	public static int tryParseInt(String s, Integer value) {
		if (IsEmpty(s))
			return value;
		try {
			return Integer.parseInt(s);
		} catch (Exception ex) {
			return value;
		}
	}
	
	/**
	 * 字符串转浮点型
	 * 
	 * @param s
	 * @param defaultvalue
	 *            (默认值)
	 * @return
	 */
	public static float tryParseFloat(String s, float defaultvalue) {
		if (IsEmpty(s))
			return defaultvalue;
		try {
			return Float.parseFloat(s);
		} catch (Exception ex) {
			return defaultvalue;
		}
	}
	
	/**
	 * 字符串截取
	 * 
	 * @param strIn
	 * @param len
	 * @return
	 * @throws Throwable
	 */
	static public String StringLeft(String strIn, int len) throws Throwable {
		if (strIn == null || strIn.length() == 0)
			return "";
		if (len > strIn.length())
			return strIn;
		return strIn.substring(0, len);
	}
	
	/**
	 * 字符串格式化，以{index}为占位符(类似.NET的format)
	 * 
	 * @param format
	 *            {0}abc{1}
	 * @param arr
	 * @return
	 */
	static Pattern formatPattern = Pattern.compile("\\{(\\d)\\}");
	
	public static String stringFormat(String format, Object... arr) {
		if (IsEmpty(format))
			return format;
		Matcher m = formatPattern.matcher(format);
		while (m.find()) {
			Object f = arr[Integer.parseInt(m.group(1))];
			format = format.replace(m.group(), f == null ? "" : f.toString());
		}
		return format;
	}
	
	/**
	 * 替换字符串（非正则替换）
	 * 
	 * @param strSource
	 * @param strFrom
	 *            （不能是正则表达式）
	 * @param strTo
	 * @return
	 */
	public static String replaceAll(String strSource, String strFrom, String strTo) {
		if (strSource == null || strFrom == null || strTo == null) {
			return strSource;
		}
		int i = 0;
		if ((i = strSource.indexOf(strFrom, i)) >= 0) {
			char[] cSrc = strSource.toCharArray();
			char[] cTo = strTo.toCharArray();
			int len = strFrom.length();
			StringBuffer buf = new StringBuffer(cSrc.length);
			buf.append(cSrc, 0, i).append(cTo);
			i += len;
			int j = i;
			while ((i = strSource.indexOf(strFrom, i)) > 0) {
				buf.append(cSrc, j, i - j).append(cTo);
				i += len;
				j = i;
			}
			buf.append(cSrc, j, cSrc.length - j);
			return buf.toString();
		}
		return strSource;
	}
	
	/**
	 * 格式化字符串
	 * 
	 * @param strSource
	 * @param strFrom
	 * @return
	 */
	public static String format(String strSource, String strFrom) {
	
		if (strSource == null || strFrom == null) {
			return strSource;
		}
		int i = 0;
		int j = 0;
		StringBuffer buffer = new StringBuffer();
		if ((i = strSource.indexOf("%s")) >= 0) {
			char[] cSrc = strSource.toCharArray();
			for (j = 0; j < i; j++) {
				buffer.append(cSrc[j]);
			}
	
			buffer.append(strFrom);
	
			for (j = i + 2; j < strSource.length(); j++) {
				buffer.append(cSrc[j]);
			}
			return buffer.toString();
		}
		return strSource;
	}
	
	/**
	 * 字符串分割
	 * 
	 * @param source
	 * @param splitchar
	 * @return
	 */
	public static String[] split(String source, String splitchar) {
		if (IsEmpty(source))
			return new String[0];
		if (splitchar.length() > 1) {
			return splitMul(source, splitchar);
		}
		String[] newArray = new String[source.length()];
		String temp = null;
		String[] result = null;
		int start = 0, end = 0, index = 0;
		for (int i = 0; i < source.length(); i++) {
			temp = source.substring(i, i + 1);
			if (splitchar.equals(temp)) {
				temp = null;
				end = i;
				newArray[index] = source.substring(start, end);
				index++;
				start = end + 1;
			}
		}
		if (source.lastIndexOf(splitchar) != source.length()) {
			newArray[index] = source.substring(start, source.length());
			index++;
		}
		result = new String[index];
		System.arraycopy(newArray, 0, result, 0, index);
		return result;
	}
	
	/**
	 * 分隔字符串，其中 splitmul 为字符串
	 * 
	 * @param strSource
	 * @param splitmul
	 * @return
	 */
	private static String[] splitMul(String strSource, String splitmul) {
		if (strSource == null || splitmul == null) {
			return null;
		}
		List<String> list = null;
		int i = 0;
		if ((i = strSource.indexOf(splitmul, i)) >= 0) {
			list = new ArrayList<String>();
			char[] cSrc = strSource.toCharArray();
			int len = splitmul.length();
			list.add(String.copyValueOf(cSrc, 0, i));
			i += len;
			int j = i;
			while ((i = strSource.indexOf(splitmul, i)) > 0) {
				list.add(String.copyValueOf(cSrc, j, i - j));
				i += len;
				j = i;
			}
			list.add(String.copyValueOf(cSrc, j, cSrc.length - j));
		}
		if (list == null || list.size() == 0) {
			return new String[] { strSource };
		}
		String[] arr = list.toArray(new String[list.size()]);
		return arr;
	}
	
	/**
	 * 字符串分割（去掉重复字符）
	 * 
	 * @param source
	 * @param splitchar
	 * @param deemphasis
	 * @return
	 */
	public static String[] split(String source, String splitchar, boolean deemphasis) {
		if (IsEmpty(source))
			return new String[0];
		String[] newArray = new String[source.length()];
		Map<String, String> removeArray = new HashMap<String, String>();
		String temp = null;
		String[] result = null;
		int start = 0, end = 0, index = 0;
		for (int i = 0; i < source.length(); i++) {
			temp = source.substring(i, i + 1);
			if (splitchar.equals(temp)) {
				temp = null;
				end = i;
				String v = source.substring(start, end);
				if (!removeArray.containsKey(v)) {
					newArray[index] = v;
					index++;
					removeArray.put(v, "");
				}
				start = end + 1;
			}
		}
		if (source.lastIndexOf(splitchar) != source.length()) {
			String v = source.substring(start, source.length());
			if (!removeArray.containsKey(v)) {
				newArray[index] = v;
				index++;
			}
		}
		result = new String[index];
		System.arraycopy(newArray, 0, result, 0, index);
		return result;
	}
	
	/**
	 * 字符串分割（去掉重复字符，按字符串长度排序）
	 * 
	 * @param source
	 * @param splitchar
	 * @param deemphasis
	 * @param sort
	 * @return
	 */
	public static String[] split(String source, String splitchar, boolean deemphasis, boolean sort) {
		String[] result = null;
		if (deemphasis)
			result = split(source, splitchar, true);
		else
			result = split(source, splitchar);
		if (result == null) {
			return null;
		}
		if (sort) {
			Arrays.sort(result, new Comparator() {
				@Override
				public int compare(Object a, Object b) {
					String sa = (String) a;
					String sb = (String) b;
					return sb.length() - sa.length();
				}
			});
		}
		return result;
	}
	
	/**
	 * 去重并根据字符串长度排序
	 * 
	 * @param source
	 * @param splitchar
	 * @return
	 */
	public static String deemphasisAndsort(String source, String splitchar) {
		String[] result = split(source, splitchar, true, true);
		if (result == null)
			return source;
		StringBuilder b = new StringBuilder();
		for (String r : result) {
			b.append(r).append(splitchar);
		}
		return b.substring(0, b.length() - 1);
	}
	
	/**
	 * 对传入的数据去除前后的空格,如果是null,返回空串.
	 * 
	 * @param str
	 * @return
	 */
	public static String trim(String str) {
		if (str == null) {
			return "";
		} else {
			return str.trim();
		}
	}
	
	/**
	 * 判断字符串是否为空或空串,如果是,返回true,否则,返回false
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isBlank(String str) {
		if ("".equals(trim(str))) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * 去除字符串中的所有空格，包括前后，中间
	 * 
	 * @param str
	 * @return
	 */
	public static String removeBlank(String str) {
		if (str == null)
			return "";
		return str.replaceAll("\\s*", "");
	}
	
	/**
	 * 检查pstr中是否包含substr，如果包含，返回true，否则，返回false
	 * 
	 * @param str
	 * @return
	 */
	public static boolean containStr(String pstr, String substr) {
		if (pstr == null || substr == null) {
			return false;
		}
		int index = pstr.indexOf(substr);
		return index > -1;
	}
	
	/*
	 * 
	 */
	public static String XSSReplace(String str) {
		String s1 = str.replace("<", "&lt;");
		String s2 = s1.replace(">", "&gt;");
		String s3 = s2.replace("\'", "&#39;");
		String s4 = s3.replace("\"", " &quot;");
		String s5 = s4.replace("script", "ｓｃｒｉｐｔ");
		return s5;
	}
}
