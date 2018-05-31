package com.interfaces.language.BankCardSys;

public class ABCImpl implements ABC{
	// 查询余额
	public double getBalance() {return 0.0;}; 
	// 取钱
	public boolean drawMoney(double number) {return true;}; 
	// 检查密码是否正确
	public boolean checkPwd(String input) {return true;}; 
	// 支付电话费
	public boolean payTestBill(String phoneNumber, Double sum ) {return true;};
}
