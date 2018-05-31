package src.basic.language;

/*
 * 这是变量定义和输出的示例类
 * */
public class Variables {
	public static void main(String [] args) {
		/* 整形变量定义及输出
		*/
		
		System.out.println("*******************************************整形变量定义及输出*************************************");
		
		int x = 1;
		int y = 1;
		
		// 注意下面两句语句输出的区别
		System.out.println("x + y = " + (x + y));
		System.out.println("x +_y" + x + y);
		
		System.out.println("=============================================示例代码结束=============================================\n");
		
		
		/*类型提升和强制转换
		*/
		System.out.println("*******************************************类型提升和强制转换*************************************");
		
		// 在java中声明一个小数时，默认提升为double类型，此为类型提升。如下语法报错
		//float a = 3.24;
		
		
		// 想要定义一个float类型的变量，需要进行强制转换
		float a = 3.24f;
		float b = (float)3.24;
		System.out.println("=============================================示例代码结束=============================================\n");
		
		
		/*基本数据类型定义操练
		 
		a) 逻辑类型
			布尔类型：boolean    true/false
		
		b) 整形
			字节型：byte   1个字节
			短整形：short    2个字节
			整形：int     4个字节
			长整形：long    8个字节
			
		c) 浮点型
			单精度的浮点型：float    4个字节
			双精度的浮点型：double    8个字节
			
		d)字符型
			字符型：char    1个字节
		*/
		System.out.println("*******************************************基本数据类型定义操练*************************************");
		boolean bool_a = true;
		byte byte_b = 1;
		short c = 2;
		int d = 3;
		long e = 4;
		float f = 2.3f; //（定义一个类型时，强制提升为double类型）
		double g = 23.3;
		char h = 's';
		System.out.println("=============================================示例代码结束=============================================\n");
		
		/*引用类型定义操练
		 
		引用类型分类
			a) 数组
			b) 类
			c) 接口
			d) 枚举
		
		字符串String
			a) 基本语法
			String VarName = "...";
			b) 字符串拼接规则
			字符串可以和任意类型的数据进行拼接得到新的字符串，拼接符号为“+”。
			e.g. 1
			"hello" + "world"==>helloworld
			e.g. 2
			"hello" + 0923 ==> hello0923
		
		数组
			a)概念
			一种数据结构，是一个容器，用来盛放数据，不同类型的数组可以盛放不用类型的数据
			b)数组的分类
			一维数组
				数据类型 [] 数组名 = new 数据类型 [Size];
				数据类型 [] 数组名 = new int [] {...};
				数据类型 [] 数组名 = {...};
			
			二维数组
				float[][] numthree;             //定义一个float类型的2维数组
				numthree=new float[5][5];       //为它分配5行5列的空间大小
				numthree[0][0]=1.1f;            //通过下标索引去访问     1行1列=1.1
				long[][] numfive=new long[5][];     //定义一个long类型的不规则数组
				numfive[0]=new long[5];             //为第1行分配5列
				
				//定义double型的数组分配3行3列的空间同时赋值
				double[][] numsix={{1.111D,2.222D,3.333D},{4.444D,5.555D,6.666D}};
				int[][] numseven=new int[][]{{10,20,30},{40,50},{60}};
			
		*/
		int [] myArr01 = new int [3];
		int [] myArr02 = new int [] {0, 1, 2};
		int [] myArr03 = {'a', 1, 2};//'a'的ASCALL码为整数
		for (int i = 0; i < 3; i++) {
			System.out.println(myArr03[i]);
		}
		
		System.out.println("=============================================示例代码结束=============================================\n");
	}
}
