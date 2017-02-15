package com.dshop.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class DateUtil {

    private static final Logger logger = LoggerFactory.getLogger(DateUtil.class);
    
	/**
	 * 格式化字符串-日期天开始时刻
	 */
	public static final String FORMAT_DAY_BEGIN = "yyyy-MM-dd 00:00:00";
	/**
	 * 格式化字符串-日期天结束时刻
	 */
	public static final String FORMAT_DAY_END = "yyyy-MM-dd 23:59:59";
	/**
	 * 格式化字符串-日期时刻到秒
	 */
	public static final String FORMAT_FULL = "yyyy-MM-dd HH:mm:ss";
	/**
	 * 格式化字符串-日期时刻到分钟
	 */
	public static final String FORMAT_MINUTE = "yyyy-MM-dd HH:mm";

	/**
	 * 某天的时间
	 * @param date
	 * @param leng_time//今天往上加的时间
	 * @param sft
	 * @return
	 */
	public static String getAddTime(Date date,int leng_time,String sft){
	      Calendar   calendar   =   new   java.util.GregorianCalendar(); 
	      calendar.setTime(date); 
	      calendar.add(Calendar.DATE,leng_time);//把日期往后增加一天.整数往后推,负数往前移动 
	      Date date_tom=calendar.getTime();   //这个时间就是日期往后推一天的结果 
	      String str_time =  getFmtTime(date_tom,sft);
	      logger.info("明天时间>>>{}", str_time);
	      return str_time;
	}
	
	/**
	 * 某天的时间
	 * @param date
	 * @param leng_time//今天往上加的时间
	 * @param sft
	 * @return
	 */
	public static Date getAddDateTime(Date date,int leng_time){
	      Calendar   calendar   =   new   java.util.GregorianCalendar(); 
	      calendar.setTime(date); 
	      calendar.add(Calendar.DATE,leng_time);//把日期往后增加一天.整数往后推,负数往前移动 
	      Date date_tom=calendar.getTime();   //这个时间就是日期往后推一天的结果 
	      return date_tom;
	}
	
	public static String getFmtTime(Date nowTime,String fmt){
	     SimpleDateFormat sft=new SimpleDateFormat(fmt); 
	     return sft.format(nowTime);
	}
	 
	/**
     * Date转String
     * @param count
     * @return
     */
    public static Date getStringToDate(String date) {
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time=null;
        try {
            time = formatDate.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return time;
    }
	
	public static Map<String,String> getDateInfo() {
		String returnStr = null;
		Date dates = new Date();
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		returnStr = f.format(dates);

		String pattern = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);

		Date date=null;
		try {
			date = sdf.parse(returnStr);
		} catch (ParseException e) {
			logger.error("", e);
		}
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		// ------------
		SimpleDateFormat fdate = new SimpleDateFormat("MM.dd");
		// ------------
		Date today = c.getTime();
		c.add(Calendar.DAY_OF_YEAR, 1);
		c.add(Calendar.DAY_OF_YEAR, 1);
		Date today_plus2 = c.getTime();
		c.add(Calendar.DAY_OF_YEAR, 1);
		Date today_plus3 = c.getTime();
		c.add(Calendar.DAY_OF_YEAR, 1);
		Date today_plus4 = c.getTime();
		c.add(Calendar.DAY_OF_YEAR, 1);
		Date today_plus5 = c.getTime();
		c.add(Calendar.DAY_OF_YEAR, 1);
		Date today_plus6 = c.getTime();
		c.add(Calendar.DAY_OF_YEAR, 1);
		Date today_plus7 = c.getTime();
		Map<String,String> mapdate = new HashMap<String, String>();
		mapdate.put("date1", fdate.format(today));
		mapdate.put("date2", fdate.format(today_plus2));
		mapdate.put("date3", fdate.format(today_plus3));
		mapdate.put("date4", fdate.format(today_plus4));
		mapdate.put("date5", fdate.format(today_plus5));
		mapdate.put("date6", fdate.format(today_plus6));
		mapdate.put("date7", fdate.format(today_plus7));
		return mapdate;
	}
	
	/**
	 * 转化字符串到日期实例
	 * @param dateStr		日期字符串
	 * @param format		格式字符串
	 * @return				日期实例
	 * @throws ParseException 转化异常
	 */
	public static Date toDate(String dateStr,String format) throws ParseException{
		return new SimpleDateFormat(format).parse(dateStr);
	}
	
	public static long dateToTime(Date date)
	{
		return date.getTime();
	}
	
	public static Date timeToDate(long time){
		return new Date(time);
	}
}
