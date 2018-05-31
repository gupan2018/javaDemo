package com.generics.language;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import javax.print.attribute.standard.PrinterLocation;

/*
 * 这个类讲的是容器的定义和使用
 * 
 * 支持的数据类型：
 * 		引用类型(除数组外)
 * 
 * 语法：
 * 		ArrayList<dataType> list = new ArrayList<String>();
 * 
 * 常用api：
 * 
 * 1 add();
 * 		list.add("hello")
 * 
 * 2 size();
 * 		System.out.println(list.size());
 * 
 * 3 isEmpty();
 * 		System.out.println(list.isEmpty());
 * 
 * 4 get();
 * 		System.out.println(list.get(0));
 * 
 * 5 contains();
 * 		list.contains("hello");
 * 
 * 6 set();
 * 		list.set(0, "world");
 * 
 * 7 clear()
 * 		list.clear();
 * 
 * 8 remove();
 * 		list.remove(0);
 * 
 * 9 toArray();
 * 		Object [] objects = set.toArray();
 * 		for (Object obj : objects){
 * 			System.out.println(obj);
 * 		}
 * 		
 * 10 ierator
 * 		Iterator <String> itr = list.iterator();
 * 
 * */

public class ArrayListDemo {
	public static void main(String [] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("滚滚");
		list.add("加油");
		list.add("加油");
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + "   ");
		}; 
		
		// 为避免代码的耦合，写了一个第三方类进行比较
		MyComparator com = new MyComparator();
		Collections.sort(list, com);

		System.out.print("排序后");
		System.out.println(list);
		
		
		// 也可以使用匿名函数的方式，通过内部类的方式进行比较
		Comparator<String> com01 = new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		};
		
		list.add("又来个字符串");
		list.add("气不气");
		
		
		System.out.print("排序前：");
		System.out.println(list);
		
		Collections.sort(list, com01);
		
		System.out.print("排序后：");
		System.out.println(list);
		
		// 实现自定义对象的排序
		// 重写了compareTo方法后，调用sort方法，可以对对象排序
		ArrayList<Point> list2 = new ArrayList<Point>();
		list2.add(new Point(1, 2));
		list2.add(new Point(2, 3));
		list2.add(new Point(2, 1));
		list2.add(new Point(0, 1));
		list2.add(new Point(3, 3));
		
		System.out.println("排序前：");
		System.out.println(list2);
		
		Collections.sort(list2);
		
		System.out.println("排序后：");
		System.out.println(list2);
		
		//
	}

}

/**
 * 为了直接在对象中重写compare，这采用了第三方类的方法来比较
 * @author Think
 *
 */
class MyComparator implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.length() - o2.length();
	}
}
