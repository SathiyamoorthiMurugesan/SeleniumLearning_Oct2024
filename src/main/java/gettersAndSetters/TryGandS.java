package gettersAndSetters;

public class TryGandS {

	private int a = 10;
	
	private String myName = "Sathya";

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public static void main(String[] args) {
		
		TryGandS obj = new TryGandS();
		System.out.println(obj.a);

		ABC abc = new ABC();
		abc.method1();
		abc.method2();
		
		System.out.println(obj.a);
	}
	
	
	
	

}

class ABC { 
	
	TryGandS obj = new TryGandS();
//	int c;
	
	public void method1() {
//		System.out.println(a);
		System.out.println(obj.getA());
	}
	
	public void method2() {
//		a = 20;
		obj.setA(20);
		System.out.println(obj.getA());
		
//		c = obj.setA(100);
	}
}
