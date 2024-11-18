package throwException;

public class CustomException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomException() {
		System.out.println("No password Entered");
//		System.out.println("Password length is less/greater than 4 digit");
		d = 35;
	}
	
	public CustomException(String str) {
		System.out.println("Password lenth is less/greater than 4 digit");
		d = 35;
	}
	
	public CustomException(boolean boo) {
		d = 45;
		System.out.println("Incorrect password");
		method1();
	}
	
	public void method1() {
		// any codes
		a = 40;
//		c = 40;
//		d = 35;
		int b = 20;
	}
	
	int a = 30; //a = 40;
	int b = 10;
	
	final int c = 30;
	final int d;
	
	public static void main(String[] args) {
		CustomException obj = new CustomException();
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		obj.method1();
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		
	}
	
	
}
