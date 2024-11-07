package A2interfaceInJava;

public interface A1Interface {
	
	int a = 10;
	static int b = 20;
	
	
	public void methodA1();
	
	public static void methodA2() {
		System.out.println("I am a static method from A1Interface");
		System.out.println(a);
		System.out.println(b);
	}

	default void methodA3() {
		System.out.println("I am a default method from A1Interface");
		System.out.println(a);
		System.out.println(b);
	}
}

interface A2Interface extends A1Interface {

	public void method1();

	public static void method2() {
		System.out.println("I am a static method from A1Interface");
	}

	default void method3() {
		System.out.println("I am a default method from A1Interface");
	}
}

class A3Class implements A2Interface {

	@Override
	public void methodA1() {

	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub

	}
	
	public void method10() {
		
	}
	
	public static void method20() {
		
	}

	public void callingMethodsAndVariablesFromParentAndGrandParentInterfaces() {
		A3Class obj = new A3Class();
		methodA1();
		obj.methodA1();

		method1();
		obj.method1();

		A1Interface.methodA2();
		A2Interface.method2();

		obj.method3();
		obj.methodA3();
		
		A2Interface obj1 = new A3Class();//We can have A2Interface as a reference because, A3Class follows it
		
		A1Interface obj2 = new A3Class();//We can have A1Interface as a reference because, A3Class follows it indirectly
		
//		WebDriver driver = new ChromeDriver(); //Here ChromeDriver follows WebDriver but not directly. 
//		ChromeDriver driver = new ChromeDriver();
	}

}

class Lonely {

	public void L1() {
		A3Class obj = new A3Class();
		
		obj.methodA1();
		obj.method1();
		
		A1Interface.methodA2();
		A2Interface.method2();
		
		obj.method3();
		obj.methodA3();
		
		obj.method10();
		A3Class.method20();
		
	}

	static public void SL1() {

	}

}

