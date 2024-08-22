package com.oops;
/*
 * Hierarchical: one parent multiple child 
 * 
 * 
 */
class Parent {
	String p_name;
	long ph_no;
	
	public void setParent() {
		p_name="salim khan";
		ph_no=8548548590l;
	}
}

class Child1 extends Parent{
	String name="salman";
	public void show() {
		System.out.println("For any complain of "+name+" "+p_name+
				" call "+ph_no);
	}
}

class Child2 extends Parent{
	String name="suhail";
	public void show() {
		System.out.println("For any complain of "+name+" "+p_name+
				" call "+ph_no);
	}
}
public class InheritanceDemo2 {
public static void main(String[] args) {
	Child1 c1=new Child1();
	c1.setParent();
	c1.show();
	
	Child2 c2=new Child2();
	c2.setParent();
	c2.show();
}
}
