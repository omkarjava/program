package com.controller;

public class Account {
	
	
	int accno,balance,mobileno;
	String username,ifsccode,address,email;

	public Account(int accno, String username, String ifsccode, int balance, int mobileno, String address, String email) {
		super();
		this.accno = accno;
		this.username = username;
		this.ifsccode = ifsccode;
		this.balance = balance;
		this.mobileno = mobileno;
		this.address = address;
		this.email = email;
	}

	public int getAccno() {
		return accno;
	}

    public void setAccno(int accno) {
		this.accno = accno;
	}

	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getMobileno() {
		return mobileno;
	}

	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}

	public String getuserName() {
		return username;
	}

	public void setuserName(String username) {
		this.username = username;
	}

	public String getIfsccode() {
		return ifsccode;
	}

	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String toString() {
		return "Account [accno=" + accno + ", balance=" + balance + ", mobileno=" + mobileno + ", username=" + username
				+ ", ifsccode=" + ifsccode + ", address=" + address + ", email=" + email + "]";
	}

	public static void main(String[] args) {
	
	}

}
