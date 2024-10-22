package packageA;

public class Class10 {

	int a = 10;
	public int b = 20;
	private int c = 30;
	protected int d = 40;

	static int sa = 10;
	static public int sb = 20;
	static private int sc = 30;
	static protected int sd = 40;

	public void method1() {

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}

	public static void method2() {

		Class10 obj = new Class10();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);

	}

}
