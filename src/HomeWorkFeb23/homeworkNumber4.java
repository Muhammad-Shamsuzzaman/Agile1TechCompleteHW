package HomeWorkFeb23;

import java.util.Scanner;

public class homeworkNumber4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the value of farenheit: ");
		double fahrenheit = input.nextDouble();
		
		double celsius = ((fahrenheit-32)*5)/9 ;
		
		System.out.println("The Celsius value is: ");
		System.out.println(celsius);
		

	}

}
