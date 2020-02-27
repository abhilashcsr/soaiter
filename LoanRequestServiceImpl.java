package com.capgemini.pecunia.service;

import com.capgemini.pecunia.controller.LoanRequestController;
import com.capgemini.pecunia.dao.LoanRequestDAO;

import java.util.List;

import com.capgemini.pecunia.LoanException;
import com.capgemini.pecunia.controller.Loan;


public class LoanRequestServiceImpl implements LoanRequestService {

		public LoanRequestServiceImpl(){
			
		}

		public  Loan addLoanDetails(String accountId, double amount, int tenure, double rateOfInterest, int creditScore) throws LoanException 
		{
			// TODO Auto-generated method stub
			if(!accountId.matches("[0-9]{12}"))
				throw new LoanException("Invalid account Id : Id should be 12 digit");
			if(!validateAmount(amount))
				throw new LoanException("Invalid Loan amount : Amount should be greater than 1000");
			if(!validateTenure(tenure))
				throw new LoanException("Invalid tenure: entered value is not valid");
			if(!validateRateOfInterest(rateOfInterest))
				throw new LoanException("Invalid Interest rate : Rate of interest should be  in range of 4% to 15%");
			if(!validateCreditScore(creditScore))
				throw new LoanException("Invalid credit score : credit score should be in range of 100 to 999");
		
			return LoanRequestDAO.addLoanDetails(accountId, amount, tenure, rateOfInterest, creditScore) ;
		}
			
		public String createLoanRequest(Loan loan) throws LoanException {
			// TODO Auto-generated method stub
			return LoanRequestDAO.createLoanRequest(loan);
		}

		public List<Loan> loanRequestList() throws LoanException {
			// TODO Auto-generated method stub
			return LoanRequestDAO.loanRequestList();
		}

		
	void calculateEMI(double LoanAmount, int tenure, double roi)
	{
		double EMI = (LoanAmount*roi*(Math.pow(1+ roi, tenure))/(Math.pow((1+roi),tenure) -1)); 
		System.out.println(EMI);
	}
	
	int createLoanRequest(LoanRequestController Loan)
	{
		return 0;
		
	}

	@Override
	public boolean validateAmount(double amount) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean validateTenure(int tenure) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean validateRateOfInterest(double rateOfInterest) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean validateCreditScore(int creditScore) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public List<Loan> loanApprovalList(Loan loan) throws LoanException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String loanApprovalStatus(Loan loan) throws LoanException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double calculateEmiForLoan(Loan loan) throws LoanException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Loan addLoanDetails1(String id, double amount, int tenure, double roi, int score) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
