package inheritanceInJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultileveInheritanceWithInterface  extends ParentA {
	
	public void MII() {
		System.out.println("methodMII");
	}

	public static void main(String[] args) {
		MultileveInheritanceWithInterface obj = new MultileveInheritanceWithInterface();
		obj.methodAA();
		obj.methodPA();
		obj.methodAB();
		obj.MII();
		MultiA.methodAC();
		
		
		ParentA obj1 = new MultileveInheritanceWithInterface();
		obj1.methodAA();
		obj1.methodAB();
		obj1.methodPA();
		
		
		MultiA obj2 = new MultileveInheritanceWithInterface();
		System.out.println("***");
		obj2.methodAA();
		obj2.methodAB();
		
		WebDriver driver = new ChromeDriver();
		driver.get("");
		
//		ChromeDriver extends ChromiumDriver
//		ChromiumDriver extends RemoteWebDriver
//		RemoteWebDriver implements WebDriver
//		WebDriver extends SearchContext
		
	}

}

class ParentA implements MultiA {

	@Override
	public void methodAA() {
		System.out.println("methodAA");
		
	}
	
	public void methodPA() {
		System.out.println("methodPA");
	}
	
}

interface MultiA {
	
	public void methodAA();
	
	default void methodAB() {
		System.out.println("methodAB");
	}
	
	public static void methodAC() {
		System.out.println("methodAC");
		
	}
}