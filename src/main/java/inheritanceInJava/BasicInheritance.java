package inheritanceInJava;

//public class BasicInheritance {
public class BasicInheritance extends Parent1 {

	int aa = 100;
	static int bb = 200;

	public void methodA() {
		System.out.println("I am non static method from BasicInheritance class");
	}

	public static void methodB() {
		System.out.println("I am static method from BasicInheritance class");
	}

	public static void main(String[] args) {

//		Calling static and non-static methods from Parent class
		Parent1 obj = new Parent1();
		System.out.println(obj.a);

		obj.method1();

		System.out.println(Parent1.b);
		Parent1.method2();

//	****************************************************

//		Calling static and non-static methods from BasicInheritance class 
		BasicInheritance obj1 = new BasicInheritance();
		System.out.println(obj1.aa);

		obj1.methodA();

		System.out.println(bb);
		methodB();

//		***************************************************
//		When Parent1 and BasicInheritance are in a relationship, means inheritance
		BasicInheritance obj2 = new BasicInheritance();
		System.out.println(obj2.aa);

		obj2.methodA();

		System.out.println(obj2.a);

		obj2.method1();

	}

	public void main() {
		Parent1 obj = new Parent1();
		System.out.println(obj.a);

		obj.method1();

		System.out.println(Parent1.b);
		Parent1.method2();
	}

}

class Parent1 {

	int a = 10;
	static int b = 20;

	public void method1() {
		System.out.println("I am non static method from Parent1 class");
	}

	public static void method2() {
		System.out.println("I am static method from Parent1 class");
	}

}
