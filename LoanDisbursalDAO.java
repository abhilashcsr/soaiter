package com.capgemini.pecunia.dao;

import com.capgemini.pecunia.LoanException;

public interface LoanDisbursalDAO {
	public String createLoanRequest(LoanDisbursalDAOImpl Loan) throws LoanException;
	

}
