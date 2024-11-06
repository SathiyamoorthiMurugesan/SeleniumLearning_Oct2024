package A2interfaceInJava;

public interface Methods_Interface {
	
//	In interface, you can have
//		* only body less methods
//		* only body methods  (static or default)
//		* both body less and body method

//	public void method1() {
//		
//	}

	public void method1(); // abstract method or body less method

	public static void method2() {

	}

	public void method3(int a);

	public static void method4(String str) {

	}

	public int method5();

	public static String method6() {
		return null;

	}

	public int method7(int a, int b);

	public static String method8(String a, int b) {

		return null;
	}

//	private void method9();
//	protected void method10();

	void method11();

	default void method12() {

	}

	static void method13() {

	}

//	default static void method14() {
//
//	}
}
