package HomeWorkMar01;

public class homeWorkE {

	public static void main(String[] args) throws InterruptedException {

		
		int x = 100;
		int sum = 0;
		
		for (int y = 1; y<=x; y++) {
			
			sum += y;
			
		}
		
		System.out.println("The sum of whole number is: ");
		
		Thread.sleep(500);
		
		System.out.println(sum);
		
	

	}

}
