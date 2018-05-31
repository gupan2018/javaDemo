package src.classLearn.language;

import java.awt.print.Printable;

/*
 * 这是构造函数的语法
 * */

/*
 * 说明：构造函数调用后规则
 * 
 * 1）构造函数的调用是在创建对象时进行调用
 * 		ClassName ObjName = new ClassName();
 * 		ClassName ObjName = new ClassName(value1, value2,..);
 * 
 * 2) 调用有参构造函数创建对象时，可以按照意愿对对象的属性进行初始化；调用无参构造函数创建对象时，其所有对象的属性值都是默认值
 * 		(无参构造函数建议在其中进行初始化工作)
 * 
 * 3) 在没有写构造函数时，java编译器会提供一个默认的无参构造函数，但是在写了有参构造函数是，那么java编译器就不会提供无参构造函数，
 * 		此时利用无参构造函数来创建对象，便找不到对应的函数，所以需要手动添加一个无参构造函数。
 * */


public class Constructor {
	
	private int a;
	private int b;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor obj1 = new Constructor();
		
		System.out.println("obj1:" + obj1.a + "，" + obj1.b);
		
		Constructor obj2 = new Constructor(1, 2);
		System.out.println("obj2:" + obj2.a + "，" + obj2.b);
		
		// 调用set和get方法修改无参构造函数的值
		obj1.setA(100);
		System.out.println(obj1.getA());
		

	}
	
	// 有参构造函数使用举例
	public Constructor(int a, int b) {
		// TODO Auto-generated constructor stub
		this.a = a;
		this.b = b;
	}
	
	// 无参构造函数使用举例
	
	/*
	 * 1） 在无参构造函数中写入初始化数据后，每次调用无参构造函数都会初始化都会创建属性相同的对象。一般而言，为了减少代码的耦合，
	 * 		在无参构造函数中不建议写入任何初始化代码，而是通过set方法去对对象属性进行初始化。
	 * 
	 * 2） 通过对象访问属性时，最好调用get方法进行访问，通过对象访问属性。这样做的原因是：在类的相互调用中，属性一般是private的，
	 * 		而方法一般是public的，private只能在类的内部进行访问，但是不能在类的外部对private的属性进行访问。
	 * */
	
	public Constructor() {
		this.a = 10;
		this.b = 20;
	}
	
	public void setA (int a){
		this.a = a;
	}
	
	public void setB (int b){
		this.b = b;
	}
	
	public int getA (){
		return this.a;
	}
	
	public int getB (){
		return this.b;
	}	
}
