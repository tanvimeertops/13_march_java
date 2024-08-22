package com.exception;
/*
 * Exception: abnormal condition occur
 * it is a class
 * Exception class is root class for all exception
 * 1.Compile time exception:
 *  syntax error, ; , } missing
 * 2.runtime exception: 
 * 		Arithmetic exception, ArrayIndexOutOfBound
 * 3.error: developer mistake
 * 
 * 	keywords:
 * try:  
 * 1.if u have a doubt that error might come in some code
 * keep that code inside try block
 * 2.it will skip the code which has error and execute the 
 * remaining code
 * 3.try block will throw error to catch
 * block and error handle by catch block
 * 4.try followed by catch or finally or both
 * catch:
 * 1.whenever any error thrown by try block it 
 * will handle the error
 * 2.there can be multiple catch 
 * 
 * finally :whether error is there or not finally 
 * clock will be executed
 * throw
 * throws
 * 
 */
public class ExceptionDemo {
public static void main(String[] args) {
	int a=12,b=0;
	int[] c=new int[3];
	
	
	try {
		System.out.println("div is :"+a/b);
		
	} catch (ArithmeticException e) {
		e.printStackTrace();
	}
	
	
	finally {
		System.out.println("this code is written by tanvi");
		System.out.println("contact 9309403940");
	}
	
}
}
