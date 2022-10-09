package com.controller;

public interface Accountinterfase  {

	void addAccount(Account obj);
	void checkBalance(String username);
	void addMoney(String username,int amount);
	void transferBalance(String username,int amount,String payuser)throws MinumumFundRequiredException;
	public void WithDrawMoney(String username,int amount)throws MinumumFundRequiredException;
	
}
