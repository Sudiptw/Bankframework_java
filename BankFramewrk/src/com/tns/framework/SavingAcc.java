package com.tns.framework;

public class SavingAcc extends BankAcc{

	private boolean isSalaried;
	private static float MINIBAL=1000;
	
	public SavingAcc(int accNo, String accName, float accBal, boolean isSalaried) {
		super(accNo, accName, accBal);
		this.isSalaried = isSalaried;
	}

	public void withdraw(float MINIBAL) {
		System.out.println("Your Minimum balance in account is"+ MINIBAL);
	}
	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", getAccNo()=" + getAccNo() + ", getAccName()=" + getAccName()
				+ ", getAccBal()=" + getAccBal() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	
	
	
	
}
