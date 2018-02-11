package com.bigdata.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToStringMethod {
	/**
	 * 日期转换成字符串
	 * 
	 * @param date
	 * @return str
	 */
	public static String DateToStr(Date date) {

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String str = format.format(date);
		return str;
	}
}
