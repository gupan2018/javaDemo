package com.exceptionHandle.language;
/**
 * 这个类主要讲了throw的用法
 * 
 * @author Think
 *
 */
public class ThrowDemo{	
	public static void main(String[] args) {
		Person p = new Person("滚滚");
		try{
			p.setAge(-1);
		}catch (RuntimeException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch (SelfDefException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		catch(Exception e){
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
