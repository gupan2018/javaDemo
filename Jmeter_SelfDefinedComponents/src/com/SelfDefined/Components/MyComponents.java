package com.SelfDefined.Components;

import java.security.Policy.Parameters;

import org.apache.jmeter.config.Arguments;//���������������ͷ��ʲ�����
import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;//�Զ���Javaȡ������Ҫ�̳������
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;//Jmeter��������
import org.apache.jmeter.samplers.SampleResult;//���ؽ��


//��Ҫ�Զ���Javaȡ����ʱ�̳�AbstractJavaSamplerClient�࣬�����Ҫ��дHTTPȡ��������̳���������
public class MyComponents extends AbstractJavaSamplerClient{
	private String a;
	private String b;
	
	private String resultData;
	
	//���������������java���������
	//param.addArgument("num1", "");��ʾ��β�����Ϊnum1��Ĭ��ֵΪ��
	
	//���ÿ��ò�����Ĭ��ֵ
	public Arguments getDefaultParameters() {
		Arguments param = new Arguments();
		param.addArgument("num1", "");
		param.addArgument("num2", "");
		return param;
	}
	
	// ÿ���̲߳���ǰִ��һ�Σ���һЩ��ʼ������
	public void setupTest(JavaSamplerContext arg0) {
		
	}
	
	//��ʼ���ԣ���arg0�������Ի�ò���ֵ
	public SampleResult runTest(JavaSamplerContext arg0) {
		a = arg0.getParameter("num1");
		b = arg0.getParameter("num2");
		
		SampleResult sr = new SampleResult();
		sr.setSampleLabel("Java����");
		try {
			sr.sampleStart();
			Hello test = new Hello();
			resultData = String.valueOf(test.sum(Integer.parseInt(a), Integer.parseInt(b)));
			if (resultData != null && resultData.length() > 0) {
				sr.setResponseData("����ǣ�" + resultData, null);
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
		params.addArgument("num1", "1");//��ȡ����num1��ֵ����Ϊ��ȡĬ��ֵ1��������һ��ûɶ��
		params.addArgument("num2", "2");
		JavaSamplerContext arg0 = new JavaSamplerContext(params);//����Jmeter������
		MyComponents test = new MyComponents();
		test.setupTest(arg0);
		test.runTest(arg0);
		test.teardownTest(arg0);
	}
	
}