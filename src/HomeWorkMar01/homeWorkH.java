package HomeWorkMar01;

import java.util.Scanner;

public class homeWorkH {

	public static void main(String[] args) {

		
		Scanner SC = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		
		System.out.println("Please enter the value of a: ");
		a = SC.nextInt();
		
		System.out.println("Please enter the value of b: ");
		b = SC.nextInt();
		
		System.out.println("Please enter the value of c: ");
		c = SC.nextInt();
		
			if (a > b && a > c) {
		    System.out.println("a is the largest number");
			}
		    else if (b > a && b > c) {
		      System.out.println("b is the largest number");
		    }
		    else if (c > a && c > b) {
		      System.out.println("c is the largest number");
		    }
		    else {
		      System.out.println("The numbers are not distinct.");
		    }
		 

	

	}

}
