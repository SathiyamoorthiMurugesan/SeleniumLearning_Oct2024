package constructor;

public class ConstructorPractice_Overloading {
	
//	OverLoading Constructors
	
	public ConstructorPractice_Overloading() {
		System.out.println("I am default constructor");
	}
	
	public ConstructorPractice_Overloading(int a) {
		System.out.println("I am int parameterized constructor");
	}
	
	public ConstructorPractice_Overloading(String a) {
		System.out.println("I am String parameterized constructor");
	}
	
	public ConstructorPractice_Overloading(int a, String aa) {
		System.out.println("I am int and String parameterized constructor");
	}

	public static void main(String[] args) {
		ConstructorPractice_Overloading obj = new ConstructorPractice_Overloading();
		ConstructorPractice_Overloading obj1 = new ConstructorPractice_Overloading(10);
		ConstructorPractice_Overloading obj2 = new ConstructorPractice_Overloading("String");
		ConstructorPractice_Overloading obj3 = new ConstructorPractice_Overloading(20, "Name");
	}

}
