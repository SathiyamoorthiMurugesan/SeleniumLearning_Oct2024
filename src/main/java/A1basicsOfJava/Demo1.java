package A1basicsOfJava;

public class Demo1 {
	
//	Example for having class as a return type
//	String

	public static void main(String[] args) {
		Demo1 obj = new Demo1();
		int val = obj.methodB();
//		val.
		
//		class ex = obj.methodA();
//		Object ex = obj.methodA();
	
		obj.methodA();//Demo2
		
		System.out.println(obj.methodA().a);
		obj.methodA().method1();
		System.out.println(obj.methodA().b);
		System.out.println(Demo2.b);
		
		
		Demo2 obj2 = new Demo2();
		System.out.println(obj2.a);
		obj2.method1();
		System.out.println(obj2.b);
		Demo2.method2();
		
	}
	
	public Demo2 methodA() {
		System.out.println("I am methodA from Demo1");
//		return null;
		Demo2 obj = new Demo2();
		return obj;
	}
	
	public int methodB() {
		System.out.println("I am methodB from Demo1");
//		return 10;
		int c = 20;
		return c;
	}
	
	public Demo1 methodC() {
		System.out.println("");
		return null;
	}

}


class Demo2 {
	
	int a = 10;
	static int b = 20;
	
	public void method1() {
		System.out.println("I am method1 from Demo2");
	}
	
	public static void method2() {
		System.out.println("I am method2 and static from Demo2");
	}
}
