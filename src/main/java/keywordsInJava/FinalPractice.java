package keywordsInJava;

public class FinalPractice extends FinalParent{
	
	int abc = 10;
	final int a;
	final int b = 20;
	String str = "abc";
	
	public FinalPractice() {
		a = 10;
//		a = 20;
	}
	
	public void methodAA() {
		System.out.println("I am parent class methodAA");
		final int ab;
		ab = 20;
//		ab =21;
		
		final int a = 20;
//		a = 21;
	}
	
//	public void methodBB() {
//		System.out.println("I am parent class methodBB");
//	}

	public static void main(String[] args) {
		
		FinalPractice obj = new FinalPractice();
		obj.abc = 101;
//		obj.b = 21;
	}

}

//class FinalParent extends ABC {
class FinalParent {
	public void methodAA() {
		System.out.println("I am parent class methodAA");
	}
	
//	static final public void methodBB() {
	final public void methodBB() {
		System.out.println("I am parent class methodBB");
	}
}

final class ABC {
	public void methodABC() {
		System.out.println("I am parent class methodABC");
	}
}
