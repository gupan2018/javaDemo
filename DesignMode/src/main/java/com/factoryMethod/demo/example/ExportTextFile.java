package com.factoryMethod.demo.example;
/**
 * 导出成文本文件格式的对象
 * 
 * @author gupan
 *
 */
public class ExportTextFile implements ExportFileApi{

	public boolean export(String data) {
		// TODO Auto-generated method stub
		System.out.println("导出数据" + data + "文本文件");
		return true;
	}

}
