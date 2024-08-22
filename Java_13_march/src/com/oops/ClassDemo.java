package com.oops;
/*
 * oops: 
 * 1.maintainability
 * 2.modularity
 * 3.reusability
 * 4.flexible
 * 
 * concepts of oops:
 * 1.Class:
 * class is a collection of data member and member function
 * 
 * 2.Object:
 * object gives permission to access the functionality of class
 * 3.encapsulation :wrapping of data
 *  Access Specifier
 *  1.private : only accessible within class
 *  2.protected :only accessible to child
 *  3.default :accessible within package
 *  4.public :accessible anywhere
 * 
 * 4.polymorphism
 * 5.abstraction
 * 6.inheritance
 * 
 * 
 * 
 */

 class Student{
	private int roll_no;
	protected String name;
	
	public void setData() {
		roll_no=1;
		name="neha";
	}
	
	public void show() {
		System.out.println("roll no is :"+roll_no);
		System.out.println("name is :"+name);
	}
}
class Child extends Student{
	public void show() {
		System.out.println("roll no is :");
		System.out.println("name is :"+name);
	}
}
public class ClassDemo {
public static void main(String[] args) {
	//class_name obj_name=new Class_name();
	Student s1=new Student();
//	s1.setData();
//	s1.show();
	Child c=new Child();
	c.setData();
	c.show();
}
}
