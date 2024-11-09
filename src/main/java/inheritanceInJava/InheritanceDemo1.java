package inheritanceInJava;

public class InheritanceDemo1 {
	
	int a = 10;
	String str1 = "Sathya";
	
	static int b = 20;
	static String str2 = "Sathiyamoorthi";
	
	public void parentMethod1() {
		int a =10;
		System.out.println("I am non-static, non-parameterized parent method");
	}
	
	public void parentMethod2(int a) {
		System.out.println("I am non-static, parameterized parent method2");
	}
	
	public static void parentMethod3(String abc) {
		System.out.println("I am static, parameterized parent method3");
	}
	
	public static void parentMethod4(int a, int b) {
		System.out.println("I am static, two parameterized parent method4");
	}
	

	public static void main(String[] args) {
		InheritanceDemo1 parent = new InheritanceDemo1();
		parent.parentMethod1();
		parent.parentMethod2(100);
		
		parentMethod3("Sathya");
		parentMethod4(20, 30);
	}

}
