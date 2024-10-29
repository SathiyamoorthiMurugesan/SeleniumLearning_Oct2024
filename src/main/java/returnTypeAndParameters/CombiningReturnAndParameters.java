package returnTypeAndParameters;

public class CombiningReturnAndParameters {

	int abc = 10;
	static int cd = 10;
	
	int money2 = 0;

	public static void main(String[] args) {

		CombiningReturnAndParameters obj = new CombiningReturnAndParameters();
		obj.buySoap(10); // value is directly given or hardcoded

		int a = 10;
		obj.buySoap(a); // value is given by using local variable

		obj.buySoap(obj.abc); // value is given by using non-static or static variable.
		obj.buySoap(cd);
		
		ClassABC obj2 = new ClassABC();  //value is given from another class 
		obj.buySoap(obj2.val1);
		obj.buySoap(ClassABC.val2);
		
		
//		Assigning method return type to a local variable;
		int money = obj.getMoneyFromATM(); //int money = 100; 
		
		System.out.println(obj.money2);
//		Assigning method return type to a class level variable
		int money2 = obj.getMoneyFromATM();
		System.out.println(obj.money2);
		
//		Assigning method return type to a local variable;
		int money1 = obj.getMoneyFromATM(); //int money1 = 100;
//		int a = 10;
//		obj.buySoap(a); // value is given by using local variable
		obj.buySoap(money1);
		obj.buySoap(obj.getMoneyFromATM());
		
		obj.buySoap(obj2.getMoneyFromFather());
//		obj.buySoap(200); //Bought 200 rupees soap.
	}

	public void buy10RupeesSoap() {
		System.out.println("Bought 10 rupees soap");
	}

	public void buy20RupeesSoap() {
		System.out.println("Bought 20 rupees soap");
	}

	public void buy30RupeesSoap() {
		System.out.println("Bought 30 rupees soap");
	}

	public void buySoap(int soapAmount) {
		System.out.println("Bought " + soapAmount + " rupees soap");
	}

	public int getMoneyFromATM() {
		return 100;
	}
	
	public int buyDress(int dressAmount) {
		int dressOriginalAmount = 200;
		return dressAmount- dressOriginalAmount;
	}
	
	public int callAPersonAndGetMoneyFromHim(String personName) {
		
		return 100;
	}

}

class ClassABC {

	int val1 = 10;
	static int val2 = 20;
	
	public int getMoneyFromFather() {
		return 200;
	}
}
