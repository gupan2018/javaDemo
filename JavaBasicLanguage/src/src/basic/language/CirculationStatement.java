package src.basic.language;
/*
 * For、While等循环语句代码示例类
 * */
public class CirculationStatement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*For循环
			for (exp1; exp2; exp3){
				FuncBody;
			}
			
		*/
		
		for (int i = 0; i < 10; i++){
			System.out.println(i);
		}
		
		/*增强式for循环
		语法：
		
		for (Type Value: Arr){
		loopBody;
		}
		
		对于增强型for循环而言，定义Value的Type时需要与Arr的元素类型相同，
		在每次for循环的开始，都把Value的值置为对应数元素的值。
		*/
		
		/*While循环
			
			普通while循环
			while(exp){
				FuncBody;
			}
			
			do while循环
			do{
				FuncBody;
			}while(exp);
		*/
		
		int a = -1;
		do{
			System.out.println(a);
		}while(a > 0 & a < 10);

		while(a > 0 & a < 10){
			System.out.println(a);
		}
		
	}

}
