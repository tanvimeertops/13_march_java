package com.oops;

import java.util.Scanner;

/*
 * Jagged Array: 
 * same like 2 D Array
 * where row is fixed but no of column may differ
 * 
 * 123
 * 12
 * 12345
 */
public class JaggedArray {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int row;
	
	System.out.println("Enter no of rows:");
	row=sc.nextInt();
	
	int[][] a=new int[row][];
	
	//no of col in each row
	for (int i = 0; i < a.length; i++) {
		System.out.println("enter no col in row no: "+i);
		int col=sc.nextInt();
		a[i]=new int[col];
	}
	
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			System.out.println("enter value for a["+i+"]["+j+"]:");
			a[i][j]=sc.nextInt();
		}
	}
	
	System.out.println("===========values entered=========");
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			System.out.print(" "+a[i][j]);
		}
		System.out.println();
	}
	
}
}
