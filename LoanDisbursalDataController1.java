package com.capgemini.pecunia.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.capgemini.pecunia.LoanException;
import com.capgemini.pecunia.service.LoanDisbursalService;
import com.capgemini.pecunia.service.LoanDisbursalServiceImpl;

public class LoanDisbursalDataController1 {
	
	private double roi;
	private int creditScore = 0;
	private String accountid;
	private double amount;
	private double LoanAmount;
	private int tenure;
	private int choice = 0;
	private double EMI;
	public double calculateEMI(double EMI){
		return EMI;
	}

	public LoanDisbursalDataController1() throws LoanException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		LoanDisbursalService lService = new LoanDisbursalServiceImpl();
		while(true)
		{
			System.out.println("WELCOME TO THE BANKING SERVICES");
			choice = getChoice(scan);
			switch(choice)
			{
			case 1:
				boolean inCorrect = true;
				do
				{
					System.out.println("Deposit Amount");
					System.out.println("Enter Amount: ");
					try
					{
						amount = scan.nextDouble();
						if(amount<=0)
						{
							System.out.println("Amount Cannot be ZERO or Negative.");
						}
						else
						{
							inCorrect = false;
						
							boolean success = lService.deposit(amount);
						
							if(success)
							{
								System.out.println("Amount Deposited.");
							}
							else
							{
								System.out.println("Could not Deposit Amount.");
							}
							
						}
							
					}catch (InputMismatchException e)
					{
						System.out.println("Amount Should be in Numbers");
						scan.nextLine();
					}
				}	
				while(inCorrect);
					break;
			case 2:
				inCorrect = true;
				do 
				{
				System.out.println("Withdraw Amount");
				System.out.println("Enter amount to withdraw");
				try
				{
					amount = scan.nextDouble();
					if(amount <= 0)
					{
						System.out.println("Amount cannot be zero or negative");
					}
					else
					{
						inCorrect = false;//stops while loop
						double currBalance = lService.withdraw(amount);
						if(currBalance <= 0)
						{
							System.out.println("Could not withdraw");
						}
						else
						{
							System.out.println("Your balance is: " + currBalance);
						}
					}
				}catch (InputMismatchException e)
				{
					System.out.println("Amount should be number");
					scan.nextLine();//consume keyboard chars
				}
				}
				while(inCorrect);
				break;
				
			case 3:
				System.out.println("Display Balance");
				double balance = lService.getBalance();
				System.out.println("Balance : " + balance);
				break;
				
			case 4:
				System.out.println("Welcome to the LOAN Services.");
				System.out.println("Enter the Details: ");
				System.out.println("Account ID:");
				accountid = scan.next();
				System.out.println("Loan Amount:");
				LoanAmount = scan.nextDouble();
				System.out.println("Tenure:");
				tenure = scan.nextInt();
				System.out.println("Credit Score:");
				creditScore = scan.nextInt();
//				System.out.println("Loan Type:");
//				String type;
//				type = scan.nextLine();
				int choice2 = 0;
				while(true)
				{
					choice2 =scan.nextInt();
					System.out.println("The LOAN TYPE");
					choice2= getLoanType(scan);
					switch(choice2)
					{
					case 1:
						System.out.println("Personal Loan");
						System.out.println("Interest Rate:13.25%");
						roi = 13.25;
						if(creditScore >= 670)
						{
							System.out.println("Pending.");
							
							if(accountid.equals(accountid))
							{
								String s1 = "Loan Accepted";
								System.out.println("Loan Status:"+ s1);
							}
							else
							{
								String s2 = "Loan Rejected";
								System.out.println("Loan Status:"+ s2);
							}
								
						}
						else{
							System.out.println("Loan Rejected");
						}
						break;
					
					case 2:
						System.out.println("Home Loan");
						System.out.println("Interest Rate:8.55%");
						roi = 8.55;
						if(creditScore >= 670)
						{
							System.out.println("Pending.");
							
							if(accountid.equals(accountid))
							{
								String s1 = "Loan Accepted";
								System.out.println("Loan Status:"+ s1);
							}
							else
							{
								String s2 = "Loan Rejected";
								System.out.println("Loan Status:"+ s2);
							}
								
						}
						else{
							System.out.println("Loan Rejected");
						}
						break;
						
					case 3:
						System.out.println("Educational Loan");
						System.out.println("Interest Rate: 10.25%");
						roi = 10.25;
						if(creditScore >= 670)
						{
							System.out.println("Pending.");
							
							if(accountid.equals(accountid))
							{
								String s1 = "Loan Accepted";
								System.out.println("Loan Status:"+ s1);
							}
							else
							{
								String s2 = "Loan Rejected";
								System.out.println("Loan Status:"+ s2);
							}
								
						}
						else{
							System.out.println("Loan Rejected");
						}
						break;
					
					case 4:
					System.out.println("Exiting Loan System. Thank you");
					System.exit(0);//terminates the system
					break;
					
					default:
//					if(choice2!=0)
					System.out.println("Please Enter 1 to 4 only");
					break;
					}
				}
				
			case 5:
				System.out.println("Exiting System. Thank you");
				System.exit(0);//terminates the system
				break;
				
			default:
//				if(choice!=0)
				System.out.println("Please Enter 1 to 5 only");
				break;
			}
		}
			
		}
		

	private static int getChoice(Scanner scan) 
	{
		// TODO Auto-generated method stub
		int choice = 0; 
		System.out.println("Enter your choice");
		System.out.println("1. Deposit amount");
		System.out.println("2. Withdraw amount");
		System.out.println("3. Check amount");
		System.out.println("4. Loan Status");
		System.out.println("5. Exiting System");
		try{
			choice = scan.nextInt();
			
		}catch(InputMismatchException e)
		{
			System.out.println("Please Enter Nos Only:");
			scan.nextInt();
		}
		return choice;
	}
		private static int getLoanType(Scanner scan)
		{
			int choice2 = 0;
			System.out.println("Enter your choice");
			System.out.println("1. Personal Loan");
			System.out.println("2. Home Loan");
			System.out.println("3. Educational Loan");
			System.out.println("4. Exiting System");
			try{
				choice2 = scan.nextInt();
				
			}catch(InputMismatchException e)
			{
				System.out.println("Please Enter Nos Only:");
				scan.nextInt();
			}
			return choice2;
			
		
	}
	
	public static void main(String[] args) throws LoanException
	{
		new LoanDisbursalDataController1();
	}

}


