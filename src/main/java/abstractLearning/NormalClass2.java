package abstractLearning;

public class NormalClass2 implements TestInterface {

	@Override
	public void method11() {
		System.out.println("hello");
	}

	int a = 10;

	public void method3() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		NormalClass2 Obj = new NormalClass2();
		System.out.println(Obj.a);

	}

}
