package com.generics.language;

import java.util.HashSet;

/**
 * 介绍HashSet用法
 * 
 * 支持的数据类型：
 * 		引用类型(除数组外)
 * 
 * 基本语法：
 * 		HashSet <String> set = new HashSet <String> ();
 * 
 * 常用API：
 * 		基本同ArrayList，但是没有get()函数。与ArrayList有区别的API如下
 * 
 * remove();
 * 		移除指定元素，与ArrayList不同的是ArrayList传入的参数是索引值，HashSet传入的是对应数据
 * 		set.remove(1);
 */
public class HasSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		set.add("滚滚");
		set.add("加油");
		set.add("顺利");
		set.add("小猪");
		set.add("健康");
		set.add("不感冒");
		
		// 元素不可重复，若有重复元素，只记录一个
		set.add("不感冒");
		
		Object[] objs = set.toArray();
		for (Object obj : objs) {
			System.out.println(obj);
		}
	}

}
