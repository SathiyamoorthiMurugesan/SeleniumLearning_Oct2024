package A2interfaceInJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public interface AAA {
	
//	WebDriver
	
	public int a = 10;
//	private int b = 20;
//	protected int c = 20;
	int d = 100;
	
	
	static public int aa = 10;
//	static private int bb = 20;
//	static protected int cc = 20;
	static int dd = 100;
	
	//Method with body or Concrete Method.
	//Abstract method or Bodyless method
	
	public void homeLoan();
	void personalLoan();
	public void educationalLoan();
	
//	body methods in interface should use either default or static
	
	default void newHomeLoanProcess() {
		
	}
	
	static public void method3() {
	
	}
	
	static void method4() {
	}
	
	public int method5(int abc);
	
	static public String method6(int abc, String xyz) {
		return null;
	}
	
	A1 exampleForInterfaceAsAReturnType();
	
	
	
	public interface A1 {
		public void method11();
		
		public void method22();
	}

//	private interface A2 {
//		
//	}

//	protected interface A2 {
//
//	}
	
	interface A3 {
		
	}

}

class ABC {
	public void method1() {
		AAA.method3();
		
		ABC obj = new ABC();
		
		HDFCBank obj1 = new HDFCBank();
		obj1.newHomeLoanProcess();
//		obj1.a =1000;
//		AAA.aa = 1000;
		
		obj1.exampleForInterfaceAsAReturnType();//A1
		 obj1.exampleForInterfaceAsAReturnType().method11();//A1
		 
		 WebDriver driver = new ChromeDriver();
		 
		 
		TargetLocator TL = driver.switchTo();
		TL.frame(0);
		
		 driver.switchTo().frame(0);
		 
		 driver.manage().deleteAllCookies();
		
		
	}
	
}

class HDFCBank implements AAA {
	

	@Override
	public void homeLoan() {
//		HDFC can make their own way of processing HomeLoan
	}

	@Override
	public void personalLoan() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void educationalLoan() {
		// TODO Auto-generated method stub
		
	}
	
	public void method1() {
		AAA.method3();
		
		HDFCBank obj = new HDFCBank();
		obj.newHomeLoanProcess();
	}

	@Override
	public int method5(int abc) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public A1 exampleForInterfaceAsAReturnType() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

interface BBB {

}

//public interface CCC {
//
//}
//private interface CCC {
//	
//}
//
//protected interface CCC {
//	
//}
