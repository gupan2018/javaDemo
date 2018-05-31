package com.interfaces.language.BankCardSys;

/*
 * 银联接口
 * */

public interface UnionPay {
	public double getBalance(); // 查询余额
	public boolean drawMoney(double number); // 取钱
	public boolean checkPwd(String input); // 检查密码是否正确
}
