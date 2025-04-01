package keywordsInJava;

public class ThisPractice {
	
	int abcd = 20;
	String str = "S";

	public static void main(String[] args) {
		
	}
	
	public static void sMethod() {
		sMethod();
//		this.sMethod();
	}
	
	public void exeutionMethod() {
		method1();
		this.method1();
		
		sMethod();
		this.sMethod();
	}
	
	public void method1() {
		
	}
	
	public void method2(int abcd) {
		System.out.println(abcd);
		
		System.out.println(abcd);
		
		ThisPractice obj = new ThisPractice();
		System.out.println(obj.abcd);
		
		System.out.println(this.abcd);
		System.out.println(str);
		System.out.println(this.str);
		
		
		int b = 20;
		System.out.println(b);
//		obj.b; variable b is a local, so its not visible to object variable.
		
	}
	
	public void method3(int x) { 
		
		System.out.println(x);
		System.out.println(abcd);
	}
	
	public void method4() {
		int a = 10;
		
		System.out.println(a);
		
		int abcd = 20;
		System.out.println(abcd);
		
		System.out.println(this.abcd);
	}

}
