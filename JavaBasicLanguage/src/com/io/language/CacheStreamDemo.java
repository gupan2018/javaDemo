package com.io.language;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * 这个类主要是讲了缓冲流的使用
 * 		缓冲流其实内部也是定义一个buffer数组（一定大小的缓冲池）的方式来提高读写效率，将慢速的硬盘IO，变为缓存中的数据读取
 * @author Gupan
 *
 */
public class CacheStreamDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fiStream = new FileInputStream("fos.txt");
		// 给fiStream加上缓存流
		BufferedInputStream bis = new BufferedInputStream(fiStream);
		
		FileOutputStream foStream = new FileOutputStream("fos.txt");
		// 给foStream加上缓存流
		BufferedOutputStream bos = new BufferedOutputStream(foStream);
		
		int d = -1;
		while((d = bis.read()) != -1) {
			bos.write(d);
		}
		
		System.out.println("复制完毕");
		
		// 在缓冲区没有满的时候，强制把缓冲区的东西刷到硬盘上
		bos.flush();
		// 关闭高级流，会将其中封装的高级流以及低级流都关闭了
		bis.close();
		bos.close();
		
	}
}
