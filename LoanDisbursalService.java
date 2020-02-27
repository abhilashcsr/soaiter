package com.capgemini.pecunia.service;

public interface LoanDisbursalService {

	boolean deposit(double amount);

	double withdraw(double amount);

	double getBalance();

}
