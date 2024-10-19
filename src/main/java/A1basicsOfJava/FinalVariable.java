package A1basicsOfJava;

public class FinalVariable {

	int a = 10;
	static int b = 20;
	
	int personalLoanInterest; 
	
//	int homeLoanInterest;

	final int homeLoanInterest =  10;
	
	
	final int pFLoanInterest;
	
	public FinalVariable() {
		pFLoanInterest = 15;
	}
	
	public FinalVariable(int a) {
		pFLoanInterest = 20;
	}
	
	public static void main(String[] args) {
		
		
		FinalVariable obj = new FinalVariable();
//		obj.a = 20;
		System.out.println(obj.a);
		System.out.println(b);
		
		System.out.println("Changing the value of the variables");
		obj.a = 15;
		System.out.println(obj.a);
		
		b = 25;
		System.out.println(b);
		
//		For Selvi
		obj.personalLoanInterest = 10;
//		For Yugandhar
		obj.personalLoanInterest = 11;
		
		System.out.println(obj.homeLoanInterest);
//		obj.homeLoanInterest = 11;
		
//		assigning different values to a final variable using Constructor;
		System.out.println(obj.pFLoanInterest);
		
		
		FinalVariable obj1 = new FinalVariable(10);
		System.out.println(obj1.pFLoanInterest);
		
		
	}

	}
