package returnTypeAndParameters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParametersAndReturnTypeExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Options opt = driver.manage();
		Window win = opt.window();
		win.maximize();
		
		
//		Options opt = driver.manage();
//		Window win = driver.manage().window();
//		driver.manage().window().maximize();
		
		driver.manage().window().maximize();
	}
	
	public void method1() {
		String str = "Sathya";
		boolean yesOrNo = str.toUpperCase().toLowerCase().equalsIgnoreCase("Sathya");
		
		String upper = str.toUpperCase();
		String lower = upper.toLowerCase();
		lower.equalsIgnoreCase("SaThYa");
		
		
		str.toUpperCase().toLowerCase().equalsIgnoreCase("SaThYa");
		
	}

}
