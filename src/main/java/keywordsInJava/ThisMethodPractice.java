package keywordsInJava;

public class ThisMethodPractice {
	
//	this();
	public ThisMethodPractice() {
		this(10);
//		this("a");
		System.out.println("I am the default constructor");
//		this();
	}
	
	public ThisMethodPractice(int a ) {
		this("abc");
		System.out.println("I am the int parameterized constructor");
	}
	
	public ThisMethodPractice(String a ) {
		System.out.println("I am the String parameterized constructor");
	}
	

	public static void main(String[] args) {
		ThisMethodPractice obj = new ThisMethodPractice();
		obj.method1();
//		this.ThisMethodPractice();
//		this();
		
		
	}

	public void method1() {
		System.out.println("I am method1 from ThisMethodPractice class");
//		this();
	}

}
