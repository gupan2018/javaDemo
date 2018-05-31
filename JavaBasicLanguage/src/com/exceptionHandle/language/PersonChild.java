package com.exceptionHandle.language;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * 这个类主要讲了当业务子类继承父类，父类定义了异常处理函数时子类对这些函数的处理规则
 * 
 * @author Think
 *
 */

public class PersonChild extends Person{
	public PersonChild(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	
	// **********************************************允许情况**********************************************
	// 不处理异常
//	public void setAge(int age){
//	}
	
	// 可仅抛出父类方法中抛出的部分异常
//	public void errThrowsDemo() throws IOException{
//		
//	}
	
	// 可以抛父类抛出异常的子类型的异常
//	public void errThrowsDemo() throws FileNotFoundException{
//		
//	}
	
	// **********************************************不允许情况**********************************************
	
	// 不能抛出额外的异常
//	public void errThrowsDemo() throws SQLException{
//		
//	}
	
	// 不可以抛出父类抛出异常的父类
//	public void errThrowsDemo() throws Exception{
//		
//	}
	
}
