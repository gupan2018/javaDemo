package src.classLearn.language;

/*
 * 这是一种比较成熟的类的封装方案
 * */

public class PackageAdv {
	private String age;
	public void setAge(int age){
		this.age = age + "";
	}

	public String getAge(){
		return this.age;
	}
}
