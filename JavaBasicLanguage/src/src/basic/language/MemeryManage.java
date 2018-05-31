package src.basic.language;
/*
 * 这个类使用来介绍Java堆栈的管理，以及方法区的作用
 * */
public class MemeryManage {
	int a;
	public void stack(int b) {
		int c;		// 局部变量
		System.out.print("成员变量a：" + a + "\n" +
		"局部变量b：" + b + "\n"
		// 编译错误，因为局部变量没有默认值
		/* + "局部变量c：" + c*/ );
	}
	
	public static void main(String [] args) {
		/* 
		 * 调用堆栈之前，方法区中字节码文件先存在，实际上，他在我们程序开始运行前，java就会通过类装载载入类的字节码文件
		 * 对于MemeryManage来说，方法区中对应的字节码文件内容可以表示如下：
		 * MemeryManage.class{
		 * 	stack(),
		 * 	...
		 * }
		 * 对象的字节码在方法区中只保留一份，无论多少次实例化MemeryManage这个对象，方法区中的字节码文件都不会变化
		*/
		
		// 这一句在JVM中new了一个对象MemeryManage()，由于a是成员变量，所以在对象实例化的过程中就在堆中声明了a，
		// 但是b和c是方法stack中的变量，需要调用时才会声明
		// 定义了一个变量objA指向这个对象的地址
		MemeryManage objA = new MemeryManage();
		
		// 调用了stack()方法，在栈中声明了变量b和c
		objA.stack(3);
		// 方法执行完，栈帧消失，栈帧中的局部变量b和c消失
	}
}
