package A1basicsOfJava;

public class ObjectCreation {
//public class ObjectCreation extends Object {
	
//	* Java is a Object Oriented Programming language.
//	* But its not 100% OOPs language.
//	* Almost everything in Java is based on Object only
//	* Super most class of Java is Object class
//	* Whatever class we create, it always follows Object class by default. 
//	* Object class also, contains methods and variables 
//	* Whenever we want to use non static variables/methods, we need to create object for the
//		respective class.
//	* We call it as Object instantiation or Object creation
//	* We create object only for classes
//	* Syntax for object creation
//		ReferenceClassName ObjectVariableName = new ConstructorOfClassForWhichWewantToCreateObject();
//		ClassA obj = new ClassA();
//	* For a single class, we can create multiple objects (either within class or outside class)
//	* DEFINITION
//		* Whenever we create an Object for a class, whatever non-static members present in that class
//			will be copied and stored in heap memory
			
	int a = 10;
	private String b = "Sathya";
	protected char c = 'C';
	public float price = 75.35f;

	static int A = 10;
	static private String B = "Sathya";
	static protected char C = 'C';
	static public float PRICE = 75.35f;
	
	private static int bb;
	
	public static void method1() {
		
	}
	
	public void method2() {
		
	}
	
//	syso
	
	public static void main(String[] args) {
		
//		System.out.println();
		
		bb = 20;
		
//		int a = 10;
//		private String b = "Sathya";
//		protected char c = 'C';
//		public float price = 75.35f;
		
		ObjectCreation obj = new ObjectCreation();
//		obj.
//		obj.a = 20;
//		obj.a;
//		Object
//		System.out.println(a);
		System.out.println(obj.a);
		System.out.println(obj.A); // this is not the proper way to call static members
		System.out.println(A);//correct way of calling a static method/variable within static method/variable of the same class
	}

}
