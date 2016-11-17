package org.hdkj.wechat.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {
	/**
	 * 获取当前时间,格式为yyyy-MM-dd HH:mm:ss
	 * 
	 * @return
	 */
	public static String getCurrTime()
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(new Date());
	}
	
	public static String calRemainDay(Date d1,Date d2){
		long r=(d2.getTime()-d1.getTime())/(24*60*60*1000);
		return (r<0)?"0":String.valueOf(r);
	}
	
	public static String daysBetween(Date d1,Date d2){
		long r=(d2.getTime()-d1.getTime())/(24*60*60*1000);
		return String.valueOf(r);
	}
	
	public static String dateToStr(Date date,String fm){
		java.text.SimpleDateFormat f = new java.text.SimpleDateFormat(fm);
		String time = f.format(date);
		return time;
	}
	
	//yyyy-MM-dd hh:mm
	public static Date stringToDate(String str,String fm){
		DateFormat format= new SimpleDateFormat(fm);
        Date date=null;
		try {
			date = format.parse(str);
			
		} catch (ParseException e) {
			
			e.printStackTrace();
		} 
		return date;
	}
	
	public static Date addMonth(Date d,int i){
		 Calendar calender = Calendar.getInstance();
         calender.setTime(d);
         calender.add(Calendar.MONTH, i);
         return calender.getTime();
	}
	
	public static Date addDay(Date d,int i){
		 Calendar calender = Calendar.getInstance();
        calender.setTime(d);
        calender.add(Calendar.DAY_OF_MONTH, i);
        return calender.getTime();
	}
	
	 /**
     * 判断当前日期是星期几
     * 
     * @param pTime 修要判断的时间
     * @return dayForWeek 判断结果
     * @Exception 发生异常
     */
 public static Integer dayForWeek(String pTime)  {
  SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
  Calendar c = Calendar.getInstance();
  Integer dayForWeek = null;
  try {
	  c.setTime(format.parse(pTime));
	  if(c.get(Calendar.DAY_OF_WEEK) == 1){
		  dayForWeek = 7;
	  }else{
		  dayForWeek = c.get(Calendar.DAY_OF_WEEK) - 1;
	  }
} catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
}
  return dayForWeek;
 }
	
	public static void main(String[] args) {
		System.out.println(stringToDate("2014-08-24","yyyy-mm-dd"));
	}
}
