package com.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat df = new SimpleDateFormat("MM/yy");
		Date d= null;
		try {
			d = df.parse("11/18");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date dd = new Date();
		Calendar c = Calendar.getInstance();
		c.add(Calendar.YEAR, 1);
		System.out.println(d+ "   Hiii  "+dd+" === "+c.getTime());
		System.out.println(d.after(c.getTime()));
		System.out.println(d.before(c.getTime()));
		String s="abcd";
		String regex = "[^A-Za-z0-9]";
		System.out.println("-----        "+s.matches(regex));
	}

}
