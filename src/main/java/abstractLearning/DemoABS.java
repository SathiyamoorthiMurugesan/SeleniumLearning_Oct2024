package abstractLearning;

public abstract class DemoABS {
	
	public DemoABS() {
		
	}

	public int a = 10;
	private int b = 20;
	protected int c = 30;
	int d = 40;

	static public int a1 = 10;
	static private int bb = 20;
	static protected int cc = 30;
	static int dd = 40;

	public abstract void method1();
//	private abstract void method11();
	protected abstract void method12();
	abstract void method13();

	public void method2() {

	}
	
	private void method22() {
		
	}
	
	protected void method23() {
		method22();
	}
	
	void method24() {
		
	}
	
//	static public abstract void method31();
//	private static abstract void method32();
//	static protected abstract void method33();
//	static abstract void method34();

	static public void method41() {

	}
	
	static private void method42() {
		
	}
	
	static protected void method43() {
		
	}
	
	static void method244() {
//		DemoABS obj = new DemoABS();
	}
	
//	body method - Concrete method
//	body less method - abstract method 
}

class BBB extends DemoABS {
	
	
	public void methodB1() {
		BBB obj = new BBB();
		obj.method1();
		obj.method2();
		
		DemoABS.method41();
		
//		DemoABS obj2 = new DemoABS();
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void method12() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void method13() {
		// TODO Auto-generated method stub
		
	}
}

class CCABS extends DemoABS {
	
	public static void main(String[] args) {
//		DemoABS obj = new DemoABS();
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void method12() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void method13() {
		// TODO Auto-generated method stub
		
	}
	
}
