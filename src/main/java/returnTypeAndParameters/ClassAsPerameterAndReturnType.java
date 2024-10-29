package returnTypeAndParameters;

public class ClassAsPerameterAndReturnType {

	public static void main(String[] args) {

		ClassAsPerameterAndReturnType obj1 = new ClassAsPerameterAndReturnType();

//		parameterization
		int a = 20;
		obj1.method40(a);

		obj1.method10(obj1);

//		Return type
		int aa = obj1.method30();
		// int aa = 20;

		ClassAsPerameterAndReturnType bb = obj1.method20();
		// ClassAsPerameterAndReturnType bb = new ClassAsPerameterAndReturnType();

//		combining both return type and parameters
		obj1.method40(obj1.method30());

		obj1.method10(obj1.method20());
		
		Class1 C1 = new Class1();
		obj1.method100(C1.method11());
		
		
		Class1 cc = C1.method11();
		cc.method12();
		
		C1.method11().method12();//Class1.method12();
		int abc = C1.method11().method12();
		
	}

	public void method40(int a) {
		System.out.println(a);
	}

	public void method10(ClassAsPerameterAndReturnType abc) {

	}

	public int method30() {
		int b = 20;
		return b;
	}

	public ClassAsPerameterAndReturnType method20() {
		ClassAsPerameterAndReturnType obj = new ClassAsPerameterAndReturnType();
		return obj;
	}
	
	public void method100(Class1 aaa) {
		
	}

}

class Class1 {

	public Class1 method11() {
//		Class1 obj = new Class1();
//		return obj;
		return new Class1();
	}
	
	public int method12() {
		System.out.println("Hello");
		return 0;
	}
	
	public static void method13() {
		System.out.println("Hiiiiiii");
	}
}













