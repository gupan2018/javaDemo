package com.factoryMethod.demo.example;
/**
 * 具体的创建起实现对象，实现创建导出成数据哭备份文件形式的对象
 * 
 * @author gupan
 *
 */
public class ExportDBOperate extends ExportOperate{

	@Override
	protected ExportFileApi factoryMethod() {
		// TODO Auto-generated method stub
		// 创建导出成数据库备份文件形式的对象
		return new ExportDB();
	}

}
