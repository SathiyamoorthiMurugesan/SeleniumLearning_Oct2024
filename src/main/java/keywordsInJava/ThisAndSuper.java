package keywordsInJava;

//*****this keyword and this()************************

//* this. keyword is used to call instance/class variables and methods. 
//* this. keyword is always present implicitly when we call instance/class variables and methods within the class.
//	* We can use this., to differentiate run time variables/local variable from instance variables;
//	* Also by using this., we can assign runtime values to instance variables
//* When we call a non static method from another non static method in a same class, "this." is used implicitly while calling
//	* calling a method(), is same as this.method() with in a same class. Only for calling non-static from static, we need to create object


//* We can use this(), to call other constructors from any constructors within a class.
//* this() should be used within a constructor only. Means, we can not use it in methods.
//* this() MUST be first statement in constructor calling
//		- Constructor call must be the first statement in a constructor
//* since this() should be used as first line in constructor, we can not call more than one constructor from a constructor.
//		* means, we can not call more than one constructor from any constructor

//* within a class, 
//	1) we can simply call static method from another static method (this keyword is applied implicitly, but we always prefer static type calling)
//	2) We can simply call non-static method from another non-static method (this keyword is applied implicitly)
//	3) We need to create object to call a non-static method from a static method
//	4) We can simply call static method from non-static method (this keyword is applied implicitly, but we always prefer static type calling)

//* We can not use this. keyword inside a static method.
//* We could call only one constructor from another constructor. We can not call multiple constructor from one constructor because this() should
//	be first line inside a constructor
//* We can pass variable name inside this() but the variable should be static.

//*********** super and super()************************

//* super is keyword, it can be used with variables(static and non static), methods(static and non static) and constructors
//* super can not be used in main method or static method
//* whenever a child class overrides, variable and method of a parent class and if we want to use parent class variable and method
//	* in child class method, then we use super keyword to call parent class overridden method or variable.

//* All child class constructors have super() method written implicitly.
//* If we written super() explicitly, we cant use this() inside constructor. 
//	But while super() is implicit, we can use this(). So in this case both super() and this() will run; THIS IS WRONG
//* super(); 
//* whenever we call a child class constructor, parent class constructor will be always called because
//	* in child class constructor, super() keyword is implicitly written and it will call the parent class default constructor
//* Child class's parameterized constructor ALWAYS have super() implicitly written but NOT super(parameterized);
//* Parameter passed in child class constructor wont be passed to super()
//* If we want our child class's parameterized constructor to call parent class's parameterized constructor,
//	* then we need to pass the parameter to super() by overriding it. e.g(super(5) or super("Sathya"))

//* From child class constructor, we can either call parent class constructor(super()) or child class constructor(this()).





public class ThisAndSuper extends SuperParent {
	
	int a =10;
	int aa = 20;
	static int b = 20;
	
	public ThisAndSuper(int a) {
		System.out.println(this.a);
		
		this.a = a;
		a = this.a;
		
		System.out.println(this.aa);
	}

	public static void main(String[] args) {
//		method1(10);
		method2("a");
	}
	
	public void exeMethod() {
		method1(10);
//		this.method1(12);

		method2("a");
//		this.method2("a");
		
		System.out.println(a);
//		System.out.println(this.a);
		
		method1(10); //this is same as this.method1(10); Child class method1(int a) will be called
		super.method1(10); 
		
		method11(10); //super.method11(10);
		
		
	}
	
	public void method1(int a) {
		
//		this(20);
		System.out.println("I am a non-static method from child");
		
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
		
		int aa = 25;
		System.out.println(aa);
		System.out.println(this.aa);
		
		System.out.println(this.a);
		System.out.println(super.a);
		
		System.out.println(c);
		int c = 24;
		System.out.println(super.c);
		
//		this(10);
		
		
		
		
		
		
	}
	
	public static void method2(String a) {
		System.out.println("I am a static method from child");
	}

}

class SuperParent {
	int a =10;
	int c = 30;
	static int b = 20;

	public static void main(String[] args) {

	}
	
	public void method1(int a) {
		System.out.println("I am a non-static method from Parent");
	}
	
	public void method11(int a) {
		System.out.println("I am a non-static method from Parent");
	}
	
	public static void method2(String a) {
		System.out.println("I am a static method from Parent");
	}
}
