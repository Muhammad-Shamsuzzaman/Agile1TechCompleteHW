package nonFunctionalPackage;

public class functionClass_hwF {

	
	public int add3Numbers(int x, int y, int z) {
		
		int sum = x+y+z;
		
		System.out.println("The result for function number 1 is: "+"Sum = " + sum);
		
		return sum;
		
	}
	
	public void printData(String name) {
		
		System.out.println("The result for function number 2 is: "+"Name = "+name);
		
	}
	
	public static boolean checkEquality(int x, int y) {
		if(x==y){
			System.out.println("The result for function number 3 is(IF): "+"True");
			return true;
			
		}
		else {
			System.out.println("The result for function number 3 is(ELSE): "+"False");
			return false;
		}
		
		}
	
	public void printName() {
		
		System.out.println("The result for function number 4 is: "+"Muhammad Shamsuzzaman");
	}
	
	public void printboolean(int x) {
		if (x==5) {
			System.out.println("The result for function number 5 is: "+"True");
		}
		else {
			System.out.println("The result for function number 5 is: "+"False");
		}
		
	}
	
	
	

}
