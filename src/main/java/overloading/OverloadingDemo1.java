package overloading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//* It happens within a Class
//* Its based on method signature (methodName with or without parameter)
//	* Method name should be same
//	* Parameters SHOULD/MUST vary
//		* Type of parameter
//		* Order of parameter
//		* No. of parameter
//* Compile time polymorphism
//* return type is secondary in overloading. 
//		* Means, if two methods have same method signature and have different return types 
//			then we will see error as duplicate method.
//* We can overload static method

//Java Example: String class
//	* public boolean startsWith(String prefix, int toffset) { }
//	* public boolean startsWith(String prefix) { }
//	* public int indexOf(int ch) { }
//	* public int indexOf(int ch, int fromIndex) { }


//Selenium Example:
//	* WebDriver frame(int index);
//	* WebDriver frame(String nameOrId);
//	* WebDriver frame(WebElement frameElement);
//	* driver.findElement(By.id("string"))
//	* driver.findElement(By.name("string"))
//	* driver.findElements(By.id("string"))
//	* driver.findElements(By.name("string"))


public class OverloadingDemo1 {
	
//	WebDriver

	int a;
	String str;
	float f;
	double d;
	long l;

	public void buySoap() {
		System.out.println("Buy soap public method");
	}

//	private void buySoap() {
//		System.out.println("Buy soap private method");
//	}
//	
//	public String buySoap() {
//	System.out.println("Buy soap");
//	}
	
	public String buySoap12() {
	System.out.println("Buy soap");
	return null;
	}
	

	public String buySoap(String soapName) {
		System.out.println("Buy soap");
		return soapName;
	}

//	public void buySoap(String soapName) {
//		System.out.println("Buy " + soapName + " soap");
//	}

	public void buyRice(String riceName) {
		System.out.println("");
	}

	public String buySoap(int soapAmount) {
		System.out.println("Buy soap for " + soapAmount);
		return "";
	}

	public void buySoap(String soapName, int soapAmount) {
		System.out.println("Buy " + soapName + " for amount " + soapAmount);
	}

	public void buySoap(int soapAmount, String soapName) {
		System.out.println("For amount " + soapAmount + ", buy " + soapName + " soap");
	}
	
	public static void buySoap(char char1) {
		System.out.println("Buy soap public method");
	}

	public static void main(String[] args) {

		OverloadingDemo1 od = new OverloadingDemo1();

		System.out.println(od.a);
		System.out.println(od.str);
		System.out.println(od.f);
		System.out.println(od.d);
		System.out.println(od.l);
		od.buySoap();
		od.buySoap("Lux");
		od.buyRice("RICE");
		od.buySoap(50);
		od.buySoap(20, "Lux");
		od.buySoap("Lux", 100);
		
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.id(""));
		driver.findElement(By.xpath(""));
		
	}

}

class ClassA {
	public void buySoap() {
		System.out.println("Buy soap public method");
	}
	
	public void buyRice(int amount) {
		System.out.println("");
	}
}