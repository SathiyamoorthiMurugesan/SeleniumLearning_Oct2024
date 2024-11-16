package exceptionLearning;

//public class CustomException extends Exception {
//public class CustomException extends RuntimeException {
public class CustomException extends ArithmeticException {

	public static void main(String[] args) throws CustomException {
		testMethodForCustomException();
		
	}
	
	public void testMethod() {
		try {
			testMethodForCustomException();
		}
		catch(CustomException e) {
			
		}
	}
	public static void testMethodForCustomException() throws CustomException {
		System.out.println("Enter a number: ");
		int a = 10;
		
		if(a<0) {
			throw new CustomException();
		}
		
		if(a>0 && a<100) {
			throw new CustomException(10);
		}
	}

	public CustomException() {
//		super();
		System.out.println("Given number is less than 0. Please enter some other number");
	}

	public CustomException(int a) {
//		super();
		System.out.println("Given number is between 10 and 100");
	}

	public CustomException(String a) {
		
	}

	public CustomException(int a, int b) {

	}

}
