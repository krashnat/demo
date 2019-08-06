package com.bidgelab.objectoriented;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexChange {
	// information to change
	String name = "<<name>>";
	String fullname = "<<full name>>";
	String contactNo = "xxxxxxxxxx";
	String date = "01/01/2016";

	// method to match information and replace
	public String convertString(Details detail, String message) {
		Pattern p = Pattern.compile(name);// for first name matcher
		Matcher m = p.matcher(message);
		message = m.replaceAll(detail.getName());

		// full name matcher and replacing
		p = Pattern.compile(fullname);
		m = p.matcher(message);
		message = m.replaceAll(detail.getFullname());

		// contact no matcher and replacing contact no
		p = Pattern.compile(contactNo);
		m = p.matcher(message);
		message = m.replaceAll(detail.getContactNo());

		// date changing
		p = Pattern.compile(date);
		m = p.matcher(message);
		message = m.replaceAll(detail.getDate());

		return message;
	}

}
