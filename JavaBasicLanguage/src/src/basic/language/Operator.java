package src.basic.language;
/*
 * 这是运算符的讲解
 * */
public class Operator {

	public static void main(String[] args) {
		/*
		1. 常见运算符基本分类
			算术运算符
			关系运算符	(返回boolean类型)
			逻辑运算符	(返回boolean类型)
			赋值运算符
			其他
		
		2. 算术运算符
			+、-、*、/（加、减、乘、除）
			%（取余数）
			++，--（自增、自减）
		
		2.1 自增、自减运算详解
			++a    	前置自增运算，先完成自增运算，再使用a的值
			a++    	后置自增运算，先使用a的值，再完成自增运算
		
		3. 关系运算符
			==		（等于）
			!=		（不等于）
			>		（大于）
			<		（小于）
			>=		（大于等于）
			<=		（小于等于）
		*/
		int a = 1;
		int b = 2;
		System.out.print(a == b);		// false;
		System.out.print(a != b);			// true;
		System.out.print(a > b);			// false;
		System.out.print(a < b);			// true;
		
		
		/*
		5. 赋值运算符
			=
			+=
			-=
			*=
			/=
			%=
		*/
		
		int a_5 = 1;
		a_5 += 1; 	// a_5 = a_5 + 1;
		a_5 -= 1; 	// a_5 = a_5 - 1;
		a_5 *= 1; 	// a_5 = a_5 * 1;
		a_5 /= 1; 	// a_5 = a_5 / 1;
		a_5 %= 1; 	// a_5 = a_5 % 1;
		
		
		/**
		 *6. 三目运算符
			exp() ? value1 : value2;
			解释：若exp()返回true，则返回value1，否则返回value2.
		*/
		
		int a_6 = 1;
		int b_6 = 2;
		int max = a_6 > b_6 ? a_6 : b_6;
		System.out.print(max);//输出a、b中较大的一个数值
		
		/*
		7. 运算优先级
			1. 括号()；
			2. *，/，%（同一优先级）
			3. +、-（同一优先级）
		
		注：
			1. 同一优先级的运算符的运算顺序为从左至右
			2. 按程序运行结果来看，自增、自减运算符的优先级应高于上述运算符
		*/
	}

}
