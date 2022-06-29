package com.example.demo;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.TimeZone;

public class StringToStringAndChangeTimeZone {

	public static void main(String[] args) throws ParseException {
		//TimeZone.setDefault(TimeZone.getTimeZone("GMT-5:00"));
		String dateFromDatabase = "2021-11-04 18:00:00";
		String changeTimeZone = ChangePatternAndTimeZone(dateFromDatabase, "UTC");
		System.out.println("Antes: " + dateFromDatabase + " |||| Después: " + changeTimeZone);
	}

	public static String ChangePatternAndTimeZone(String dateFromDatabase, String timeZone) throws ParseException {
		String DatePatternFromDatabase = "yyyy-MM-dd HH:mm:ss";
		String DatePatternToConvert = "yyyy-MM-dd HH:mm:ss z";
		SimpleDateFormat dateStringFormat = new SimpleDateFormat(DatePatternFromDatabase);
		SimpleDateFormat dateFormat = new SimpleDateFormat(DatePatternToConvert);
		dateFormat.setTimeZone(TimeZone.getTimeZone(timeZone));

		Date date = dateStringFormat.parse(dateFromDatabase);
		System.out.println(date);
		return dateFormat.format(date);
	}

}
