package A1basicsOfJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//***Variable as a parameter****

// Class can be parameter too 
// Parameters are always local variable

public class X1VariableAsParameter {
	

	int a = 10;
	static String str = "Sathya";

	public static void main(String[] args) {
		
		int c = 20;
		
		X1VariableAsParameter obj1 = new X1VariableAsParameter();
		obj1.buySoap();
		
		obj1.buyHamamSoap();
		obj1.buyLuxSoap();

		obj1.buySoap("Dove");
		
		obj1.buySoap(0);
		obj1.buySoap(10);
		
		obj1.buySoap("Hamam", 10);
		obj1.buySoap(10, "Lux");
		
		obj1.buySoap(null);//String's default value
		obj1.buySoap("null"); //String value is text "null"
		obj1.buySoap(""); //Sttring value is empty
		obj1.buySoap("   "); //String value is Blank
		obj1.buySoap("This is also an example for String");
		obj1.buySoap("111");
		obj1.buySoap("Hamam");
		obj1.buySoap("Lux");
		obj1.buySoap("XX");
		
		obj1.buySoapAndShampoo();
		obj1.buySoapAndShampoo("Lux", "Chik");
		
		obj1.buySoapAndShampoo(10, 20);
		
		obj1.buySoapAndShampoo(10, "Lux", 10, "Chik");
		obj1.buySoapAndShampoo(10, "Chik", 10, "Lux");
//		obj1.buySoapAndShampoo("Chik", 10, "Lux", 10);
		
//		Using class level static and non-static variable as parameters;
		
		obj1.buySoap(obj1.a);
		obj1.buySoap(str);
		
		
//		Example: 
			WebDriver driver = new ChromeDriver();
	}

//	public void buyXXSoap() {
//		System.out.println("Buy XX soap");
//	}
	
	public void buySoap() {
		System.out.println("Bought soap");
	}
	
//	public void buySoap() {
//		System.out.println("Bought soap");
//	}

	public void buyHamamSoap() {
		System.out.println("Buy Hamam soap");
	}

	public void buyLuxSoap() {
		System.out.println("Buy Lux soap");
	}

	public void buySoap(String soapName) {
		
//		String soapName = "Hamam";

		System.out.println("Bought soapName");
		System.out.println("soapName");
		System.out.println(soapName);
		System.out.println("Bought soapName soap");
		System.out.println("Bought" + soapName);
//		System.out.println("Bought" "soapName" "soap");
		System.out.println("Bought" + "soapName" + "soap");
//		System.out.println("Bought" soapName "soap");
		System.out.println("Bought" + soapName + "soap");
		System.out.println("Bought" + soapName + "soap");
		System.out.println("Bought " + soapName + " soap");
		
	}
	
//	public void buySoap(String soapName1) {
//		ksjdkas
//	}

	public void buySoap(int soapAmount) {
//		System.out.println("Buy " +soapAmount+ " soap");
//		System.out.println("Buy " +soapAmount+ " rupees" + " soap");
		System.out.println("Buy " + soapAmount + " rupees soap");
	}

	public void buySoap(String soapName, int soapAmount) {
		System.out.println("Buy " + soapName + " soap for " + soapAmount + " rupees");
		System.out.println("Buy " + soapAmount + " rupees " + soapName + " soap");
		System.out.println("Buy " + soapAmount + " rupees soap");
		System.out.println("Bought " + soapName + " soap");
	}

	public void buySoap(int soapAmount, String soapName) {
//		System.out.println("Buy 10 rupees Lux soap"); 
		// replace the variables text with respective variable name
		// variable text - 10 and Lux
		// respective variable name
		// * 10 - soapAmount
		// * Lux - soapName
		System.out.println("Buy " + soapAmount + " rupees " + soapName + " soap");
	}

	public void buySoapAndShampoo() {
		System.out.println("Buy soap and shampoo");
	}

	public void buySoapAndShampoo(String soapName, String shampooName) {
		System.out.println("Buy " + soapName + " soap and " + shampooName + " shampoo");
	}

	public void buySoapAndShampoo(int soapAmount, int shampooAmount) {
		System.out.println("Buy " + soapAmount + " rupees soap and " + shampooAmount + " rupees shampoo");
	}

	public void buySoapAndShampoo(int soapAmount, String soapName, int shampooAmount, String shampooName) {
		System.out.println("Buy " + soapAmount + " rupees " + soapName + " soap and " + shampooAmount + " rupees "
				+ shampooName + " shampoo");
	}
}

//Syntax
//accessModifier static/non-static returnType methodName() {}
//
//List<WebElement> findElements(By by);
//
//default non-static returnType methodName(parameterized);
//
//
//public void buySoap(int amount) {
//
//}

//public class Test {
class Test {

	public void takeMoneyFromATM(int amount) {

	}

	public void buyThings(SuperMarket obj) {

	}

	public static void main(String[] args) {

		Test test = new Test();
		test.takeMoneyFromATM(100);

//		WebDriver driver = new ChromeDriver();
//		driver.findElement(By.xpath("").id(""));

//		SuperMarket abc = new SuperMarket();
//		test.buyThings(abc.buyFruits(100));
//		test.buyThings(new SuperMarket().buyFruits(100));

//		SuperMarket object1 = SuperMarket.buyRice(10);
//		test.buyThings(object1);
		test.buyThings(SuperMarket.buyRice(10));
//		test.buyThings(SuperMarket.buyRice(10).buyRice(20));
//		test.buyThings(SuperMarket.buyFruits(200)); 
//		Above line is nothing but 
//		test.buyThings(void); 
	}

	public static class SuperMarket {

		public static SuperMarket buyRice(int quantity) {

			SuperMarket obj = null;

			return obj;
		}

		public static void buyFruits(int amount) {

		}

		public static void buyPerfume(String perfumeName) {

		}
	}
}
