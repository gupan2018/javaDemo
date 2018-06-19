package com.factoryMethod.demo.example;

public class ExportTextFileOperate extends ExportOperate{
	/**
	 * 具体的创建器实现对象，实现创建导出成文本格式的对象
	 * 
	 */
	@Override
	protected ExportFileApi factoryMethod() {
		// TODO Auto-generated method stub
		// 创建导出成文本文件格式的对象
		return new ExportTextFile();
	}

}
