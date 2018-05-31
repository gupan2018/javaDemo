package com.fileOp.language;

import java.beans.Encoder;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 
 * 主要讲RandomAccessFile这个类的用法
 * RandomAccessFile（RAF）：
 * 		主要用于读写文件
 * 
 * RAF：
 * 		这个类是基于指针进行读写，RAF总是在指针指向的位置读写字节，并且读写后指针会自动向后移动
 * 
 * 读取二进制
 * 		read（返回一个int值）、write(不带参数的情况下，每次只能写1个字节，若为Interger类型，只能写入最后8位)
 * 
 * @author Gupan
 *
 */
public class RandomAccessFileClassDemo {
	public static void main(String[] args) throws IOException {
		
		// *****************************************************读取文件*****************************************************
		RandomAccessFile raf
		 = new RandomAccessFile(
			"." + File.separator + "Demo.txt", "r"	 
		);
		System.out.println(raf.read());
		
		raf.close();
		
		
		// *****************************************************读写方式打开文件*****************************************************
		RandomAccessFile raf02
		 = new RandomAccessFile(
			"." + File.separator + "Demo02.txt", "rw"	 
		);
		raf02.write(1);
		raf02.write(2);
		raf02.writeChars("及哈哈哈");
		raf02.close();
		
		// *****************************************************文件拷贝*****************************************************
		RandomAccessFile src
		 = new RandomAccessFile(
			"." + File.separator + "Demo02.txt", "r"	 
		);
		
		RandomAccessFile desc
		 = new RandomAccessFile(
			"." + File.separator + "Desc02.txt", "rw"
		);
		
		// 用来保存读取到的每一个字节
		int d = -1;
		while ((d = src.read()) != -1) {
			desc.write(d);
		}
		src.close();
		desc.close();
		
		
		// *****************************************************高效读写****************************************************
		RandomAccessFile src01
		 = new RandomAccessFile(
			"." + File.separator + "Demo02.txt", "r"	 
		);
		
		RandomAccessFile desc01
		 = new RandomAccessFile(
			"." + File.separator + "Desc02.txt", "rw"
		);
		
		
		byte [] buf = new byte[1024 * 10];
		int len = -1;
		
		while((len = src01.read(buf)) == -1) {
			// 不能直接用write(buf)，注意垃圾数据
			// 第二个参数代表从哪儿开始，第三个参数是读多长
			desc01.write(buf, 0, len);
		}
		
		// *****************************************************写入一个Interger的最大值*****************************************************
		int max = Integer.MAX_VALUE;
		desc01.write(max>>>24);
		desc01.write(max>>>16);
		desc01.write(max>>>8);
		desc01.write(max);
		long pos = desc01.getFilePointer();
		// 或者直接调用writeInt方法
		desc01.writeInt(max);
		
		// *****************************************************文件指针操作*****************************************************
		// 获取当前文件指针
		System.out.println(desc01.getFilePointer());
		// 将指针移动到指定位置，单位字节
		desc01.seek(pos);
		// 移动指针到最开始的位置
		desc01.seek(0);
		
		
		src01.close();
		desc01.close();
	}
	
	
}
