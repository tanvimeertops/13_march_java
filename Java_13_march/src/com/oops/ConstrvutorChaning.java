package com.oops;

/*
 * Method Overriding : method with same prototype
 * Super keyword: call the method of immediate parent 
 */
class A{
	public A() {
		System.out.println("in class A Constructor");
	}
	
	public void show() {
		System.out.println("in Class A Show");
	}
}
class B extends A{
	public B() {
		System.out.println("in class B Constructor");	}
	
	public void show() {
		super.show();
		System.out.println("in Class B Show");
	}
	
	}

class C extends B{
	public C() {
		System.out.println("in class C Constructor");
	}
	
	public void show() {
		super.show();
		System.out.println("in Class C Show");
	}
}
public class ConstrvutorChaning {
public static void main(String[] args) {
	C c=new C();
	c.show();
	
}
}
