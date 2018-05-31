package src.classLearn.language;

/*
 * 这个系列讲了继承的用法，这是父类
 * */

public class ExtendsParent {
	int age;
	boolean sex;
	int paraTestSupert = 10;
	
	// 定义有参构造函数
	public ExtendsParent(int a) {
		// TODO Auto-generated constructor stub
	}
	
	// 定义无参构造函数
	public ExtendsParent() {
		// TODO Auto-generated constructor stub
	}
	
	public void favour(){
		System.out.println("bone");
	}
	
	public void printTest() {
		System.out.println("这是在父类中");
		System.out.println(this.paraTestSupert);
	}
	
	public void func1(){
		System.out.println("This is class Parent");
	}
}
