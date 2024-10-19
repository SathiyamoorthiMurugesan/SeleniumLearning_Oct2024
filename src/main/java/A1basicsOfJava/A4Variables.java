package A1basicsOfJava;

public class A4Variables {
	
//	local variables (variable with default access modifier)
//	class variables (non static variables)
//	static variables
	
	
//	class variables
//	* It is created inside of a class  but outside of methods
//	* we can use a class variable in both static and non-static methods of the class or outside of the class
//	* We dont get error, if we do not initialize the class variable
//	Within a class 
//		How to use a class variable?
//				1) inside a static method
//				2) inside a non-static method
		
	
	int a3 = 100;   // accessModifier datatype variableName = variableValue;
	String str; 
	
//	static variables
	
	static int a4 = 200;
	static String str1;
	
//	* It is created inside of a class  but outside of methods and we need to use "static" keyword
//	* we can use a static variable in both static and non-static methods of the class or outside of the class
//	* We dont get error, if we do not initialize the class variable
	
	
//	**** static means belongs to the class. means we can use a static variable/method, anywhere within a class.
	
	public static void main(String[] args) {
		
		int a3 = 100;
//		static int a4 = 200;
		
//		* Local variables - declared and initialized inside a method
//		* we can not simply declare and leave a local variable. we need to initialize it.
//		* Without initialization we can not use the local variable, inside the same method.
//		* We can not use a locally declared variable outside of that method.
//		
		
//		AccessModifier dataType variableName = variableValue;
//		public int a = 10;
//		default int a = 10;
//		private int b = 10;
//		protected int c  = 10;
		
		int a1 = 10;
		boolean b1 = true;
		char c1 = '1';
		String s1 = "Sathya";
		
		
		int a2;
		boolean b2;
		char c2;
		String s2 ;
		
		a2 = 20;
		b2 = false;
		c2 = '2';
		s2 = "Selenium";
		
//		int a4; 
//		System.out.println(a4);
			
		
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c1);
		System.out.println(s1);
		
		System.out.println(a2);
		System.out.println(b2);
		System.out.println(c2);
		System.out.println(s2);
		
//		System.out.println(a3);
//		System.out.println(str);
		
//		public int pub = 10;
//		private int pri = 20;
//		protected int pro = 30;
		
	}
	
	int aaa = 200;
	String sss = "abc";
	
	
	static int bbb = 20;
	static String ccc = "any";
	
	public void method1() {
//		trying to use another class local variable in some another method 
//		System.out.println(a1);
		
//		static int a4 = 200;
//		public int aa = 10;
		
//		trying to use class variables inside a non static method
		System.out.println(aaa);
		System.out.println(sss);
		
//		Within a same class, we can use a non static variable in a non static method
		
		
//		trying to use static variables inside a non static method
		System.out.println(ccc);
		System.out.println(bbb);
		
//		Within a same class, we can use a static variable in a non static method
	}
	
	public static void method2() {
		
//		static int a4 = 200;
		
//		trying to use another class local variable in some another method
//		System.out.println(a1);
		
//		trying to use class variables inside a static method
//		System.out.println(aaa);
//		System.out.println(sss);
		
//		Within a same class, we can not use a non static variable inside a static method directly 
//		in order to use that, you need to create an Object for the class
		
//		GovtHospital MedicalCamp = new GovtHospital();
		
		A4Variables obj = new A4Variables();
		System.out.println(obj.aaa);
		System.out.println(obj.sss);
		
//		trying to use static variables inside a static method
		System.out.println(ccc);
		System.out.println(bbb);
		
//		Within a same class, we can use a static variable in a static method
	}

}
