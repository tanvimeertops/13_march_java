package com.common_cls;
/*
 * String : immutable : cannot change the value
 * StringBuffer
 * Wrapper
 * Object
 * 
 */
public class StringDemo {
public static void main(String[] args) {
	String s1="This is Tops Tech...";
	
	System.out.println("original string is :"+s1);
	System.out.println("length of string is :"+s1.length());
	System.out.println("to upper case: "+s1.toUpperCase());
	System.out.println("to lower case: "+s1.toLowerCase());
	System.out.println("substring is :"+s1.substring(2));
	System.out.println("substring is :"+s1.substring(2, 5));
	System.out.println("char at :"+s1.charAt(0));
	
	if(s1.equalsIgnoreCase("this is Tops Tech...")) {
		System.out.println("both strings are same");
	}else {
		System.out.println("both strings are different");
	}
	
	System.out.println("original string is :"+s1);
	System.out.println("length of string is :"+s1.length());
}
}
