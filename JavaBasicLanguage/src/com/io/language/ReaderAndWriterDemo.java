package com.io.language;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ReaderAndWriterDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("osw.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
		osw.write("圆滚滚在向前滚");
		osw.close();
		
		FileInputStream fis = new FileInputStream("osw.txt");
		InputStreamReader isr = new InputStreamReader(fis, "utf-8");
		
		int d = -1;
		while ((d = isr.read()) != -1) {
			System.out.print((char)d);
		}
	}
}
