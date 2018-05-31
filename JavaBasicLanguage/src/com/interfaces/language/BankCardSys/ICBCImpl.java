package com.interfaces.language.BankCardSys;

public class ICBCImpl implements ICBC{
	// 查询余额
	public double getBalance() {return 0.0;}; 
	// 取钱
	public boolean drawMoney(double number) {return true;}; 
	// 检查密码是否正确
	public boolean checkPwd(String input) {return true;}; 
	// 在线支付
	public void payOnline(double number) {}; 
}
