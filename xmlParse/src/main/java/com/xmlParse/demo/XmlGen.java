package com.xmlParse.demo;

import java.io.FileOutputStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

/**
 * 使用dom文档生成Xml文件
 * 
 * @author gupan
 *
 */
public class XmlGen {
	public static void main(String[] args) {
		List<Emp> emplist = new ArrayList<Emp>();
		
		emplist.add(new Emp(1, "顾攀", 24, "男", 11500));
		emplist.add(new Emp(2, "滚滚", 27, "男", 100012000));
		emplist.add(new Emp(3, "圆滚滚", 30, "男", 1000024500));
		
		/*
		 * 将emplist集合中的员工信心保存到myemp.xml文档中
		 * 
		 * 步骤：
		 * 		1. 创建一个Document对象，表示一个空白的xml文档
		 * 		2. 向Document对象中添加根元素
		 * 		3. 按照应当生成的xml文档的格式逐级向根元素添加子元素以形成xml文档格式
		 * 		4. 创建XmlWriter
		 * 		5. 通过XmlWriter将Document写出
		 */
		XMLWriter xmlWriter = null;
		try {
			// 相当于形成一个新的空白文档，里面只有xml处理命令
			Document document = DocumentHelper.createDocument();
			
			// 在document中添加标签只能添加一次，。addElement返回一个Element实例
			Element rootEle = document.addElement("list");
			
			/*
			 * 将emplist中的每个员工的信息以一个<emp>标签的形式保存到<list>标签中
			 */
			for (Emp emp : emplist) {
				/*
				 * Element提供了相关方法：
				 * Element addElement(String name)
				 * 		向当前标签中添加给定名字的子标签，并将其返回，便于继续操作
				 * 
				 * Element addText(String text)
				 * 		向当前标签中添加文本信息，但会值为当前标签
				 * 
				 * Element addAttribute(String name, String value)
				 * 		向当前标签中添加属性，返回值为当前标签
				 */
				// 添加子标签emp
				Element empEle = rootEle.addElement("emp");
				
				// 向emp中添加name子标签
				Element nameEle = empEle.addElement("name");
				nameEle.addText(emp.getName());
				
				// 向emp中添加age子标签
				empEle.addElement("age").addText(String.valueOf(emp.getAge()));
				
				empEle.addElement("gender").addText(emp.getGender());
				empEle.addElement("salary").addText(String.valueOf(emp.getSalary()));
				empEle.addElement("id").addAttribute("id", String.valueOf(emp.getId()));
			}
			
			FileOutputStream fos = new FileOutputStream("myemp.xml");
			// 第二个参数，自动格式化输出
			xmlWriter = new XMLWriter(fos, OutputFormat.createPrettyPrint());
			xmlWriter.write(document);
			System.out.println("写出完毕");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			if (xmlWriter != null) {
				try {
					xmlWriter.close();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
		
	}
}
