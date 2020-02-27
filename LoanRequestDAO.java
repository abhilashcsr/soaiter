package com.capgemini.pecunia.dao;

import java.util.List;
import com.capgemini.pecunia.controller.Loan;
import com.capgemini.pecunia.LoanException;

public interface LoanRequestDAO {
	
	public static Loan addLoanDetails(String accountId, double amount, int tenure, double rateOfInterest, int creditScore ) throws LoanException {
		// TODO Auto-generated method stub
		return null;
	}
	public static String createLoanRequest(Loan loan) throws LoanException {
		// TODO Auto-generated method stub
		return null;
	}
	public static List<Loan> loanRequestList() throws LoanException {
		// TODO Auto-generated method stub
		return null;
	}
	public List<Loan> loanApprovalList(Loan loan) throws LoanException;
	public String loanApprovalStatus(Loan loan) throws LoanException;
	public double calculateEmiForLoan(Loan loan) throws LoanException;
	List<Loan> loanApprovalList1(Loan loan) throws LoanException;
	double calculateEmiForLoan1(Loan loan) throws LoanException;
	String createLoanRequest1(Loan loan) throws LoanException;
	Loan addLoanDetails1(String accountId, double amount, int tenure, double rateOfInterest, int creditScore)
			throws LoanException;
	
}
