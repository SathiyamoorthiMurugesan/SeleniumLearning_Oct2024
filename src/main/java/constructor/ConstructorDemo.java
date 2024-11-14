//* Constructor is not a method
//* Constructor name should be as same as Class Name
//* Constructor should not have any return type
//* Constructor can be parameterized or non parameterized (Overloading)
//* Constructor belongs to the class
//* We can create variables inside Constructor(local variable). 
//* We can call Class level variables(either static or non-static) and methods(either static or non-static) inside Constructor by without creating object inside Constructor 
//* Constructor used to assign values to instance variables, especially when they are private or final
//* Each class have its own constructor(default constructor) and it is hidden always (means implicitly available)
//* Whenever we create object for a class, after copying non static variables and methods, default constructor will always run;
//		* Since default constructor is implicit and does not have anything in it, we dont see it running
//		* If we explicitly put something in default constructor, while object creation, we can see it running
//* When we create a parameterized constructor, default constructor dies. Means, we can not create object without parameters. 
//		* In the same situation, if you want to create object without parameters, you need to explicitly define default constructor


//* How to call constructor?
//	It can be called by creating an object.
//	By default when an object is created default constructor will be called implicitly. 
//		ConstructorDemo test = new ConstructorDemo();
//	Also you can call parameterized constructor by passing parameter explicitly .
//		ConstructorDemo test1 = new ConstructorDemo(10);
//	
//* How to assign a value to a final variable?
//		1.1	Final variable assigned value:
//			eg: final int c=10;
//		Once we assign the value to final variable globally , we cannot re-assign or change the 
//		value of final variable either in constructor or normal method.
		
//		1.2 Final variable not initialized:
//			If final variable is declared but not initialized. Then the following are possible
//				*We must initialize the final variable value in each constructor inside a class
//				*If we initialize value inside normal method , then it throws error final variable cannot be assigned.
		

//* How to call one constructor from another?
//		* We can not call constructor from any methods directly. But we can use object creation to call a constructor.
//		* Within class, we can call one constructor from others by using this() or this(parameter); 
//		* We can call one constructor from another constructor when inheritance concept is applicable.
//		* As we know when we create class, default constructor is always created and it is implicit in nature.
//		* So, when we create object for child class, firstly, child class default constructor will be called, but within child class constructor, super() is implicitly present,
//			and it will call parent class's default constructor. 
//		* Event if we create parameterized object for child class, parameterized child class constructor will always run parent class's default constructor(super()) and executes the 
//			child class's parameterized constructors content.
//		* If we want to run parent class parameterized constructor by creating parameterized child class object, then, we need to put super(parameter) in child class's construtor
//		* We can overload a constructor.

//* Can constructor be private?
//		* Yes we can make it as private. But it cannot be used/call outside the class.
//		* Which means, if a constructor is private, we can not create object for that class in some other class. (abstraction?)

//*	Can constructor be static?
//		No, we can have only default, public,private and protected modifier for the constructor.
//			public static ConstructorDemo()-->Not permitted
//			public  ConstructorDemo()-->Permitted
//		static also belongs to the class and Constructor also belongs to the class. So no need of creating constructor as static

//* Explicitly writing default constructor is called overriding.

package constructor;

public class ConstructorDemo {
	
	
//	Default constructor but written explicitly 
	public ConstructorDemo() {
		System.out.println("I am constructor");
	}
	
	public ConstructorDemo(int a) {
		System.out.println("I am parameterized constructor");
	}
	
	public void method1() {
//		ConstructorDemo();
		System.out.println("This is a method");
	}
	
	public void method2(int a) {
		System.out.println("I am parameterized method");
	}
	
	public static void main(String[] args) {
		
//		ConstructorDemo();
		
		ConstructorDemo obj = new ConstructorDemo();
		obj.method1();
		obj.method2(10);
		
		ConstructorDemo obj1 = new ConstructorDemo(20);
		obj1.method1();
		obj1.method2(100);
		
		ConstructorDemo obj2 = new ConstructorDemo();
		obj2.method1();
		obj2.method2(10);
		
//		System.out.println(TestConstructor.abc);
		
//		TestConstructor test = new TestConstructor();
		
	}
	
}
























