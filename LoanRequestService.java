package com.capgemini.pecunia.service;

import java.util.List;

import com.capgemini.pecunia.LoanException;
import com.capgemini.pecunia.controller.Loan;


public interface LoanRequestService {
	public String createLoanRequest(com.capgemini.pecunia.controller.Loan loan) throws LoanException;
	public List<Loan> loanRequestList() throws LoanException;
	public List<Loan> loanApprovalList(Loan loan) throws LoanException;
	public boolean validateAmount(double amount);
	public boolean validateTenure(int tenure);
	public boolean validateRateOfInterest(double rateOfInterest);
	public boolean validateCreditScore(int creditScore);
	public String loanApprovalStatus(Loan loan) throws LoanException;
	public double calculateEmiForLoan(Loan loan) throws LoanException;

	static int createLoanRequest()
	{
		return 0;
		
	}
	public Loan addLoanDetails(String id, double amount, int tenure, double roi, int score) throws LoanException;
	Loan addLoanDetails1(String id, double amount, int tenure, double roi, int score);
	


}

