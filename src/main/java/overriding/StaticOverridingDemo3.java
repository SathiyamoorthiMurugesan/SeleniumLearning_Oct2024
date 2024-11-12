package overriding;

public class StaticOverridingDemo3 extends Parent2{

	public static void main(String[] args) {
		buySoap();
		Parent2.buySoap();
		
	}
	
	
	
	public static int buySoap() {
		System.out.println("Buy Lux soap");
		return 0;
	}
	
}

class Parent2 {
	
	public static int buySoap() {
		System.out.println("Buy Hamam soap");
		return 10;
	}
	
}