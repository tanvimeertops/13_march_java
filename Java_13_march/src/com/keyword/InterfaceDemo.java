package com.keyword;
/*
 * Interface :
 * 1.same as class but we cannot create object of interface
 * 2.interface only contain variable and method(exclude 
 * constructor)
 * 3.all data member(variable) are final by default
 * 4.all member function are abstract by default
 * 5.use "implements" method to inherit into some other
 * child class
 * 6.main purpose is to resolve multiple inheritance problem
 * 7.pure data hiding
 */


class Result{
	String grade="A+";
	
}
class IDemo extends Result  implements InterDemo {

	@Override
	public void show() {
		
		System.out.println("i no :"+i_no);
		System.out.println("grade is :"+grade);
		System.out.println("i 2:"+i2);
	}
	
}
public class InterfaceDemo {
public static void main(String[] args) {
	IDemo id=new IDemo();
	
	id.show();
}
}
