package HomeWorkMar01;

import java.util.Scanner;

public class HomeWorkB {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		

		System.out.println("Please Enter your age:");
		short tobacoAge = scan.nextShort();
		
		boolean tobacoAge1 = (tobacoAge==21);
		boolean tobacoAge2 = (tobacoAge>21);
		boolean tobacoAge3 = (tobacoAge>15==tobacoAge<21);
	
		
		if(tobacoAge1){
			
			System.out.println("You are eligible to buy tobaco ID");
			
		}
	
		else if(tobacoAge2){
			
			System.out.println("You are eligible to buy tobaco");
			
		}
		
	
		else if(tobacoAge3){
			
			System.out.println("You can not buy tobaco");
			
		}
		else {
			
			System.out.println("I will call the police");
		}
		
	
		

	}

}
