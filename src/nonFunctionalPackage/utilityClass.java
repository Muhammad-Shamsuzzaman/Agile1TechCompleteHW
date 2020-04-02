package nonFunctionalPackage;

import java.util.Scanner;

public class utilityClass {

	public int creditScore;
	public double interestRate;
	public double basePrice;
	public int loanTerms;
	public double totalPrice;
	public double totalInterest;
	public double getMonthlyPayment;
	
	Scanner SC = new Scanner(System.in);

	
	public double findInterestRate(){
		
		System.out.println("Please enter credit score: ");
		creditScore = SC.nextInt();
		if(creditScore>=760){
			
			interestRate = 1.50;
			System.out.println("The interst rate is: " + interestRate);
			return interestRate;
			
		}
		
		else if (creditScore>=700==creditScore<760) {
			
			interestRate = 3;
			System.out.println("The interst rate is: " + interestRate);
			return interestRate;
		}
		
		else if(creditScore>=650==creditScore<700) {
			
			interestRate = 4;
			System.out.println("The interst rate is: " + interestRate);
			return interestRate;
		}
		else if(creditScore>=600==creditScore<650) {
			
			interestRate = 5;
			System.out.println("The interst rate is: " + interestRate);
			return interestRate;
		}
		else if(creditScore<600){
			System.out.println("Decision: No loan approval for you");
			interestRate = 0;
		}
	
		return interestRate;
			
	}
	
	public double calculateTotalPrice(){
		
		if (interestRate == 0) {
			
		}
		
		else {
		System.out.println("Please enter the base price: ");
		basePrice = SC.nextDouble();
		System.out.println("Please enter the loan term: ");
		loanTerms = SC.nextInt();
		
		if(loanTerms<20 || loanTerms>30) {
			System.out.println("Decision: No loan approval for you. " + "Loan term you requested is not available.");
		}
		
		else {
		totalInterest = ((interestRate/100)*basePrice*loanTerms);
		totalPrice = (basePrice+totalInterest);
		System.out.println("The total price is: " + totalPrice);
		}	
	}
		return totalPrice;
		
	}
	public double getMonthlyPayment() {

		if (totalPrice == 0) {
			
		}
		else {
		getMonthlyPayment = (totalPrice/(loanTerms*12));
		System.out.println("The monthly payment is: " + getMonthlyPayment);
		
		}
		return getMonthlyPayment;
	}



}
