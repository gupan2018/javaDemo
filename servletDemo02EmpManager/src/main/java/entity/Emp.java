package entity;

import java.io.Serializable;

/**
 * 这个类的实体类，用于封装员工信息
 * 
 * 实体类是典型的JavaBean
 * JavaBean（有如下规范的类）：
 * 		1. 有包
 * 		2. 有默认构造器
 * 		3. 实现序列化接口
 * 		4. 有get/set方法
 * 
 * @author gupan
 *
 */
public class Emp implements Serializable{
	/*
	 * 建议：
	 * 	1. 尽量使用封装类型，因为他比基本类型多了null
	 * 	2. 使用Java.sql包下的日期，因为JDBC支持这样的日期类型
	 * */
	private Integer empno;
	private String ename;
	private String job;
	private Double sal;
	
	
	public Integer getEmpno() {
		return empno;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
}
