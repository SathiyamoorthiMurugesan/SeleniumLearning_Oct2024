package constructor;

public class ConstructorPractice_AccessModifiers {
	
//	Constructor using access modifier
//		* if we put constructor as private, we can not create object for that class in any other class or sub class
//			* Eg for private constructor:
//				* Arrays Class
//		* if we put constructor as protected or default or public, we can create object in any class
	
	
//	public ConstructorPractice_AccessModifiers() {
//		
//	}

	private ConstructorPractice_AccessModifiers() {
//		Arrays
	}
	
	protected ConstructorPractice_AccessModifiers(int a) {
		
	}
	
	ConstructorPractice_AccessModifiers(String a) {
		
	}
	
	public ConstructorPractice_AccessModifiers(int a, int b) {
		
	}
	
	public void method1() {
		System.out.println("I am a simple method from ConstructorPractice2 class");
	}

	public static void main(String[] args) {
		ConstructorPractice_AccessModifiers obj = new ConstructorPractice_AccessModifiers();
		

	}

}

class dummyClass {
	public void method2() {
		ConstructorPractice_AccessModifiers obj = new ConstructorPractice_AccessModifiers(10);
//		ConstructorPractice_AccessModifiers obj1 = new ConstructorPractice_AccessModifiers();
		obj.method1();
	}
}

//class Child1 extends ConstructorPractice_AccessModifiers {
//	public void method3() {
//		method1();
//	}
//}


