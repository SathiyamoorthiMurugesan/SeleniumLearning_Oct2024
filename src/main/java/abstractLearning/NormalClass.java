package abstractLearning;

public class NormalClass extends DemoAbstract1 {
	
	int aa = 10;
	static int ab = 20;

	
	public void method21() {
		System.out.println("Test method");
	}
	
	public static void method22() {
		System.out.println("static test method");
	}
	
	public static void main(String[] args) {
		NormalClass obj = new NormalClass();
		obj.method21();
//		method22();
		
		obj.method11();
		
		obj.callingConcreteMethodsOfAbstractClass();
		
		DemoAbstract1 obj1 = new NormalClass();
		obj1.method1();
		
		TestInterface obj2 = new NormalClass();
		obj2.method11();
		
	}

	@Override
	public void method11() {
		System.out.println("this is the implementation of DemoAbstract class's method11()");
	}

	@Override
	public void method5() {
		System.out.println("this is the implementation of DemoAbstract class's method5()");
		
	}
	
	public void callingConcreteMethodsOfAbstractClass() {
		NormalClass obj = new NormalClass();
		obj.method1();
		obj.method3();
//		obj.method2();
		
		DemoAbstract1.method2();
		DemoAbstract1.method4('d');
		
		System.out.println("Testing");
	}

		

}
