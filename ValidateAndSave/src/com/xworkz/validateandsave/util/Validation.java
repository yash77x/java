package com.xworkz.validateandsave.util;

public class Validation {
	
	public static boolean stringValidate(String string) {
		if(string!=null && !string.isEmpty() && string.length()>0 && string.length()<30) {
			return true;
		}
		return false;
	}

}
