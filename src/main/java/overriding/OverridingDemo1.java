package overriding;

//	* Also called as runtime polymorphism and it happens between two classes
//	* In order to achieve this, we need to use inheritance concept and object creation 
//		where we create obj for child class with parent class as reference class
//	* It based on method signature.
//	* In order to achieve this, 
//	* Method name should be same
//	* Type, order and number of parameter should same between parent and child
//	* Return type of methods between child and parent methods must be same
//	* Overriding is not possible between two static methods. Overriding is based on object creation only.
//		* But to call static methods, we dont need to create Object. 
//		* Since there is no need to create object, overriding is not possible with static methods

//Java example: 
//	*  Whatever methods in List interface is overrided in its Child classes "ArrayList", "LinkedList"
//	* Whatever methods in Set interface is overrided in its Child classes "HashSet", "LinkedHashSet"
	
//Selenium example:
//	* List<WebElement> findElements(By by);
//	* WebElement findElement(By by);
//	* Above two methods are created in SearchContext interface but its is overrided in class interface "WebDriver"
//	* Again its overrided in child Class "Remote WebDriver"
//	* Whatever methods we have in WebDriver interface is overrided in "RemoteWebDriver" class
	

//Selenium Hierarchy

//class ChromeDriver extends ChromiumDriver;
//class ChromiumDriver extends RemoteWebDriver;
//class RemoteWebDriver implements WebDriver;
//interface WebDriver extends SearchContext;
	

public class OverridingDemo1 extends Parent {
	
//	RemoteWebDriver

	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.buyRice();
		parent.buySoap();
		parent.buyTV(5);
		
		OverridingDemo1 child1 = new OverridingDemo1();
		child1.buyChocolate();
		child1.buySoap();
		child1.buyRice();//parent class method
		
		
		System.out.println("Overriding ***************");
//		This is called overriding. Here we create Object for child with parent as Reference. 
//		We expect parent method to run but during run time, JVM will pick child class method
		Parent test1 = new OverridingDemo1();
		test1.buyRice();
		test1.buySoap();
		test1.buyTV(10);
		
	}
	
	public void buySoap() {
		System.out.println("Buy Lux soap");
	}
	
	public void buyChocolate() {
		System.out.println("Buy chocolate");
	}
	
	public void buyTV(String name) {
		System.out.println("Buy "+name+ " TV");
	}
	
//	public String testReturn() {
//		System.out.println("void return");
//		return null;
//	}

}

class Parent {
	
	public void buySoap() {
		System.out.println("Buy Hamam soap");
	}
	
	public void buyRice() {
		System.out.println("Buy rice for food");
	}
	
	public void buyTV(int amount) {
		System.out.println("Buy TV for amount "+amount);
	}
	
	public void testReturn() {
		System.out.println("void return");
	}
	
}

interface TestInterface {
	
}