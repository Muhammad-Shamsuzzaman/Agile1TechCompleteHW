package HomeWorkMar01;

import nonFunctionalPackage.functionClass_hwF;

public class mainRun_homeWorkF {

	public static void main(String[] args) {

		
		functionClass_hwF HWF = new functionClass_hwF();
		
		//function number 1 (add3Numbers)
		HWF.add3Numbers(10, 15, 20);
		
		//function number 2 (printData)
		HWF.printData("Michael");
		
		//function number 3 (checkEquality)
		HWF.checkEquality(10, 10);
		HWF.checkEquality(10, 15);		
		
		//function number 4 (printName)
		HWF.printName();
		
		//function number 5 (printboolean)
		HWF.printboolean(5);
		HWF.printboolean(6);
		
	

	}

}
