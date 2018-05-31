package src.basic.language;

/*
 * 这个类主要是讲了static final关键字的用法
 * 	 	1. static public修饰的变量必须在声明时就赋值
 * 		2. 访问static public修饰的常量和static关键字修饰的静态变量相同
 * 		3. static public修饰的常量不可改变
 * 		4. 建议常量所有字母都大写
 * 		5. 在编译时会自动替换为具体的值，相当于C和C++里面的宏，执行效率较高
 * */

class KeywordsStaticFinal {
	public static void main(String [] args) {
		// 在编译时，程序还未执行前，KeywordsStaticFinal.PI被替换为3.14159
		// 这句话和System.out.println(3.14159)是一样的，由于少了一步转换的操作，使用常量程序运行效率更高
		System.out.println(KeywordsStaticFinal.PI);
	}
	
	public static final double PI= 3.14159;
	
	// 编译错误，static public修饰的变量必须在声明时就赋值
	// public staic final int NUM;
}


