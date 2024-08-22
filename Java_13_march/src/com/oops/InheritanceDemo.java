package com.oops;
/*
 * Inheritance: Deriving a attribute of some other class.
 * making a class from an existing class
 * 
 * 1.single : one parent one child
 * 2.multilevel :one grandparent ,one parent,one child
 * 3.hierarchical : one parent multiple child
 * 4.multiple : multiple parent one child
 * 5.hybrid :combination of any two types
 *  
 *  object will be created for last child class only
 *  less object creation
 *  use "extends" keyword to inherit property of parent class
 */
class Student123{
	 int roll_no;
	String name;
	
	public void setData() {
		roll_no=23;
		name="neha";
	}
	
}

class Sports extends Student123{
	int sport_marks=56;
	
	
}

class Grade extends Sports{
	String gradeString="A+";
	
	public void show() {
		System.out.println("roll no is:"+roll_no);
		System.out.println("name is :"+name);
		System.out.println("sports marks :"+sport_marks);
		System.out.println("grade is :"+gradeString);
	}
}
public class InheritanceDemo {
public static void main(String[] args) {
//	Sports s1=new Sports();
//	
//	s1.setData();
//	s1.show();
	
	
	Grade g1=new Grade();
	
	g1.setData();
	g1.show();
}
}
