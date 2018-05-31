package src.basic.language;
/*
 * 这里主要将了函数的用法，还有public、protect、default以及private的访问级别
 * */

/*
public：
	Java语言中访问限制最宽的修饰符，一般称之为“公共的”。被其修饰的类、
	属性以及方法不仅可以跨类访问，而且允许跨包（package）访问。
	
private: 
	Java语言中对访问权限限制的最窄的修饰符，一般称之为“私有的”。被其修饰的类、
	属性以及方法只能被该类的对象访问，其子类不能访问，更不能允许跨包访问。
	
protect:
	介于public 和 private 之间的一种访问修饰符，一般称之为“保护形”。被其修饰的类、
	属性以及方法只能被类本身的方法及子类访问，即使子类在不同的包中也可以访问。
	
default：
	即不加任何访问修饰符，通常称为“默认访问模式“。该模式下，只允许在同一个包中进行访问。

注：
	default为默认类型的修饰符，在定义全局变量时，若没有写修饰符，那么默认是default类型。
	default不用写，写了报错
*/

public class Function {
	
	private int [] a = new int [3];
	
	public static void main(String [] args) {
		Function loop = new Function();
		int b [] = {1, 2, 3};
		
		for (int i : loop.a) {
			loop.setValue(b);
			System.out.println(i);
			/*
			打印结果0, 2, 3，注意语法分析
			*/
		}
		
	}
	
	public void setValue(int [] a) {
		this.a[0] = a[0];
		this.a[1] = a[1];
		this.a[2] = a[2];
	}
}
