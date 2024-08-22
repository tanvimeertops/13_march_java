package com.oops;

import java.util.Scanner;

/*
 * Array: collection of data of similar type
 * 1 D Array
 * always start with index 0
 * size-1
 * if size is greater than assigned size it gives error
 * ArrayIndexOutOfBoundsException
 * 2 D Array
 * Jagged Array
 * 
 * 1 D Array
 */
public class ArrayDemo {
public static void main(String[] args) {
	
	//roll no 5 student
	 //declaration of array
	int[] a= {1,2,3,4};
	//Initialization of array
	int[] b=new int[5];
	
	Scanner sc=new Scanner(System.in);
	for (int i = 0; i <b.length; i++) {
		System.out.println("Enter a value:");
		b[i]=sc.nextInt();
	}
	System.out.println("Entered value");
	for (int i = 0; i < b.length; i++) {
		
		System.out.println(b[i]);
	}
	
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
}
}
