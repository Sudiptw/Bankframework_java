package com.tns.AccHolder;

import com.tns.application.MMBankFactory;
import com.tns.application.MMCurrentAcc;
import com.tns.application.MMSavingAcc;
import com.tns.framework.CurrentAcc;

public class Accholder {

	public static void main(String[] args) {
		
	
		MMBankFactory mmbfactory =new MMBankFactory();
			mmbfactory.getNewSavingAcc();
			mmbfactory.getNewCurrentAcc();
	
			MMCurrentAcc mcurrent = new MMCurrentAcc(0, null, 0, 0);
			
			mcurrent.Withdraw(25000f);
			
			mcurrent.toString();	
			
			MMSavingAcc msaving = new MMSavingAcc(0, null, 0, false, 0);
			
			msaving.withdraw(30000f);
			
			msaving.toString();
	}
}