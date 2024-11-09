package inheritanceInJava;

//public class TestObjectClass extends Object {
	public class TestObjectClass  {
	
	int a = 10;
	
	static String str = "Sathya";
	
	public void method1() {
		System.out.println("This is non static method");
	}
	
	public static String method2() {
		System.out.println("This is static method with return type as String");
		return "S";
	}

	public static void main(String[] args) throws InterruptedException {
		TestObjectClass obj = new TestObjectClass();
		obj.wait();
	}

}
