package com.interfaces.language.BankCardSys;

/*
 * 工行接口 
 **/

public interface ICBC extends UnionPay{
	public void payOnline(double number); // 在线支付
}
