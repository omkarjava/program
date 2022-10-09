package com.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.utility.Getconnection;

public class Transaction {
	public static Connection conn;
	static {
		conn = Getconnection.getconnections();
	}

	static PreparedStatement ps;

	public static void main(String[] args) {
		Transaction tr = new Transaction();
		Scanner sc = new Scanner(System.in);
		Userimplimentor uc = new Userimplimentor();
		Accountimplementor ac = new Accountimplementor();
		System.out.println("********Welcome TO KuberBank*******");
		System.out.println("***************LOGIN*************");
		System.out.println("Enter The Username And Password For Login");
		String usern = sc.next();
		int pass = sc.nextInt();

		if (uc.login(usern, pass)) {
			char c = 'y';
			do {

				System.out.println("********KuberBank*******");
				System.out.println(
						"For Set Username Password Role Press :1\n For Change the Password Press :2 \n For Delete Data Press :3\nFor AddAccount Press:4");
				int a = sc.nextInt();
				switch (a) {
				case 1: {
					System.out.println("Enter Username Password Role");
					String username = sc.next();
					String password = sc.next();
					String role = sc.next();
					User u = new User(username, password, role);
					uc.adduser(u);
					System.out.println("Do want continue y/n");
					c = sc.next().charAt(0);
					break;
				}
				case 2: {
					System.out.println("For Update Password");
					System.out.println("Enter username and New Password");
					String username = sc.next();
					String password = sc.next();
					uc.updateuser(username, password);

					System.out.println("Do want continue y/n");
					c = sc.next().charAt(0);
					break;
				}
				case 3: {
					System.out.println("Enter the Username to Delete");
					String username = sc.next();
					uc.deleteuser(username);

					System.out.println("Do want continue y/n");
					c = sc.next().charAt(0);
					break;

				}
				case 4: {
					System.out.println("Enter Accno,  Username,  ifsccode, Balance,  Mobileno, Address, Email");
					int accno = sc.nextInt();
					String username = sc.next();
					String ifsccode = sc.next();
					int balance = sc.nextInt();
					int mobileno = sc.nextInt();
					String address = sc.next();
					String email = sc.next();
					Account k = new Account(accno, username, ifsccode, balance, mobileno, address, email);
					ac.addAccount(k);
					System.out.println("Do want continue y/n");
					c = sc.next().charAt(0);
					break;
				}

				}

			} while (c == 'y' || c == 'Y');
			System.out.println("***********Thank you**************");

		} else {
			char s = 'y';
			do {

				System.out.println("********KuberBank*******");
				System.out.println(
						"For Deposit Money Press:1\nTransfer Money Press:2\nFor Check Money Press:3\n  For WithDraw money :4");
				int a = sc.nextInt();
				switch (a) {

				case 1: {
					System.out.println("For Deposit Money");
					System.out.println("Enter username and Amount");
					String username = sc.next();
					int amount = sc.nextInt();
					ac.addMoney(username, amount);

					System.out.println("Do want continue y/n");
					s = sc.next().charAt(0);
					break;
				}
				case 2: {
					System.out.println("Transfer Money");
					System.out.println("Enter Username Amount Payusername");
					String username = sc.next();
					int amount = sc.nextInt();
					String pusername = sc.next();
					try {
						ac.transferBalance(username, amount, pusername);
					} catch (MinumumFundRequiredException e) {

						e.printStackTrace();
					}

					System.out.println("Do want continue y/n");
					s = sc.next().charAt(0);
					break;

				}

				case 3: {
					System.out.println("For Check Money");
					System.out.println("Enter username and password");
					String username = sc.next();
					String password = sc.next();
					ac.checkBalance(username);

					System.out.println("Do want continue y/n");
					s = sc.next().charAt(0);
					break;
				}

				case 4: {
					System.out.println("For Withdraw Money");
					System.out.println("Enter username and Amount");
					String username = sc.next();
					int amount = sc.nextInt();
					try {
						ac.WithDrawMoney(username, amount);
					} catch (MinumumFundRequiredException e) {

						e.printStackTrace();
					}

					System.out.println("Do want continue y/n");
					s = sc.next().charAt(0);
					break;
				}

				}
			} while (s == 'y' || s == 'Y');
			System.out.println("************Thank you*************");

		}
	}
}
