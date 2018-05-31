package com.fileOp.language;

import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.management.StringValueExp;

/**
 * 这个类主要讲了存储在文件中员工信息的读取
 * 
 * 字段名称：name     字段类型：String    字段长度：32   编码：UTF-8
 * 字段名称：age      字段类型：int       字段长度：4
 * 字段名称：gender   字段类型：String    字段长度：10   编码：UTF-8
 * 字段名称：salary   字段类型：int       字段长度：4
 * 字段名称：hiredate 字段类型：String    字段长度：30   编码：UTF-8
 * 
 * @author Think
 *
 */
public class FileOpExamDemo {
	public class Emp{
		private String name;
		private int age;
		private String gender;
		private int salary;
		private String hiredate;
		
		public Emp(
				String name, 
				int age, 
				String gender,
				int salary,
				String hiredate) {
			this.name = name;
			this.age = age;
			this.gender = gender;
			this.salary = salary;
			this.hiredate = hiredate;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public String getHiredate() {
			return hiredate;
		}
		public void setHiredate(String hiredate) {
			this.hiredate = hiredate;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			SimpleDateFormat sdf = new SimpleDateFormat(
					"yyyy-MM-dd : HH:mm:ss"
				);
			
			return this.name + "," + this.age + "," + this.gender 
					+ "," + this.salary + "," + sdf.format(this.hiredate);
		}
	}
	
	public static void main(String[] args) throws IOException, URISyntaxException, ParseException {
		// 使用类加载器的方式来寻找文件，路径为编译好的类文件的bin目录下的相对路径
		File file = new File(FileOpExamDemo.class.getClassLoader().getResource("Demo.dat").toURI());
		/*
		File file = new File(
				"." + File.separator + "demo.txt"
			);
			*/
		
		RandomAccessFile raf
		 = new RandomAccessFile(file, "r");
		
		ArrayList <Emp> empList
			= new ArrayList<Emp>();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd : HH:mm:ss");
		
		for (int i = 0; i < 1; i++) {
			// 读取name字符串，读取到的字节都放在data中
			String name = FileOpExamDemo.readString(raf, 32);
			System.out.println(name);
			
			// 读取age
			int age = raf.readInt();
			
			// 读取后面字符·················
			
			// 读取日期
			String hiredate = FileOpExamDemo.readString(raf, 30);
			Date hire = sdf.parse(hiredate);
			
			/*
			 * 新建员工实例，然后添加到员工列表empList中
			 * */
		}
		
		raf.close();
	}
	
	public static String readString(RandomAccessFile handle, int length) throws IOException {
		// TODO Auto-generated method stub
		byte[] data = new byte[32];
		handle.read(data);
		// 指定解析字符集为UTF-8
		String str = new String(data, "utf-8").trim();
		return str;
	}
}
