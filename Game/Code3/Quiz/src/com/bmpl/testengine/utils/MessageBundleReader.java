package com.bmpl.testengine.utils;

import java.util.ResourceBundle;

public interface MessageBundleReader {
	
	public static String getValue(String key){
		// ResourceBundle Class is used to read the Properties file
		ResourceBundle rb = ResourceBundle.getBundle("messages");
		String value = rb.getString(key);
		return value;
	}
	
	public static String getConfigValue(String key){
		// ResourceBundle Class is used to read the Properties file
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String value = rb.getString(key);
		return value;
	}

}
