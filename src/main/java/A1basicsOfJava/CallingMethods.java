package A1basicsOfJava;

public class CallingMethods {
	
//	As of now we only deal with two kind of methods
//	1. static method
//	2. non static method
	
	public static void main(String[] args) {
		System.out.println("I am the main method");
		
		method1();
		
		CallingMethods dd = new CallingMethods();
//		dd.method1();
		dd.method2();
		
		dd.method3();
		
//		Practice123 obj = new Practice123();
//		obj.method4();
//		
//		Practice123.method5();
	}
	
//	withInAClass(from)		static			non-static
//	static 				    DIRECT          OBJECT CREATION
//	non-static              DIRECT          DIRECT/OBJECT CREATION

//	  WITH IN A CLASS
//	  1. calling a static method from non-static method - direct call
//	  2. calling a static method from static method - direct call 
//	  3. calling a non-static method from non-static method - direct call/Object creation
//	  4. calling a non-static method from static method - Object creation
	
	public static void method1() {
		System.out.println("I am a static method");
	}
	
	public void method2() {
		System.out.println("I am non-static method");
	}
	
	public void method3() {
		
		System.out.println("I am method3 and I am non-static");
		
		method1();
		
//		method2();
		
		CallingMethods dd = new CallingMethods();
		dd.method2();
		
//		Practice123.method5();
//		Practice123 obj = new Practice123();
//		obj.method4();
		
	}
	
}

//OutsideOfClass		static			   non-static
//static 				CLASSNAME          OBJECT CREATION
//non-static          CLASSNAME          OBJECT CREATION

//Outside class
//1. calling static method from non static method - using className
//2. calling static method from static method - using className
//3. calling non-static method from non-static method - Creating Object
//4. calling non-static method from static method - Creating Object

class Practice {
	
	public void method4() {
		System.out.println("I am a non-static method from another class");
	}
	
	static public void method5() {
		System.out.println("I am a static method from another class");
	}
}

