package com.oops;
/*
 * Constructor: it is a special member function which is 
 * initialized by its own
 * 
 * 1.same name as class name
 * 2.no return type
 * 3.automatically invoked whenever object is created
 * 
 * types of Constructor
 * 1.Default :without parameter
 * 2.Parameterized :with parameter
 * 3.Copy :object as a parameter
 * 
 * Constructor overloading 
 */

class Box{
		double length,width,height;
	
	//1.Default :without parameter
	public Box() {
		System.out.println("In default Constructor");
		length=1;
		width=2;
		height=3;
	}
	
	//2.Parameterized :with parameter
	public Box(double l,double w,double h) {
		System.out.println("In Parameter Constructor");
		length=l;
		width=w;
		height=h;
	}
	//3.Copy :object as a parameter
	public Box(Box b) {
		System.out.println("In Copy Constructor");
		length=b.length;
		width=b.width;
		height=b.height;
	}
	public void volOfBox() {
		System.out.println("volume of box is :"+(length*width*height));
	}
}
public class ConstructorDemo {
public static void main(String[] args) {
	Box b1=new Box();
	b1.volOfBox();
	Box pc=new Box(10,20,30);
	pc.volOfBox();
	Box cc=new Box(pc);
	cc.volOfBox();
}
}
