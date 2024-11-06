package A2interfaceInJava;

public class TestClass1 implements LearnInterface {
	
	int a = 10;
	public String str = "Sathya";
	private int b = 20;
	protected int c = 30;
	
	
	static int a1 = 20;

	public static void main(String[] args) {
		TestClass1 obj = new TestClass1();
		System.out.println(obj.a);
		obj.method1();
		obj.rule1();
		obj.rule22(10);
		
		
//		Calling static method from interface
		System.out.println(LearnInterface.b1);
		LearnInterface.rule2();
		
//		Calling non static method from interface
		obj.rule3();
		
//		Creating object for a class by giving parent interface as a reference 
		LearnInterface obj1 = new TestClass1();
//		obj1.rule1(); //Explain it later
//		obj1.rule22(a1); //Explain it later
		obj1.rule3();
		System.out.println(obj1.k);
	}

	
	
	public void method1() {
		System.out.println("I am a method from class");
	}



	@Override
	public void rule1() {
		System.out.println("I am a non-static, non parametized method from interface");
		
	}

	@Override
	public void rule22(int k) {
		System.out.println("I am a non-static, parametized method from interface");
		
	}





}
