package gettersAndSetters;

public class PracticeGetterSetter {

	private int a = 10;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public static void main(String[] args) {
		PracticeGetterSetter obj = new PracticeGetterSetter();
		System.out.println(obj.a);

		GS obj1 = new GS();
		obj1.method1();
		System.out.println(obj.a);

	}
}

class GS {

	int c;

	public void method1() {
//		System.out.println(a);
		PracticeGetterSetter obj = new PracticeGetterSetter();
		System.out.println(obj.getA());

		c = obj.getA();
		System.out.println(c);

		obj.setA(1000);

		System.out.println(obj.getA());
	}

}

class GSPractice1 extends PracticeGetterSetter {

	public static void main(String[] args) {

		GS obj1 = new GS();
		obj1.method1();

		GSPractice1 obj = new GSPractice1();
		obj.method2();
	}

	public void method2() {
//		System.out.println(a);
		System.out.println(getA());
	}
}
