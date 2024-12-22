package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class A1_ValidationInSelenium {

	static WebDriver driver;
	
	@Test
//	public static void main(String[] args) {
	public static void validateHeader() {

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver_131.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		String textFromWebSite = driver.findElement(By.xpath("//h1[contains(text(), 'Automation Practice Form')]"))
				.getText();

		String textFromRequirement = "Selenium - Automation Practice Form";

//		if (textFromWebSite.equalsIgnoreCase(textFromRequirement)) {
//			System.out.println("Both text are same");
//		}
//		else
//			System.out.println("both text are not same");
		
		if(!textFromWebSite.equalsIgnoreCase(textFromRequirement)) {
			Assert.fail(textFromWebSite + " and "+textFromRequirement+" are not same.");
		}
		
//		Assert.assertEquals(textFromWebSite, textFromRequirement);

		System.out.println("Next line of codes after the header validation");

	}
	
	@Test
	public void example1() {
		System.out.println("hello");
	}

}
