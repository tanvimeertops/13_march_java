package com.keyword;
/*
 * This : current class context
 * when instance(class,global) variable name is same as 
 * parameter name then we use "this" keyword
 * to separate the context
 */
class TDemo{
	int f_no,s_no;
	
	public void setData(int f_no,int s_no) {
		this.f_no=f_no;
		this.s_no=s_no;
	}
	
	public void sum() {
		System.out.println("sum is :"+(f_no+s_no));
	}
}
public class ThisDemo {
public static void main(String[] args) {
	TDemo td=new TDemo();
	td.setData(10, 20);
	td.sum();
}
}
