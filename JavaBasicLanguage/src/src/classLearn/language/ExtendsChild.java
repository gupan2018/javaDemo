package src.classLearn.language;

/*
 * 这个系列讲了继承的用法，这是子类
 * */

public class ExtendsChild extends ExtendsParent{
	public static void main(String [] args){
		ExtendsChild husky = new  ExtendsChild ();
		husky.favour();
	}
	public void favour(){
		System.out.println("Female Dog");
	}
	
	public void func1(){
		System.out.println("This is class Child");
	}
}
