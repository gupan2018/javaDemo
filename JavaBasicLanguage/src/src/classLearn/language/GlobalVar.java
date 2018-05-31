package src.classLearn.language;

/*
 * (这是定义全局变量的语法
*/

public class GlobalVar {	
	// 定义了全局变量
	private int b;
	private int [] a = new int [3];
	private static int c;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GlobalVar loop = new GlobalVar();
		for (int i : loop.a) {
			System.out.println(i);
		}
		
		c = 4;
		System.out.println(loop.b);
		
		System.out.println(c);
		System.out.println(loop.c); // 会有警告
	}
}
