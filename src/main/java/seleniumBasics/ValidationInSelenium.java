package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ValidationInSelenium {

	public static WebDriver driver;

	@Test
	public static void main1() {
		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\drivers\\chromedriver_128.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
//		maximizeAWindow();
		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("ajja")) {
			System.out.println("Pass");
			
		}
		else
			System.out.println("Fail");
		
		
		Assert.assertEquals(title, "Selenium Practice - Web Tables");
		
		System.out.println("Hello");

		Assert.assertTrue(true);
		
//		Assert.assertEquals(ele.getText(), "Nov 30 2024");
		
		WebElement ele = null;
//		boolean checkEle = ele.isDisplayed();
		Assert.assertTrue(ele.isDisplayed());
		
		
	}

}
