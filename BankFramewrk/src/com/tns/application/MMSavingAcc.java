package com.tns.application;

import com.tns.framework.SavingAcc;

public class MMSavingAcc  extends SavingAcc{

	private float MINIBAL;

	public MMSavingAcc(int accNo, String accName, float accBal, boolean isSalaried, float mINIBAL) {
		super(accNo, accName, accBal, isSalaried);
		MINIBAL = mINIBAL;
	}
	
	public void withdraw(Float MINIMAL) {
		System.out.println("You Cannot withdraw Money Hence Your Minimum balance is :"+MINIBAL);
	}

	@Override
	public String toString() {
		return "MMSavingAcc [MINIBAL=" + MINIBAL + ", toString()=" + super.toString() + ", getAccNo()=" + getAccNo()
				+ ", getAccName()=" + getAccName() + ", getAccBal()=" + getAccBal() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
	
}
