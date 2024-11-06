package A2interfaceInJava;

public class TestClass2 implements LearnInterface2 {
	
	int var1 = 10;
	static String str1 = "abc";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void callingConcreteMethodsOfInterface() {
		LearnInterface.rule2();
		TestClass2 obj = new TestClass2();
		obj.rule3();
		
		LearnInterface obj1 = new TestClass2(); 
//		WebDriver driver = new ChromeDriver();
		obj1.rule3();
//		obj1.test1();
		
		LearnInterface2 obj2 = new TestClass2();
		obj2.rule3();
		obj2.test1();
	}

	@Override
	public void rule1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rule22(int k) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}
	
	



}
