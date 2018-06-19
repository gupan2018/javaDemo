package com.factoryMethod.demo;
/**
 * 这个类定义了导出数据的接口
 * 
 * @author gupan
 *
 */
public interface ExportFileApi {
	/**
	 * 导出文件内容
	 * @param data 示意：需要保存的数据
	 * @return 是否导出成功
	 */
	public boolean export(String data);
}
