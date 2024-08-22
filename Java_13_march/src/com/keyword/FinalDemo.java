package com.keyword;
/*
 * Final:constant at value side
 * use with variable:
 * 1.value must be define at the time of 
 * declaration
 * 2.value cannot be changed at runtime as well
 * as at compile
 * 
 * use with method : opp of abstract method
 * use with class: opp of abstract class
 * 
 */

final class FDemo{
	final int roll_no = 12;
	String name;
	public final void setData(){
		name="naman";
	}
	public void show() {
		System.out.println("roll is :"+roll_no);
		System.out.println("name is :"+name);
	}
}
class Demo123 {
	
}
public class FinalDemo {
public static void main(String[] args) {
	FDemo f1=new FDemo();
	f1.setData();
	f1.show();
	
}
}
