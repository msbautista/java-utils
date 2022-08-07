package com.example.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateToStringAndChangeTimeZone {

	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		String dateConverted = convertDateToStringAndChangeTimeZone(date, "UTC");
		System.out.println("Before: " + date + " After: " + dateConverted);
	}

	public static String convertDateToStringAndChangeTimeZone(Date date, String timeZone) {
		//Configurar patron al que se convertira y la zona horaria que administrara
		String DatePatternToConvert = "yyyy-MM-dd HH:mm:ss z";
		SimpleDateFormat dateFormat = new SimpleDateFormat(DatePatternToConvert);
		dateFormat.setTimeZone(TimeZone.getTimeZone(timeZone));
		//Convertir al patron y zona horaria indicada
		return dateFormat.format(date);
	}

}
