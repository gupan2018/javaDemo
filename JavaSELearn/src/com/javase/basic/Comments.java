package com.javase.basic;

/**
 * 类功能说明
 * The <code>String</code> class represents character strings ...
 * ... ... ...
 * 
 * 注释文档说明：
 * 		文档注释可以对类、方法、常量进行修饰（注意，没有变量）
 * 		文档注释最终可以被javadoc命令锁解析，然后生成一个文档手册
 * 
 * @Author Gupan  作者
 * @version 1.0, 27/09/18  版本
 * @see java.lang.StringBuffer  参考
 * @since JDK1.0  始于JDK版本（从JDK多少版本之后才能开始用 ）
 * 
 */
public class Comments {
	/**
	 * sayHello方法中用到的问候语
	 */
	public static final String INFO = "你好";
	
	/**
	 * 为指定的用户添加一个问候语
	 * @param name 指定的用户的名字
	 * @return 添加问候后的字符串
	 */
	public static String sayHello(String name) {
		return INFO + name;
	}
	
}
