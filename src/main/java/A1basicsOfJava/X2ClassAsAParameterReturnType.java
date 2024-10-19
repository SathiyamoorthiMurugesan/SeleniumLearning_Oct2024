package A1basicsOfJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X2ClassAsAParameterReturnType {

	public static void main(String[] args) {

		X2ClassAsAParameterReturnType obj = new X2ClassAsAParameterReturnType();
		obj.methodA(null);

		ABC obj2 = new ABC();
		obj.methodA(obj2.method1());

		obj.methodA(ABC.method2());

		ABC hello = obj2.method1();
//		hello.a;
		System.out.println(hello.a);

		System.out.println(obj2.method1().a);
		
		String str = "Sathya";
		String aaa = str.toLowerCase();
		System.out.println(aaa);
		System.out.println(aaa.toUpperCase());
		
		System.out.println(str.toLowerCase().toUpperCase());
//		System.out.println(str.toLowerCase());
//		System.out.println("sathya".toUpperCase());
//		System.out.println("SATHYA");
		
//		Example for Class as a return type: 
//		String class in Java
		
//		Example for class as parameter
//		findElement(By by); method in Selenium
		WebDriver driver = new ChromeDriver();
		By abc = By.id("");
		driver.findElement(By.id(""));
		driver.findElement(abc);
		
		driver.findElement(abc.id("").name(""));
		driver.findElement(By.id("").id("").name(""));
	}

	public void methodA(ABC aaa) {
		System.out.println(aaa);
	}

}

class ABC {

	int a = 10;
	static String str = "Sathya";

	public ABC method1() {
//		a;
//		System.out.println(a);
		System.out.println("I am a non-static method from ABC");
		return null;
	}

	public static ABC method2() {
		System.out.println("I am a static method from ABC");
		return null;
	}
}
