package com.sadasen.util;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @date 2018年3月23日
 * @author lei.ys
 * @addr company
 * @desc
 */
public class DateUtil implements Serializable {

	private static final long serialVersionUID = 4993649327105179257L;
	
	public static Date stringToDateFormat(String string, String format) {
		DateFormat df = new SimpleDateFormat(format);
		Date dt = null;
		try {
			dt = df.parse(string);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return dt;
	}
	
	public static String dateToStringFormat(Date date, String format) {
		DateFormat df = new SimpleDateFormat(format);
		String string = df.format(date);
		return string;
	}
	
	private DateUtil() {
	}

}
