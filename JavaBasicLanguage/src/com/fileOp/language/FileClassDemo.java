package com.fileOp.language;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 这个类主要讲文件的基本操作
 * 注意：
 * 		File不能访问一个文件的数据内容
 * 
 * @author Gupan
 *
 */
public class FileClassDemo {
	public static void main(String[] args) throws IOException {
		File file = new File(
			"." + File.separator + "demo.txt"
		);
		
		// 获取名称
		String filename = file.getName();
		System.out.println(filename);
		
		//获取大小
		long length = file.length();
		System.out.println(length);
		
		// 判断是否是目录
		System.out.println(file.isDirectory());
		
		// 判断是否为隐藏文件
		System.out.println(file.isHidden());
		
		// 获取最后修改时间
		System.out.println(file.lastModified());
		
		// 是否可读、可写、可执行
		System.out.println(file.canWrite());
		System.out.println(file.canRead());
		System.out.println(file.canExecute());
		
		// 判断文件是否存在
		File file01 = new File("test.txt");
		if (!file01.exists()) {
			file01.createNewFile();
			System.out.println("创建完毕");
		}else {
			System.out.println("创建失败");
		}
		
		// 删除当前目录中的文件
		if (file01.exists()) {
			file01.delete();
			System.out.println("删除完毕");
		}else {
			System.out.println("文件不存在");
		}
		
		// 创建或删除一个新目录
		File dir = new File("Demo");
		if (!dir.exists()) {
			dir.mkdir();
			System.out.println("创建Demo目录完毕");
		}else {
			System.out.println("创建Demo目录失败，该目录已存在");
			dir.delete();
			System.out.println("删除Demo目录完毕");
		}
		
		// 递归创建多级目录
		File dir02 = new File("Demo02"+File.separator+"Demo02");
		if (!dir02.exists()) {
			dir02.mkdirs();
			System.out.println("创建目录Demo02/Demo02完毕");
		}else {
			System.out.println("创建目录Demo02/Demo02失败，该目录已存在");
			dir02.delete(); // 不会递归删除，该方法可以删除一个目录，但是前提是，该目录必须是一个空目录
			System.out.println("删除目录Demo02/Demo02完毕");
		}
		
		// 获取当前目录所有子项
		File fatherDir = new File(".");
		if (fatherDir.isDirectory()) {
			File [] subFiles = fatherDir.listFiles();
			for (File subFile : subFiles) {
				System.out.println(subFile.getName());
			}
		}
		else {
			System.out.println("不是一个目录");
		}
		
		
		Date date = new Date(file.lastModified());
		SimpleDateFormat sdf = new SimpleDateFormat(
				"yyyy年MM月dd日 HH:mm:ss"
			);
		
		
		System.out.println(sdf.format(date));
		
	}
	
	/**
	 * 删除所有目录及其子目录
	 * 
	 * @param file
	 */
	public void delete(File file) {
		if (file.isDirectory()) {
			File [] subs = file.listFiles();
			for (File sub : subs) {
				delete(sub);
			}
		}
		file.delete();
	}
	
}
