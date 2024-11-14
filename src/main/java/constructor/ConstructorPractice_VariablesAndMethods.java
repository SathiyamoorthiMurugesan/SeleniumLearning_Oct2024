package constructor;

public class ConstructorPractice_VariablesAndMethods {
	
	char c = 'a';
	static String str = "sathya";
	

	public ConstructorPractice_VariablesAndMethods() {
		int a = 10;
		System.out.println(a);
		System.out.println(str);
		System.out.println(c);
		
		method1();
		method2(10);
		String var = method3();
		System.out.println(var);
		
	}

	public ConstructorPractice_VariablesAndMethods(int a) {

	}
	
	public void method1() {
		System.out.println("I am a simple method");
	}
	
	public static void method2(int a) {
		System.out.println("I am int parameterized static method");
	}
	
	public String method3() {
		System.out.println("I am string return type method");
		return "abc";
	}

	public static void main(String[] args) {
		ConstructorPractice_VariablesAndMethods obj = new ConstructorPractice_VariablesAndMethods();
			
	}

}
