package keywordsInJava;

public class SuperMethodPractice extends Parent_SMP {

	public SuperMethodPractice() {
//		super();
		System.out.println("I am child class default constructor");
	}

	public SuperMethodPractice(int a) {
//		super();
		super(a);
		System.out.println("I am child class int parameterized constructor");
	}
	
	public SuperMethodPractice(String str) {
//		super();
		this();
		System.out.println("I am child class String parameterized constructor");
	}

	public static void main(String[] args) {
//		SuperMethodPractice obj = new SuperMethodPractice();
//		obj.method1();
		
//		SuperMethodPractice obj1 = new SuperMethodPractice(10);
//		obj1.method1();
		
		SuperMethodPractice obj2 = new SuperMethodPractice("10");
		obj2.method1();
	}

	public void method1() {
		System.out.println("I am method1 from child class");
	}

}

class Parent_SMP {

	public Parent_SMP() {
		System.out.println("I am parent class default constructor");
	}

	public Parent_SMP(int a) {
		System.out.println("I am parent class int parameterized constructor");
	}

}
