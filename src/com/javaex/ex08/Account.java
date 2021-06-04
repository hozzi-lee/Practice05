package com.javaex.ex08;

public class Account {

	private String accountNo;
	private int balance;

	//생성자 작성
	public Account(String accountNo) {
		this.accountNo = accountNo;
	}


	//필요한 메소드 작성
	public int deposit(int balance) {
		this.balance += balance;
		System.out.println("입금 후 잔고>"+this.balance);
		return balance;
	}

	public int withdraw(int balance) {
		this.balance -= balance;
		System.out.println("출금 후 잔고>"+this.balance);
		return balance;
	}

	public void showBalance() {
		System.out.println(balance);
	}

}
