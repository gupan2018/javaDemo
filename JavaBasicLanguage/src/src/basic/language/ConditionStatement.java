package src.basic.language;

/*Switch、IF等条件语法及示例
 * 
 * */

public class ConditionStatement {
	public static void main(String [] args) {
		/*switch语句
			swicth(变量 a){
			case a:
				...
				break;
			
			case b:
				...
				break;
			
			...
			
			default:
				...
				break;
			}
		*/
		
		char score = 'a';
		switch(score){
		case 'a':
			System.out.println("优秀");
			break;
		
		case 'b':
			System.out.println("良好");
			break;
		
		case 'c':
			System.out.println("中等");
			break;
		
		case 'd':
			System.out.println("及格");
			break;
		
		case 'e':
			System.out.println("不及格");
			break;
		
		default:
			System.out.println("无效输入");
			break;
		}
		
		/*if语句
		if (exp1){
			...
		}
		
		else if (exp2){
			...
		}
		
		...
		
		else{
			...
		}
		*/
		
		int a = -1;
		if (a > 0){
			System.out.println("a > 0");
		}
		else{
			System.out.println("a < 0");
		}
	}
}
