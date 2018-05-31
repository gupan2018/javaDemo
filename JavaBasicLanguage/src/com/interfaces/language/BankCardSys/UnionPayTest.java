package com.interfaces.language.BankCardSys;

/*
 * 一个银行系统接口案例
 * */

public class UnionPayTest{
	public static void main(String [] args) {
		ICBCImpl card1 = new ICBCImpl(); // 工行卡
		ICBC card2 = new ICBCImpl(); 
		UnionPay card3 = new ICBCImpl(); 
	}
}