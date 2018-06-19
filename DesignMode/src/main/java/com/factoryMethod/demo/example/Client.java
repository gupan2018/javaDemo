package com.factoryMethod.demo.example;
/**
 * 客户端调用接口，完成功能
 * 
 * @author gupan
 *
 */
public class Client {
	public static void main(String [] args) {
		// 创建需要使用的Creater对象
		ExportOperate operate = new ExportDBOperate();
		// 调用数据输出的功能方法
		operate.export("测试数据");
	}
}
