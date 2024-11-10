package inheritanceInJava;

//public class MultipleInheritance {
//public class MultipleInheritance extends ClassA {
//public class MultipleInheritance extends ClassB {
//public class MultipleInheritance extends ClassA, ClassB {
//public class MultipleInheritance implements Interface1 {
//public class MultipleInheritance implements Interface2 {
//public class MultipleInheritance implements Interface1, Interface2 {
//public class MultipleInheritance implements Interface1 extends ClassA {
//public class MultipleInheritance extends ClassA implements Interface1 {
public class MultipleInheritance extends ClassA implements Interface1, Interface2 {
//public class MultipleInheritance extends ClassA, ClassB implements Interface1 {

	public void methodMLI() {

	}

	public static void main(String[] args) {
		MultipleInheritance obj = new MultipleInheritance();
		ClassA obj1 = new MultipleInheritance();
		Interface1 obj2 = new MultipleInheritance();
		Interface2 obj3 = new MultipleInheritance();

	}

}

class ClassA implements Interface1, Interface2 {

	@Override
	public void method2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub

	}

	public void methodA() {

	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

}

class ClassB implements Interface1, Interface2 {

	@Override
	public void method2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub

	}

	public void methodB() {

	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

}

interface Interface1 {
	public void method1();

	default void method11() {

	}
}

interface Interface2 extends Interface3 {
	public void method2();

	default void method22() {

	}
}

interface Interface3 {
	public void method3();

	default void method33() {

	}
}
