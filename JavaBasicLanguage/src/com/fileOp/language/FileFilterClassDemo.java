package com.fileOp.language;

import java.io.File;
import java.io.FileFilter;

/**
 * 这个类讲了FileFilter的用法
 * 		获取所有以.开始的文件或文件夹
 * 
 * @author Think
 *
 */
public class FileFilterClassDemo {
	public static void main(String[] args) {
		File dir = new File(".");
		File [] subs = dir.listFiles(new FileFilter() {
			@Override
			public boolean accept(File file) {
				// TODO Auto-generated method stub
				System.out.println("正在过滤·····");
				return file.getName().startsWith(".");
			}
		});
		
		for (File sub : subs) {
			System.out.println(sub.getName());
		}
	}
}
