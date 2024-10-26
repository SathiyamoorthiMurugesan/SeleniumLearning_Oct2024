package A1basicsOfJava;

public class A9VariableAsReturnType {
	
	int ss = 20;

	public static void main(String[] args) {
		A9VariableAsReturnType obj  = new A9VariableAsReturnType();
//		obj.buySoap();
////		obj.buySoapAndReturnMeSoap(10);
//		
//		String str = "abc";
//		System.out.println(str);
//		
////		String xx = obj.buySoapAndReturnMeSoap(10);
//		
//		String soap = obj.buySoap(); //null
////		String soap = obj.buySoapAndReturnMeSoap(10); //"Hamam";
//		System.out.println("************");
//		System.out.println(obj.buySoap());
//		System.out.println("**************");
//		System.out.println(soap);
//		
//		obj.buySoapAndReturnMeBalance(50); //40;
//		System.out.println(obj.buySoapAndReturnMeBalance(50));
//		
//		int abc = obj.buySoapAndReturnMeBalance(50);
//		System.out.println(abc);
//		
////		Lets consider method "obj.buySoapAndReturnMeBalance(50)" takes 10 minutes to run
////		and println method takes 5 minutes to run
////		Below 3 lines takes total of 45 minutes run time
//		System.out.println(obj.buySoapAndReturnMeBalance(50));
//		System.out.println(obj.buySoapAndReturnMeBalance(50));
//		System.out.println(obj.buySoapAndReturnMeBalance(50));
//		
////		Below 4 lines takes total of 25 minutes run time
//		int amount = obj.buySoapAndReturnMeBalance(50);
//		System.out.println(amount);
//		System.out.println(amount);
//		System.out.println(amount);
//		
//		
//		obj.buySoapAndReturnMeSoap(10);
//		int a = 20;
//		obj.buySoapAndReturnMeSoap(a);
//		obj.buySoapAndReturnMeSoap(obj.ss);
		obj.buySoapAndReturnMeSoap(obj.buySoapAndReturnMeBalance(100));
		
		obj.buySoap();
		obj.buySoap(10);
	
	}
	
	
	public String buySoap() {
		System.out.println("Bought soap");
		return null;
//		System.out.println();
	}
	
//	public int buySoap() {
//		System.out.println("Bought soap");
//		return 0;
////		System.out.println();
//	}
	
	public String buySoap(int amount) {
		System.out.println("Bought soap");
		return null;
//		System.out.println();
	}

	public String buySoapAndReturnMeSoap(int soapAmount) {
//		System.out.println("bought soap for 10 rupees");
		System.out.println("Bought soap for the given amount"+ soapAmount+ " rupees");
//		return "Hamam";
		String soapName = "Hamam";
		System.out.println("Bought "+soapName+ " soap");
		return soapName;
	}
	
	public int buySoapAndReturnMeBalance(int soapAmount) {
		System.out.println("bought soap for 10 rupees");
//		return soapAmount - 10;
//		return 0;
		int balanceAmount = soapAmount - 10;
		return balanceAmount;
		
	}
}
