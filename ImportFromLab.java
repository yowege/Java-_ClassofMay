package com.calssofmay;

import com.JavaLabPra.AccountOne;

public class ImportFromLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		AccountOne Acct = new AccountOne();

		Acct.setAccountName("Yonnas");
		Acct.setAccountNumber(1324567);
		Acct.setAccountDeposit(2000);
		Acct.setAccountBalance(4500);

		double Balance = Acct.getAccountBalance() + Acct.getAccountDeposit();

		System.out.println("Account Name :" + Acct.getAccountName());
		System.out.println("Account Number : " + Acct.getAccountNumber());
		System.out.println("Account Deposit: " + Acct.getAccountDeposit());
		System.out.println("Final Balance :" + Balance);
	}

}
