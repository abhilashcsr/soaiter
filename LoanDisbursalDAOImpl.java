package com.capgemini.pecunia.dao;

import java.util.HashMap;

import com.capgemini.pecunia.LoanException;
import com.capgemini.pecunia.controller.LoanDisbursalDataController;
import com.capgemini.pecunia.controller.Loan;


public class LoanDisbursalDAOImpl implements LoanDisbursalDAO {
	private HashMap<String, Loan> loanMap;
	public LoanDisbursalDAOImpl() {
		loanMap = new HashMap<String, Loan>();
	}
	
	public String createLoanRequest(Loan Loan) throws LoanException
	{
		if(loanMap.containsKey(Loan.getAccountId()) )
			throw new LoanException("Loan Exist for this ID");
		else
			loanMap.put(Loan.getAccountId(),Loan);
		return Loan.getAccountId();
		
	}
	
//	loanMap.addLoanDetails("986325741254", 10000, 12, 15, 689);
	

	private String getAccountId() {
		// TODO Auto-generated method stub
		return null;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public String createLoanRequest(LoanDisbursalDAOImpl Loan) throws LoanException {
		// TODO Auto-generated method stub
		return null;
	}

}
