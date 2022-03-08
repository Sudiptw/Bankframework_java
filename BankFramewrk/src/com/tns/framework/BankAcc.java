package com.tns.framework;

public abstract class BankAcc {

	private int accNo;
	private String accName;
	protected float accBal;
	
	public BankAcc(int accNo, String accName, float accBal) {
		super();
	}

	public void withdraw(Float accBal){}
	
	public void deposite(Float accBal){}

	/**
	 * @return the accNo
	 */
	public int getAccNo() {
		return accNo;
	}

	/**
	 * @param accNo the accNo to set
	 */
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	/**
	 * @return the accName
	 */
	public String getAccName() {
		return accName;
	}

	/**
	 * @param accName the accName to set
	 */
	public void setAccName(String accName) {
		this.accName = accName;
	}

	/**
	 * @return the accBal
	 */
	public float getAccBal() {
		return accBal;
	}

	/**
	 * @param accBal the accBal to set
	 */
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}

	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accName=" + accName + ", accBal=" + accBal + "]";
	}

	
}