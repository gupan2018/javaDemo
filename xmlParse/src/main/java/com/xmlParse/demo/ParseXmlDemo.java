package com.xmlParse.demo;

import java.util.List;
import java.io.FileInputStream;
import org.dom4j.Attribute;
import java.util.ArrayList;

import org.dom4j.Element;

import org.dom4j.Document;
import org.dom4j.io.SAXReader;

/**
 * 解析xml语句的的类，解析emplist.xml文档，将所有员工的信息读取出来，转换为若干Emp实例，存入一个list集合中
 * 
 * 流程
 * 1. 创建SAXReader
 * 2. 使用SAXReader读取XML文档并返回Document对象
		> 这一步是DOM解析最消耗资源的体现，因为DOM将XML文档全部读取并以一个XML文档全部读取，并以一个Document对象形式存于内存中
 * 3. 根据Document对象获取根元素
 * 4. 按照xml的结构从根元素中开始逐级获取子元素已达到遍历xml的目的
 * 
 * 对标签的操作
 * 
 * @author gupan
 *
 */
public class ParseXmlDemo {
	public static void main(String[] args) {
		try {
			// 创建SAXReader
			SAXReader reader = new SAXReader();
			// 使用SAXReader读取XML文档并返回Document对象
			Document dom = reader.read(
				new FileInputStream("emplist.xml")
			);
			// 根据Document对象获取根元素(根标签，可通过根标签获取子元素)
			Element root = dom.getRootElement();
			
			List<Emp> emplist = new ArrayList<Emp>();
			
			// 获取root下的所有子标签
			List<Element> elements = root.elements();
			// 遍历所有<emp标签，解析出员工信息>
			for (Element empEle : elements) {
				Element nameEle = empEle.element("name");
				String name = nameEle.getTextTrim();// 去掉文本两端的空白
				
				Element ageEle = empEle.element("age");
				int age = Integer.parseInt(ageEle.getTextTrim());// 去掉文本两端的空白
				
				Element genderEle = empEle.element("gender");
				String gender = genderEle.getTextTrim();// 去掉文本两端的空白
				
				Element salaryEle = empEle.element("salary");
				int salary = Integer.parseInt(salaryEle.getTextTrim());// 去掉文本两端的空白
				
				Attribute attr = empEle.attribute("id");
				int id = Integer.parseInt(attr.getValue());
				
				Emp emp = new Emp(id, name, age, gender, salary);
				emplist.add(emp);
			}
			
			for (Emp emp : emplist) {
				System.out.println(emp);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
