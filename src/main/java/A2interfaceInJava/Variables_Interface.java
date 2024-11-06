package A2interfaceInJava;

public interface Variables_Interface {
	
//	local variable
//	class level variable - non static variable
//	static variable
	
	int a = 10;
	static String str = "20";
	
//	int b; // In interface, variables are final in nature
	
	public int b1 = 10;
//	private int b2 = 20;
//	protected int b3 = 20;
	
	public static int c1 = 20;
//	static protected int c2 = 20;
//	private static int c3 = 20;
	
	
	default void method1() {
		int aa = 20;
		int bb;
		
		aa = 21;
		
//		a = 11; //Not able to assign value because "a" is a final variable.
		
		
		
	}
	

	
}
