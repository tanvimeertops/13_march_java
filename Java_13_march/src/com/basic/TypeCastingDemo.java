package com.basic;
/*
 * type casting :to convert one primitive type to another
 * 
 * 1.Implicit:auto conversion
 * from smaller data type to bigger
 * int to long
 * 
 * 2.Explicit: 
 * from bigger to smaller
 * long to int
 * 
 * 
 */
public class TypeCastingDemo {
public static void main(String[] args) {
	int i1=10;
	long l1=i1;
	System.out.println("Implicit conversion is :"+l1);
	
	int i2=(int)l1 ;
	System.out.println("Explicit conversion is :"+i2);
	
	char ch='Y';
	int i3=ch;
	System.out.println("Implicit conversion is :"+i3);
	
	int i4=256;
	byte b1=(byte)i4;  //-128 -127 -126   to 127 128 129 130
						//128  
	
	System.out.println("Explicit conversion is :"+b1);
	
	
}
}
