//* final is a keyword in java
//* final can be used with variables, methods and classes
//* If we declare a variable as final, the value of the variable can not be changed ANYWHERE
//* If a method is declared as final, then we can not override it
//* If a method is declared as final, then we can overload it
//* If we use final keyword with a class, no class can inherit(extend) it
//		e.g String class in Java--> String is a final class in java
//* we can not create interface as final. There is no point in using final with interface
//* variables declared in interface are final in nature
//* Variable/method can be declared as final in both static and non static methods
//*	Variables declared as final in class level must be initialized whereas variables declared as final inside a method need not be initialized
//* Variables declared as final in class level need to initialized in all the constructors if they are not initialized while declaring

//finalize() method

//The finalize() method in Java is a special method that the garbage collector calls on an object 
//when it determines that there are no more references to the object. 
//This method is defined in the Object class and can be overridden by any class. 
//The purpose of the finalize() method is to give an object the opportunity to clean up resources 
//before it is reclaimed by the garbage collector.
//package keywordsInJava;

public class FinalDemo extends ParentFinal implements FinalInterface {
	
//	public final static int a = 10;
//	public static final int b = 11;
//	static public final int c = 12;

	final int a = 10;
	final int b;
	int aa = 100;
	String str;

	public FinalDemo() {
		b = 20;
	}
	
	public FinalDemo(int a) {
		b = 20;
	}

	public static void main(String[] args) {
		FinalDemo obj = new FinalDemo();
		System.out.println(obj.a);
//		obj.a = 100;
		System.out.println(obj.aa);
		System.out.println(obj.aa = 150);
//		System.out.println(obj.a = 150);

		System.out.println(test);
//		test = 11;
//		System.out.println(test);
		
		final String str1;
		str1 = "Sathya";
//		str1= "Hello";
		
		System.out.println("*******************************");
		System.out.println("Override check");
		
		ParentFinal obj11 = new FinalDemo(); //Override
		obj11.method1();
	}

	public void method1() {
		System.out.println("I am a normal method without parameter");
	}

//	public final void method2() {
//		System.out.println("I am a final method without parameter");
//	}

	public final void method2(int aa) {
		System.out.println("I am a final method with int parameter");
	}

	public final void method2(String a) {
		System.out.println("I am a final method with String parameter");
	}
	
	final public static void method3() {
		
	}
	
	static final public void method4() {
		
	}

}

class ParentFinal {
//class ParentFinal extends TestFinal { 

	public void method1() {
		System.out.println("I am a normal method without parameter from parent");
	}

	public final void method2() {
		System.out.println("I am a final method without parameter from parent");
	}

}
final class TestFinal {
//final class TestFinal extends ParentFinal{

}

interface FinalInterface {
	int test = 10;
	
//	default void method11() {
//		System.out.println(test = 20);
//	}

}
