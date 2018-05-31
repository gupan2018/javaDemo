package src.classLearn.language;

/*
 * 这个类主要讲了多态的用法以及案例
 * */

/*
 * 多态现象描述：
 * 		若有两个类，为父子关系，类B重写了类A的函数func1()，若想要实现传入父类参数则调用父类的func1()，
 * 传入子类参数调用子类的func1()。这种思想叫做多态。
 * 
 * */

public class ExtendsPolym{
	
	public static void main(String [] args) {
		ExtendsParent parent = new ExtendsParent();
		ExtendsChild child = new ExtendsChild();
		
		ExtendsPolym test = new ExtendsPolym();
		if (parent instanceof ExtendsParent) {
			test.func2(parent);
		}
		if (child instanceof ExtendsChild) {
			test.func2(child);
		}
	}
	
	// 要实现多态，需要传入父类对象
	public void func2(ExtendsParent obj) {
		obj.func1();
	}

}
