package com.sadasen.util;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @date 2018年3月8日
 * @author lei.ys
 * @addr company
 * @desc
 */
public class DateTimeUtil implements Serializable {
	
	private static final long serialVersionUID = -8907648564051445318L;
	
	private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	private DateTimeUtil() {
	}
	
	public static String getNow() {
		return dtf.format(LocalDateTime.now());
	}

}
