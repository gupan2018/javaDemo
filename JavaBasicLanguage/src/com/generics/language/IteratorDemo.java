package com.generics.language;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 这个类讲的是迭代器的定义和使用
 * 
 * 常用api
 * 1. hasNext();
 * 		if (iterator.hasNext()){}
 * 
 * 2. next();
 * 		while (iterator.hasNext()){
 * 			System.out.println(iterator.next());
 * 		}
 */

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("滚滚");
		list.add("加油");
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + "   ");
		}; 
	}

}
