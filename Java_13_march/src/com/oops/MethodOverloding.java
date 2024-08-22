package com.oops;
/*
 * Function: does something
 * 1. function without parameter without return type
 * 2. function with parameter without return type
 * 3. function without parameter with return type
 * 4. function with parameter with return type
 * 
 */
class Calc{
	int a=200,b=34;
	
	//1. function without parameter without return type
	public void sum() {
		System.out.println("sum is :"+(a+b));
	}
	//2. function with parameter without return type
	public void sum(int no1,int no2) {
		System.out.println("sum is :"+(no1+no2));
	}
	//3. function without parameter with return type
	public double div() {
		return (double)a/b;
	}
	//4. function with parameter with return type
	public double div(double no1,double no2) {
		return (double)no1/no2;
	}
}
public class MethodOverloding {
public static void main(String[] args) {
	Calc c1=new Calc();
	
	c1.sum();
	c1.sum(12, 63);
	System.out.println("div is :"+c1.div());
	System.out.println("div is :"+c1.div(10.2,2.5));
}
}
