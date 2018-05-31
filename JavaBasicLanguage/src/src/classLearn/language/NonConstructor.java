package src.classLearn.language;
/*
 * 这是非构造函数的语法
 * */
public class NonConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonConstructor obj = new NonConstructor();
		obj.nonConstructor();
	}
	
	public void nonConstructor() {
		for (int i =5; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			
			System.out.println("\n");
		}
	}

}
