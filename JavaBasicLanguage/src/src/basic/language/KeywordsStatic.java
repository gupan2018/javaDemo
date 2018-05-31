package src.basic.language;

import java.util.HashSet;
import java.util.Iterator;

/*
 * 这个类主要讲了Static关键字的用法
 * */

/*
 * 1 用法
 * 		修饰属性、方法等
 * 
 * 2 static修饰成员特点
 * 		1）被声明为static的成员在内存中只保存了一份，存储在方法区中
 * 		2）被声明为static的成员会在类加载的时候加载进内存，而其他非静态成员是在创建对象的时候才会去分配内存
 * 		3） 被static修饰的成员可以直接通过类名来访问，因为它们不依赖于对象
 * 		4）对于一些不常改变的对象可以声明成静态的成员，这样就可以共享这一份资源，而且不会浪费内存
 * 		5）一些工具方法适合声明成静态的，因为可以直接拿来调用，更方便，但是不是所有的方法都适合声明成静态的，因为静态成员的生命周期长
 * 		6) 对于静态变量，可以通过类名和引用来访问，建议通过类名来访问，不建议通过引用来访问
 * 		7) 静态方法，没有隐式this，所以在静态方法中无法方位实例中的变量，方法。实例方法传入了隐式this，可以访问实例的属性和变量
 * 		8）静态方法应用场景： 操作与参数有关于对象无关（对对象属性没有做操作）时，定义为静态方法，例如Arrays.sort()。也就是说static方法的作用在于提供一些"工具方法"和"工厂方法"
 * */

public class KeywordsStatic {
	static int paramStatic = 0;
	int paramClass;
	
	// 定义了一个静态块
	static {
		// 存储在方法区中，在类加载的时候执行的代码块
		System.out.println("静态块执行");
	}
	
	public static void main(String [] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("滚滚");
		set.add("加油");
		set.add("向前滚");
		
		// 对于static的方法、属性，可以不对类进行实例化，也可以调用
		KeywordsStatic.traverSetWithList(set);
		KeywordsStatic.traverseWithIterator(set);
		
		// 被声明为static的成员在内存中只保存了一份，如果在一个地方修改了这个静态变量的值，那么其他对象引用这个属性的值也会做对应的修改
		
		/*
		 * 这里例子省略，可以在备调用的类中声明一个static变量，之后在本类中实例化两个这个类型的变量来做观察
		 * */
	}
	
	public static void traverSetWithList(HashSet <String> set) {
		Object [] objs = set.toArray();
		for (Object obj : objs) {
			System.out.println(obj);
			set.add("再滚一次");
		}
		System.out.println();
		
	}
	
	public static void traverseWithIterator(HashSet <String> set) {
		// 在静态方法中，没有饮食的传入this，下面这条语句报错
		// this.paramClass = 1;
		
		// 静态属性通过类名.属性来确定
		KeywordsStatic.paramStatic = 20;
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
	}
	
	public void testStatic() {
		this.paramClass = 20;
		KeywordsStatic.paramStatic = 30;
	}
	
}
