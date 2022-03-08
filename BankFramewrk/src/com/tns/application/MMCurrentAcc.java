package com.tns.application;

import com.tns.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc{


		
	public MMCurrentAcc(int accNo, String accName, float accBal, float creditLimit) {
		super(accNo, accName, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}


	public void withdraw(float accBal) {
		System.out.println("Your Total Account Balance is:"+accBal+"And Your credit Limit is:"+creditLimit+"so you Cannot withdraw any"
				+ "amount");
	}

	@Override
	public String toString() {
		return "MMCurentAcc [toString()=" + super.toString() + ", getAccNo()=" + getAccNo() + ", getAccName()="
				+ getAccName() + ", getAccBal()=" + getAccBal() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	

	
}
