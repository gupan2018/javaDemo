package com.SelfDefined.Components;

import java.security.Policy.Parameters;

import org.apache.jmeter.config.Arguments;//这个类是用来定义和访问参数的
import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;//自定义Java取样器需要继承这个类
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;//Jmeter的上下文
import org.apache.jmeter.samplers.SampleResult;//返回结果


//需要自定义Java取样器时继承AbstractJavaSamplerClient类，如果需要重写HTTP取样器，则继承其他的类
public class MyComponents extends AbstractJavaSamplerClient{
	private String a;
	private String b;
	
	private String resultData;
	
	//这个方法用来定义java方法的入参
	//param.addArgument("num1", "");表示入参参数名为num1，默认值为空
	
	//设置可用参数及默认值
	public Arguments getDefaultParameters() {
		Arguments param = new Arguments();
		param.addArgument("num1", "");
		param.addArgument("num2", "");
		return param;
	}
	
	// 每个线程测试前执行一次，做一些初始化工作
	public void setupTest(JavaSamplerContext arg0) {
		
	}
	
	//开始测试，从arg0参数可以获得参数值
	public SampleResult runTest(JavaSamplerContext arg0) {
		a = arg0.getParameter("num1");
		b = arg0.getParameter("num2");
		
		SampleResult sr = new SampleResult();
		sr.setSampleLabel("Java请求");
		try {
			sr.sampleStart();
			Hello test = new Hello();
			resultData = String.valueOf(test.sum(Integer.parseInt(a), Integer.parseInt(b)));
			if (resultData != null && resultData.length() > 0) {
				sr.setResponseData("结果是：" + resultData, null);
				sr.setDataType(SampleResult.TEXT);
			}
			sr.setSuccessful(true);
		} catch (Throwable e) {
			sr.setSuccessful(false);
			e.printStackTrace();
		} finally {
			sr.sampleEnd();
		}
		
		
		return sr;
	}
	
	public void teardownTest(JavaSamplerContext arg0) {
		
	}
	
	public static void main(String[] args ) {
		Arguments params = new Arguments();
		params.addArgument("num1", "1");//获取变量num1的值，若为空取默认值1，我试了一下没啥用
		params.addArgument("num2", "2");
		JavaSamplerContext arg0 = new JavaSamplerContext(params);//创建Jmeter上下文
		MyComponents test = new MyComponents();
		test.setupTest(arg0);
		test.runTest(arg0);
		test.teardownTest(arg0);
	}
	
}
