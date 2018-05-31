package src.classLearn.language;

import javax.management.remote.SubjectDelegationPermission;

/*
 * 这个类主要讲了类继承时super关键字的用法
 * */
public class ExtendsSuperUsage extends ExtendsParent{
	int paraTestSupert = 20;
	ExtendsSuperUsage(int a) {
		// 父类有两个构造函数（一个有参构造函数，一个无参构造函数）
		// 如果没有定义子类的构造函数，那么子类会默认调用父类的无参构造函数

		// 调用父类的有参构造函数，super调用父类的无参构造函数
		super(a);
	}
	
	public void printTest() {
		System.out.println("这是在子类中");
		System.out.println(this.paraTestSupert);
		System.out.println(super.paraTestSupert);
	}
	
	public void print() {
		this.printTest();
		super.printTest();
	}
	
	public static void main(String[] args) {
		ExtendsSuperUsage obj = new ExtendsSuperUsage(3);
		obj.print();
		System.out.println();
	}
}
