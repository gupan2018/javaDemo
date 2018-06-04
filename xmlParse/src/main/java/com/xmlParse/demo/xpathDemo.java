package com.xmlParse.demo;

import java.util.List;
import java.io.FileInputStream;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.jaxen.*;


public class xpathDemo {
	public static void main(String[] args) {
		try {
			SAXReader reader = new SAXReader();
			Document document = reader.read(new FileInputStream("myemp.xml"));
			/*
			 * Ducument支持使用xpath检索数据，前提是必须引入jaxen这个jar包
			 * 
			 */
			String xpath="/list/emp[salary>11500]/name";
			List<Element> list = document.selectNodes(xpath);
			for (Element ele : list) {
				System.out.println(ele.getName() + ":" + ele.getText());
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
