package com.basic;
/*
 * a=23
 * b=45
 * c=12
 * 
 * else if ladder:
 * logical operator: 
 * && || !
 */
public class ConditionDemo2 {
public static void main(String[] args) {
	int a=1400,b=340,c=1200;
	
//	if(a>b) {
//		if(a>c) {
//			System.out.println("A is greater");
//		}else {
//			System.out.println("C is greater");
//		}
//	}else {
//		if(b>c) {
//			System.out.println("B is greater");
//		}else {
//			System.out.println("c is greater");
//		}
	
	
//	}
	
	if(a>b && a>c) {  
		System.out.println("A is greater");
	}else if(b>a&&b>c) {
		System.out.println("B is greater");
	}else {
		System.out.println("C is greater");
	}
	
	
}
}
