package entity;

import java.io.Serializable;

public class Course implements Serializable {
	private Integer courseId;
	private String name;
	private Integer days;
	
	/*
	 * 1. 和get/set对象的属性叫bean属性
	 * 2. 通过get/set反应出来的我们以为的属性叫bean属性
	 * 3. 去掉get并将首字母小写的属性是bean属性
	 * 
	 * Bean属性通常都和对象属性一致,也可以修改为不一致
	 * 
	 * */
	public Integer getId() {
		return courseId;
	}
	public void setId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getDays() {
		return days;
	}
	public void setDays(Integer days) {
		this.days = days;
	}
	
	
}
