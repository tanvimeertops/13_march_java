package com.fileIO;

import java.io.File;
import java.io.IOException;

/*
 * File: 
 * it is a class
 * 
 */
class FDemo{
	File file;
	
	public FDemo() throws IOException {
		file=new File("file3.txt");
		file.createNewFile();
		System.out.println("this is FDemo");
		display();
	}
	
	public void display() {
		System.out.println("is file or not :"+file.isFile());
		System.out.println("is directory or not: "+file.isDirectory());
		System.out.println("can read or not: "+file.canRead());
		System.out.println("can execute or not: "+file.canExecute());
		System.out.println("can write or not: "+file.canWrite());
		System.out.println("file name : "+file.getName());
		System.out.println("file path: "+file.getPath());
		System.out.println("absolute path :"+file.getAbsolutePath());
	}
}
public class FileDemo {
public static void main(String[] args) throws IOException {
	new FDemo();
}
}
