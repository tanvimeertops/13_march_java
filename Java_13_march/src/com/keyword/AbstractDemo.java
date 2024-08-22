package com.keyword;
/*Keyword:
 * abstract
 * super
 * final
 * this
 * static
 * interface
 * 
 * 
 * Abstraction:Details are hidden only essential info is shown
 * use with class:
 * 1.we cannot create object of abstract class
 * 2.must inherit into some other
 * 
 * use with method:
 * abstract cannot be defined(cannot have method body)
 * must implement into child class
 * abstract method must have abstract class
 * 
 */

abstract class ADemo{
	int roll_no;
	String name;
	
	public void setData() {
		roll_no=12;
		name="naman";
	}
	
	public abstract void show();
}

class Demo extends ADemo{

	@Override
	public void show() {
		System.out.println("roll no is :"+roll_no);
		System.out.println("name is :"+name);
	}
}
public class AbstractDemo {
public static void main(String[] args) {
	Demo ad=new Demo();
	ad.setData();
	ad.show();
}
}
