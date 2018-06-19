package com.factoryMethod.demo.example;
/**
 * 导出数据到数据库
 * 
 * @author gupan
 *
 */
public class ExportDB implements ExportFileApi{

	public boolean export(String data) {
		// TODO Auto-generated method stub
		System.out.println("导出数据" + data + "数据库备份");
		return true;
	}

}
