package abstractLearning;

public abstract class AbstractC1 {
	
	public abstract void method1();
	
	abstract void method12();
	
	public void method2() {
		
	}
	
	public static void method3() {
		
	}
	
//	public static abstract void method4();
	
//	static abstract void method4();
	
//	protected static abstract void method4();
	
//	private static abstract void method4();

}

interface  A1 {

public void method1();

}


interface A2 extends A1 {

	
public void method2();


}

class C1 implements A1 {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

}

abstract class C2 implements A1 {
	
//	C2 obj1 = new C2();

	public abstract void methodC20();
	
	public void methodC21() {
//		C2 obj = new C2();
	}
	
	public static void methodC22() {
		
	}
}

class C3 extends C2 {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodC20() {
		// TODO Auto-generated method stub
		
	}
	
	public void executingMethod() {
		C3 obj = new C3();
		obj.methodC21();
		obj.methodC20();
		
		C2.methodC22();
		
	}
	
	
}







