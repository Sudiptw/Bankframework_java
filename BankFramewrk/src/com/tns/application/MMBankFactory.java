package com.tns.application;

import com.tns.framework.BankFactory;
import com.tns.framework.SavingAcc;
import com.tns.framework.CurrentAcc;

public  class MMBankFactory extends BankFactory{


public SavingAcc getNewSavingAcc() {
	
	MMSavingAcc msaving = new MMSavingAcc(0, null, 0, false, 0);
	return msaving;
}

public CurrentAcc getNewCurrentAcc() {
	
	MMCurrentAcc mcurrent = new MMCurrentAcc(0, null, 0, 0);
	return mcurrent;
}

@Override
public SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
	// TODO Auto-generated method stub
	return null;
}

}