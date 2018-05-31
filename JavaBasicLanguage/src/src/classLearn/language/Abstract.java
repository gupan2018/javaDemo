package src.classLearn.language;
/*
 * 这个类主要讲了abstract抽象方法和抽象类 
 * */

//*************************************************************抽象方法案例讲解************************************************************

//抽象方法问题引出：
/*
 * 		在下面的类Cubic和Circle中，理应有一个变量area来记录图形的值，此外，也应有一个方法calcArea()来获取图形的面积，这个方法应该
 * 定义在基类中，由子类重写，实现代码的课扩展性，但是如果基类定义一个空函数不实现任何功能，又违背的Java方法使用的初衷，所以需要一种方式，
 * 实现在基类中声明这是一个方法，但不实现任何内容，子类必须实现它，这就是抽象方法概念引出的初衷。
 * 
 * */

class Shape{
	double basicData;
	double area;
	double calcArea(){
		// 计算面积细节
		return this.area;
	}
}
class Cubic extends Shape{
	// 矩形
}
class Circle extends Shape{
	// 圆
}

// 开始定义抽象方法：
/*
 * 1. 抽象方法有abstract修饰
 * 2. 只有方法的定义，没有方法的实现（没有大括号）
 * 3. 抽象方法必须定义在抽象类中
 * */

// 抽象方法必须定义了抽象类中
/*
 * 抽象类使用：
 * 
 *     1. 由于抽象类中的抽象方法并不完成，所以**抽象类不能被实例化，但是可以声明**；
 *     2. 抽象类想要实现功能，都是需要被继承的；
 *     3. 子类继承了抽象类，必须**实现父类的抽象方法**或者**将父类的抽象方法也定义为抽象的方法**（但是这种方式，子类不能被实例化，**并不常用**）
 *     4. 抽象类意义
 *     		1. 博涵公共的属性和行为，被子类所共享
 *     		2. 为所有子类提供一种统一的类型（**向上造型**）
 *     		3. 包含抽象方法，为子类提供一个统一的入口（**接口**），子类有不同的实现
 * */

abstract class AdvShape{
	double basicData;
	double area;
	// 定义了一个抽象方法
	abstract double calcArea();
}

abstract class Adv2Shape extends AdvShape{
	// 声明父类的抽象方法，但是这个类不能被实例化
	abstract double calcArea();
}

class AdvCubic extends AdvShape{
	// 矩形
	// 父类定义的抽象方法，子类必须实现
	double calcArea() {
		// 计算面积细节
		return this.area;
	}
	
}
class AdvCircle extends AdvShape{
	// 圆
	// 父类定义的抽象方法，子类必须实现
	double calcArea() {
		// 计算面积细节
		return this.area;
	}
}

//***********************************************************抽象方法案例讲解结束************************************************************

public class Abstract {
	public static void main(String [] args) {
		
	}
	
}
