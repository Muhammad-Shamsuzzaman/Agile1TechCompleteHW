package HomeWorkFeb23;

import java.util.Scanner;

public class homeworkNumber3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the basic rent amount: ");
		double basicRent = input.nextDouble();
		System.out.println("Please enter the utility amount: ");
		double utility = input.nextDouble();
		System.out.println("Please enter the parking charge: ");
		double parkingCharge = input.nextDouble();
		
		double totalRent = (basicRent+utility+parkingCharge);
		
		System.out.println("The total rent is: " + totalRent);

	}

}
