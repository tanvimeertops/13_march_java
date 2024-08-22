package com.basic;

import java.io.NotActiveException;

/*
 * prime no:
 */
public class PracticeQuestion {
public static void main(String[] args) {
	
	int no=6,flag=1;
	
	for (int i = 2; i <no; i++) {
		if (no%i==0) { 
			flag=0;
		}
	}
	
	if(flag==1) {
		System.out.println("prime no");
	}else {
		System.out.println("not a prime no");
	}
}
}
