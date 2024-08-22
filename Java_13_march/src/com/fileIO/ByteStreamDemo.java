package com.fileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * File: 
 * 1.File is a class
 * 2.to store the data permanent
 * 3.we use stream to store the data 
 * 
 *	1.byte stream (1 byte/char)
 *			  FileOutputStream
 *			to write into the file
 *				FileInputStream
 *			to read from the file
 *	2.character stream (2 byte/char)
 *		  FileWriter
 *			to write into the file
 *		FileReader
 *			to read from the file
 *
 *steps:
 *1.to open/create a file into java class
 *2.to write/read into/from the file
 *3.close the file
 *
 *must have error
 *FileNotFound
 *IOException
 */
public class ByteStreamDemo {
public static void main(String[] args) throws Exception {
	
	//to open/create a file into java class
		FileOutputStream fos=new FileOutputStream("file1.txt",true);
		String msg="\nThis is Tops Technologies...surat";
		//to convert into byte
		byte[] bb=msg.getBytes();
		//to write into file
		fos.write(bb);
		fos.flush();
		fos.close();
		System.out.println("data writen");
		
		
		FileInputStream fis=new FileInputStream("file1.txt");
		int x;
		while ( (x=fis.read())!=-1) {
			System.out.print((char)x);
		}
		fis.close();
}
}