package com.affiliate.websites.helper;

public class Helper {

	public static String convertToPrettyName(String string) {
		String converted = string.toLowerCase()
				.replaceAll("[^a-zA-Z0-9 ]", "")
				.replaceAll("\\s+", "-");
		
		return converted;
	}
}
