package com.io.language;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * 这个类主要讲了缓冲字符流的用法
 * 
 * @author Think
 *
 */
public class PrintWriterDemo {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		// 内部帮我们创建了File对象
		PrintWriter pw = new PrintWriter("pw.txt", "utf-8");
		
		pw.println("圆滚滚在向前滚");
		pw.println("滚得越来越远了");
		pw.close();
		
		FileOutputStream fos = new FileOutputStream("pw.txt", true);
		// 构造方法内部有创建字符流，但是这种方式不能指定字符集，如果要指定字符集，那么指定一
		// 个OutputStreamWriter对象，创建时指定字符集
		pw = new PrintWriter(fos);
		pw.println("滚得又远了一点");
		pw.close();
	}
}
