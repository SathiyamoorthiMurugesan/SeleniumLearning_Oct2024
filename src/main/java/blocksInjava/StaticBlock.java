package blocksInjava;

public class StaticBlock {
	
	static int x = 10;
	int y = 20;
	
	static {
		System.out.println("I am static block start");
		int a = 10;
//		static int b = 20;
		final int c = 1;
		
		
		System.out.println(x);
		test1();
//		buySoap();
		StaticBlock obj = new StaticBlock();
		obj.buySoap();
		System.out.println(obj.y);
		System.out.println("I am static block end");
	}
	
	public static void test1() {
//		System.out.println(a);
		System.out.println("I am static method");
	}
	
	public void buySoap() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		System.out.println("Main method");
		StaticBlock test = new StaticBlock();
		test.buySoap();
	}

}
