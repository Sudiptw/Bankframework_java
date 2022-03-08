package com.tns.framework;

public  class CurrentAcc extends BankAcc {

	protected float creditLimit=25000;

	public CurrentAcc(int accNo, String accName, float accBal, float creditLimit) {
		super(accNo, accName, accBal);
		this.creditLimit = creditLimit;
	}
	
	public void Withdraw(float creditLimit) {
		System.out.println("Credit Limit of Your Account is :"+creditLimit);
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", getAccNo()=" + getAccNo() + ", getAccName()="
				+ getAccName() + ", getAccBal()=" + getAccBal() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
}
