package keywordsInJava;

public class SuperPractice extends ParentSP {

	int abcd = 20;

	public static void main(String[] args) {
		SuperPractice obj = new SuperPractice();
		obj.exeMethod();
	}

	@Override
	public void method1() {
		System.out.println("I am child class method1");
	}

	public static void method2() {

	}

	public void exeMethod() {
		System.out.println(abcd);

		System.out.println("*****");
		ParentSP obj1 = new ParentSP();
		System.out.println(obj1.abcd);

		SuperPractice obj2 = new SuperPractice();
		System.out.println(abcd);
		System.out.println(this.abcd);
		System.out.println(obj2.abcd);
//		************I want abcd from parent class when I have object created with child as ref class*********
		System.out.println(super.abcd);

		ParentSP obj3 = new SuperPractice();
		System.out.println(obj3.abcd);
		obj3.method1();
//		********I want method1 from Parent class when we only have obj3***************
		super.method1();
		
		this.method2();
		ParentSP.method2();
		super.method2();//here super rep, ParentSP.
	}

}

class ParentSP {
	int abcd = 200;

	public void method1() {
		System.out.println("I am parent class method1");
	}

	public static void method2() {

	}
}
