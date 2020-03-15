package HomeWorkFeb23;

import java.util.Scanner;

public class homeworkNumber5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the base price: ");
		double basePrice = input.nextDouble();
		System.out.println("Please enter the interest rate: ");
		double interestRate = input.nextDouble();
		System.out.println("Please enter the tax rate: ");
		double taxRate = input.nextDouble();
		System.out.println("Please enter the admin fee: ");
		double adminFee = input.nextDouble();
		System.out.println("Please enter the down payment: ");
		double downPayment = input.nextDouble();
		System.out.println("Please enter the duration of financing by year: ");
		double durationofFinancing = input.nextDouble();
		
		double subTotal = (basePrice+adminFee-downPayment);
		double totalSalestax = (basePrice*taxRate)/100;
		double outOfdoorprice = subTotal+totalSalestax;
		System.out.println("The total Out Of Door Price is: " + outOfdoorprice);
		double r = (interestRate/100/12);
		double n = (durationofFinancing*12);
		
		double monthlyPayment = (r*outOfdoorprice)/(1-(1/Math.pow((1+(r)),n)));
		
		System.out.println("The Monthly Payment is: " + monthlyPayment);

	}

}
