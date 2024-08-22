package com.common_cls;
/*
 * String Buffer: mutable : can change value
 * 
 */
public class StringBufferDemo {
public static void main(String[] args) {
	StringBuffer s1=new StringBuffer("This is Tops Tech...");
	
	System.out.println("original string is :"+s1);
	System.out.println("length of string is :"+s1.length());
	
	s1.insert(0, "Hii ");
	System.out.println("original string is :"+s1);
	System.out.println("length of string is :"+s1.length());
	
	s1.append("Surat");
	System.out.println("original string is :"+s1);
	System.out.println("length of string is :"+s1.length());
	
	s1.delete(0, 4);
	System.out.println("original string is :"+s1);
	System.out.println("length of string is :"+s1.length());
	
	s1.replace(0,4 , "Here");
	System.out.println("original string is :"+s1);
	System.out.println("length of string is :"+s1.length());
	
	
}
}
