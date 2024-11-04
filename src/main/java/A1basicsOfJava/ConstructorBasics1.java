package A1basicsOfJava;

public class ConstructorBasics1 {
	
	int aa = 20;
	
	final int bb = 30;
	
	final int cc;

	public ConstructorBasics1(int a) {
		this.cc = 10;
		System.out.println("I am the constructor");
//		public int a = 10;
//		static int c = 20;
		int c = 20;
		method1();
		method2();
		
		final int abc;
		abc = 20;
//		abc = 30;
		
		final int cd = 20;
//		cd = 22;
	}

	public ConstructorBasics1() {
		this.cc = 20;

	}

	public ConstructorBasics1(String abc) {
		this.cc = 30;

	}
	
	public ConstructorBasics1(boolean abc) {
		this.cc = 40;

	}
	
	public ConstructorBasics1(String abc, int a) {
		this.cc = 10;

	}
	
	public ConstructorBasics1(int a, String abc) {
		this.cc = 20;

	}

	public void method1() {
		System.out.println("I am non-static method");
//		public int a = 10;
//		static int c = 20;
	}

	public static void method2() {
		System.out.println("I am a static method");
	}

	public static void main(String[] args) {
		
//		System.out.println(obj.cc);
		ConstructorBasics1 obj = new ConstructorBasics1();
//		obj.method1();
		System.out.println(obj.cc);
		
		ConstructorBasics1 obj1 = new ConstructorBasics1(10);
		System.out.println(obj.cc);
		
		ConstructorBasics1 obj2 = new ConstructorBasics1(10, "AA");
		System.out.println(obj.cc);

		System.out.println(obj.aa);
		obj.aa = 21;
		System.out.println(obj.aa);
		
		System.out.println(obj.bb);
//		obj.bb = 100;
		
		
	}

}
