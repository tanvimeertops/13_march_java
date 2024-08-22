package com.basic;

public class FirstDemo {
public static void main(String[] args) {
	int i1=2147483647;
	long l1=4594385403958l;
	byte b1=127;
	boolean bb=true;//1bit
	char ch='A';
	float f1=45.657f;
	double d1=3434.5656;
	
	System.out.println("Integer is :"+i1);
	System.out.println("long is :"+l1);
	System.out.println("byte is :"+b1);
	
	System.out.println("Size of integer is :"+Integer.BYTES+" bytes");
	System.out.println("Size of Long is :"+Long.BYTES+" bytes");
	System.out.println("Size of byte is :"+Byte.BYTES+" bytes");
}
}
