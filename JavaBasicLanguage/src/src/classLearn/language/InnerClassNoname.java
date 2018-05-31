package src.classLearn.language;

public interface InnerClassNoname {
	public void show();
}

class Test{
	public static void main(String [] args) {
		
		
		final int num = 5;
		
		/*
		 * 1. 创建了一个InnerClassNoname的一个子类，这个类没有名字
		 * 2. 为这个类创建了一个对象，该对象的引用为obj
		 * 3. 大括号中为该子类的类体
		 * */
		InnerClassNoname obj1 = new InnerClassNoname() {
			public void show() {
				System.out.println("This is in Inner");
				System.out.println(num);// num需加final，如果不加final有些jdk版本会报错
			};
		};
		obj1.show();
	}
}
