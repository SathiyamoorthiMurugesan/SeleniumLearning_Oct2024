package abstractLearning;

public abstract class DemoAbstract1 implements TestInterface {
	
	int c = 20;
	static int d;
	
	static String e = "abc";
	
	protected int cd = 40;
	private int de = 50;
	

	public static void main(String[] args) {

	}
	
	public void method1() {
		int a = 10;
	}

	public static void method2() {
		int b;
	}

	public int method3() {

		return 0;
	}

	public static String method4(char c) {

		return null;
	}
	
//	public void method5();
	public abstract void method5();
	
//	public static abstract void method6();

}

abstract class ClassAA {
	
	
	public abstract void method1();
		
	
}

class ClassAB implements TestInterface {

	@Override
	public void method11() {
		// TODO Auto-generated method stub
		
	}
	
}
