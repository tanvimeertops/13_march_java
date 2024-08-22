package com.basic;
/*
 * Loop :iterative,repetitive
 * 
 * 1.entry check
 * for:
 * syn:
 * for(initialization;condition;incree/decree)
 * {
 * statment
 * }
 * while:
 * initialization;
 * 
 * while(condition)
 * {
 * statment
 * incree/decree;
 * }
 * 2.exit check 
 * do while
 * syn:
 * do{
 * statment
 * incree/decree;
 * }while(condition)
 * 
 * 
 * 
 * 
 */
public class LoopingDemo {
public static void main(String[] args) {
	
	for (int i = 1; i <=5; i++) {
		System.out.println(i);
	}
	//11 times loop is executed
	
	
	System.out.println("for while loop");
	int j=1; //1
	while (j<=5) { 
		System.out.println(j);
		j++;
	}
	//17 times loop is executed
	
	System.out.println("do while loop");
	
	int k=1; //1
	do {
		System.out.println(k);
		k++;
	} while (k<=5);
	
	//21 times loop is executed
	
	//sum of each no in 12345
	//1+2+3+4+5
	
	int rem,no=12345,sum = 0;
	
	while (no!=0) {
		rem=no%10; //5
		no=no/10;//1
		sum=sum+rem;
	}
	
	System.out.println("sum is :"+sum);
}
}
