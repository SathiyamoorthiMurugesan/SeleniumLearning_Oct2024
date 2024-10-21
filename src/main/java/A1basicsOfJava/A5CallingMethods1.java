package A1basicsOfJava;

public class A5CallingMethods1 {
	
	
//	We can create object of a class in another class 
//		* (eg: creating object for Class22 inside of CallingMethods1)
	
//	For reference: 
//		* Which method you are going to call is matters
//		* Which class you are going to call also matters
//		* static methods/variables always belongs to the class
	
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
	
//	With in A class
//		* Calling a static method from non-static method 
//				- Direct
//		* Calling a static method from static method 
//				- Direct
//		* Calling a non-static method from non-static method 
//				- Direct/ Object Creation
//		* Calling a non-static method from static method 
//				- Object Creation
	
//	withInAClass(from)		static			non-static
//	static 				    DIRECT          OBJECT CREATION
//	non-static              DIRECT          DIRECT/OBJECT CREATION
	
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&

	
//	Outside a class
//	* Calling a static method of another class from non-static method 
//			- ClassName + static method name
//	* Calling a static method of another class from static method 
//			- ClassName + static method name
//	* Calling a non-static method of another class from non-static method 
//			- Object Creation
//	* Calling a non-static method of another class from static method 
//			- Object Creation
	
//	OutsideOfClass		static			   non-static
//	static 				CLASSNAME          OBJECT CREATION
//	non-static          CLASSNAME          OBJECT CREATION
	
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
	
//	CONCLUSTION
//	When you are going to call a 
//		* Non-static - Object Creation
//		* static - direct(within a class) or along with class name (outside of class)

	
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void methodA() {
		System.out.println("I am a non-static method A from CM class");
		
//		Within A class
//		From non-static method (methodA())
//			* Calling a static method (methodD())
		methodD();
		
		
//		Within A class
//		From non-static method (methodA())
//			* Calling a non-static method (methodB())
		methodB();
		A5CallingMethods1 obj2 = new A5CallingMethods1();
		obj2.methodB();
		
//		&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		
//		Outside of class
//		From non-static method (methodA())
//			* Calling a static method (methodBB() - From Class22)
		
		Class22.methodBB();
		
//		reference: Conducting Govt Hospital's medical camp at Police Station(Class)
//		GovtHospital medicalCamp = new GovtHospital():
		
//		Outside of class
//		From non-static method (methodA())
//			* Calling a non-static method (methodAA() - From Class22)
		Class22 obj = new Class22();
		obj.methodAA();
		
		
		
	}

	public void methodB() {
		System.out.println("I am a non-static method B from CM class");
	}

	static public void methodC() {
		System.out.println("I am a static method C from CM class");
		
//		Within A class
//		From static method (methodC())
//			* Calling a static method (methodD())
		methodD();
	
//		Within A class
//		From static method (methodC())
//			* Calling a non-static method (methodB())
		
//		methodB();
		A5CallingMethods1 obj = new A5CallingMethods1();
		obj.methodB();
		
//		&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		
//		Outside of class
//		From static method (methodC())
//			* Calling a static method (methodBB() - From Class22)
		Class22.methodBB();
		
	
//		Outside of class
//		From static method (methodC())
//			* Calling a non-static method (methodAA() - From Class22)
		Class22 obj1 = new Class22();
		obj1.methodAA();
		
		
	}

	public static void methodD() {
		System.out.println("I am a static method D from CM class");
	}

}

class Class22 {
	
	public void methodAA() {
		System.out.println("I am a non-static method AA from Class22");
	}
	
	public static void methodBB() {
		System.out.println("I am a static method BB from class22");
	}
	
}

