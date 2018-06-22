package entity;

import java.io.Serializable;

public class Student implements Serializable {
	private String name;
	private Integer age;
	private String sex;
	private String[] intrests;
	private Course course;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String[] getIntrests() {
		return intrests;
	}
	public void setIntrests(String[] intrests) {
		this.intrests = intrests;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
}
