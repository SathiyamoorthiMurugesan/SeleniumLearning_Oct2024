package A2interfaceInJava;

public interface B1Interface {
	
	int a = 10;
	static int b = 20;
	
	
	public void methodA1();
	
	public static void methodA2() {
		System.out.println("I am a static method from B1Interface");
	}

	default void methodA3() {
		System.out.println("I am a default method from B1Interface");
	}
}

class B1Class implements B1Interface {
	
	int b1 = 10;
	static int b2 = 20;

	@Override
	public void methodA1() {
		System.out.println("I am methodA1 from B1Interface but implemented in B1Class");
	}
	
	public void methodB1() {
		
	}
	
	public static void methodB2() {
		
	}

}