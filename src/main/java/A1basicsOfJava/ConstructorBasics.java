package A1basicsOfJava;

// * Every class has its own constructor and we call it as default constructor;
// * Default constructor is implicitly present inside the class;
// * Nature of Constructor
//		* Its name MUST be same as Class name
//		* Constructor should not be having any return type
// * Syntax	
//		* accessModifier ClassName() {
//			
//		}
// * Constructor also belongs to the class. So we dont need to mention it as "static"
// * When we create an Object for a class, default constructor is being called.
// * We can also parameterize the constructor
// * When the default constructor was implicitly present and you create a Constructor with parameter
//		* Then the default constructor will vanish. 
//		* Which means, we can not create a object for the class using default constructor.
// * We can create a constructor using public, private, project and default(do not use the keyword)
//		* When Constructors is private, we can not create object of that class in other classes.

public class ConstructorBasics {
//	public class ConstructorBasics extends Object {

	public ConstructorBasics() {
		System.out.println("I am a default Constructor");
	}

	public ConstructorBasics(int amount) {

	}

	public ConstructorBasics(String documentName) {

	}

	public ConstructorBasics(int amount, String documentName) {

	}

	public static void main(String[] args) {
		ConstructorBasics obj = new ConstructorBasics();
		obj.method1();

		method2();
		
		ConstructorBasics obj1 = new ConstructorBasics(10);
		
		ConstructorBasics obj2 = new ConstructorBasics(null);

	}

	public void method1() {
		System.out.println("I am a non-static method");
	}

	public static void method2() {
		System.out.println("I am a static method");
	}

}

class AAA {
	
//	public AAA() {
//		
//	}
//	
//	private AAA() {
//		
//	}
//	
//	protected AAA() {
//		
//	}
//	
	AAA() {
		
	}
}












