package com.interfaces.language.BankCardSys;

public interface ABC extends UnionPay{
	public boolean payTestBill(String phoneNumber, Double sum );// 支付电话费
}
