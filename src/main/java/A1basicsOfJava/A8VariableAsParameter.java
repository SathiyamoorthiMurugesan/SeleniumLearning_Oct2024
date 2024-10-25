package A1basicsOfJava;

public class A8VariableAsParameter {
	
	int b = 20;
	static int c = 30;
	
//	String str = "abc"; //word
//	String str = "1"; //single letter
//	String str = "@"; //single special letter
//	String str = "abc cde dksaj lkdlaskl"; //sentence
	String str1 = ""; //empty
	String str2= "    "; //blank
	String str = null;
	
	
	
	public static void main(String[] args) {
		
		int a = 10;
		
		A8VariableAsParameter obj = new A8VariableAsParameter();
		obj.buySoap(); //calling method
		
		obj.buyHamamSoap();
		obj.buyLuxSoap();
		obj.buyCintholSoap();
		
		obj.buySoap("Yellow color Cinthol");
		obj.buySoap("Hamam"); //here Hamam is parameter or argument
		
		obj.buySoap(null);
		obj.buySoap("null");
		
		obj.buySoap(100);
		
		obj.buyLottery(1000);
		
		obj.buySoap("Hamam", 100);
		
		obj.addTwoNumbers(10, 20);
	}
	
	public void buySoap() { //called method
		System.out.println("Bought soap");
	}
	
//	public void buySoap() { //called method
//		System.out.println("Bought soap");
//	}
	
	public void buyHamamSoap() {
		System.out.println("Bought Hamam soap");
	}
	
	public void buyLuxSoap() {
		System.out.println("Bought Lux soap");
	}
	
	public void buyCintholSoap() {
		System.out.println("Bought Cinthol soap");
	}
	
	public void buySoap(String soapName) {
//		String soapName = "Mysore";
//		System.out.println("Bought Hamam soap");
//		System.out.println("Bought "+soapName+" soap");
//		System.out.println("Bought "     +    soapName     +      " soap");
//		System.out.println("Bought soap "+soapName);
		System.out.println(soapName+" soap bought");
	}
	
	public void buySoap(int soapAmount) {
		System.out.println("Bought "+soapAmount+" rupees soap");
	}
	
	public void buyLottery(long lotteryNumber) {
		System.out.println("hello");
	}
	
	public void buySoap(String soapName, int soapAmount) {
		System.out.println("Buy "+soapAmount+ " rupees "+soapName+ " soap");
	}
	
	public void buySoap(int soapAmount, String soapName) {
		System.out.println("Buy "+soapAmount+ " rupees "+soapName+ " soap");
	}
	
	public void buySoapGivenSoap(String soapName, int soapAmount) {
		System.out.println("Buy "+soapAmount+ " rupees "+soapName+ " soap");
	}
	
	public void loginAmazonApplication(String userName, String password) {
		
		System.out.println("Enter "+userName+ " in Amzaon login page's username box");
	}
	
	
	public void addTwoNumbers(int a, int b) {
		System.out.println("Addition of two number "+a+ " and "+b+ " is: ");
		System.out.println(a+b);
	}
	
	
	

}
