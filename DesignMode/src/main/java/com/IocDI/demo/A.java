package com.IocDI.demo;
/**
 * 使用控制反转/依赖注入案例
 * 
 * @author gupan
 *
 */
public class A {
	/**
	 * 等待别注入进来
	 */
	private C c = null;
	
	/**
	 * 注入资源C的方法
	 * 
	 * @param c 被注入的资源
	 */
	public void setC(C c) {
		this.c = c;
	}
	
	public void t1() {
		// 这里需要使用c，可是又不让主动创建C了
		// 要求从外部注入，这样就更省心
		// 自己不用管怎么获取C，直接使用即可
		c.tc();
	}
}
