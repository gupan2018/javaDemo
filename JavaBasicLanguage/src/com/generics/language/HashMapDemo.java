package com.generics.language;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 这个类介绍了HashMap的用法
 * 
 * 支持的数据类型：
 * 		引用类型(除数组外)
 * 
 * 基本语法：
 * 		HashMap <type, type> map = new HashMap <type, type> ();
 * 
 * 常用api
 * 1 put();
 * 		map.put("name", "yuangungun");
 * 
 * 2 size();
 * 		System.out.println(map.size());
 * 
 * 3 get();
 * 		System.out.println(map.get("name"));
 * 
 * 4 remove();
 * 		map.remove("name");
 * 
 * 5 containsKey();
 * 		map.containsKey("hxiusa");
 * 
 * 6 containsValue();
 * 		map.containsValue("gp");
 * 
 * 7 keySet();
 * 		Set <String> set = map.keySet();
 * 		for (String obj : set){
 * 			System.out.println(obj);
 * 		}
 * 
 * 8 values();
 * 		Collection <String> col = map.values();
 * 		for (String obj : col){
 * 			System.out.println(col);
 * 		}
 * 
 * 
 * 
 * */

public class HashMapDemo {
	public static void main(String [] args) {
		HashMap <String, String> map = new HashMap <String, String> ();
		map.put("name", "yuangungun");
		map.put("age", "12");
		map.put("gender", "男");
		System.out.println(map.size());
		
		// 遍历HashMap
		
		// 1. 利用keySet()和get方法遍历HashMap
		Set <String> keys = map.keySet();
		for (String key : keys){
			System.out.println(key + ':' + map.get(key));
		}
		
		// 2. 利用entrySet方法遍历HashMap
		Set <Entry<String, String>> entries = map.entrySet();
		for (Entry<String, String> entry : entries){
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		
	}
}
