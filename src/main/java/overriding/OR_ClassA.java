package overriding;

public class OR_ClassA extends OR_ClassB {

	public static void main(String[] args) {

		OR_ClassB obj = new OR_ClassA();//Only ClassB methods are available
		OR_ClassA obj1 = new OR_ClassA();//Both ClassA and ClassB methods are available
		OR_ClassB obj2 = new OR_ClassB();//Only ClassB methods are available
//		OR_ClassA obj3 = new OR_ClassB();This is not possible
		
		System.out.println("Object created for parent class with parent as a reference");
		obj2.method1();
		obj2.methodB();
		
		System.out.println("Object created for child class with child as a reference");
		obj1.method1();
		obj1.methodB();
		obj1.methodA();
		
		System.out.println("******Overriding concept********");
		System.out.println("Object created for child class with parent as a reference");
		obj.method1();
		obj.methodB();
		
	}
	
	public void method1() {//overridden method
		System.out.println("I am a method1 from child class");
	}
	
	public void methodA() {
		System.out.println("I am a methodA from child class");
	}

}

class OR_ClassB {
	
	public static void main(String[] args) {
		OR_ClassB abc = new OR_ClassB();
		abc.testMethod();
	}
	
	public void method1() {//overrided method
		System.out.println("I am a method1 from parent class");
	}
	
	public void methodB() {
		System.out.println("I am a methodB from parent class");
	}
	
	public void testMethod() {
		OR_ClassB obj = new OR_ClassA();
		obj.method1();
		obj.methodB();
		
	}
}
