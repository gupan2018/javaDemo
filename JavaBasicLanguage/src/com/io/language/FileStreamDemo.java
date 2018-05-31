package com.io.language;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * 
 * 这个类主要讲了文件流
 * 
 * @author Think
 *
 */

public class FileStreamDemo {
	
	/**
	 * 讲了文件流输出用法
	 * @throws IOException
	 */
	public static void fileOutPut() throws IOException{
		// 没有该文件会创建文件，如果该文件存在，默认会清空原有内容，然后再输出
		/*
		 * 在创建时，如果指定第二个参数，并且指定该值为true，那么本次通过fos写出的内容会被追加到该文件末尾
		 * 
		 * */
		FileOutputStream fos = new FileOutputStream("fos.txt", true);
		
		String str = "我是圆滚滚";
		// string转换成字节，指定编码为utf-8
		byte[] data = str.getBytes("utf-8");
		fos.write(data);
		fos.close();
	}
	
	/**
	 * 讲了文件流输入用法
	 * @throws IOException
	 */
	public static void fileInput() throws IOException{
		FileInputStream fiStream = new FileInputStream("fos.txt");
		byte[] data = new byte[100];
		int len = fiStream.read(data);
		String str = new String(data,0, len, "utf-8");
		System.out.println(str);
	}
	
	public static void main(String[] args) throws IOException {
		// fileOutPut();
		fileInput();
	}
}
