package com.xmlParse.demo;
/**
 * emplist信息解析
 * 
 * @author gupan
 *
 */
public class Emp  {
	private int id;
	private String name;
	private int age;
	private String gender;
	private int salary;
	
	public Emp() {
		// TODO Auto-generated constructor stub
	}
	
	public Emp(int id, String name, int age, String gender, int salary) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + this.name + this.age + this.gender + this.salary;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
