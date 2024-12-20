package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A1_ScrollingInSelenium {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver_131.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.geeksforgeeks.org/javascriptexecutor-in-selenium/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		driver.findElement(By.linkText("GFG Corporate Solution")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,15000)");
		
//		js.executeScript("window.scrollBy(0, -10000)");
//		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		Thread.sleep(1000);
		Actions actions = new Actions(driver);
		
//		actions.keyDown(Keys.CONTROL)
//		.keyDown(Keys.HOME)
//		.keyUp(Keys.HOME)
//		.keyUp(Keys.CONTROL).build().perform();
		
//		actions.scrollByAmount(0, 0).build().perform();
		
		actions.scrollToElement(driver.findElement(By.xpath("//button[@aria-label='search']"))).build().perform();
	}
	
	public void scrollToBottomOfThePage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5000)");
	}

	public void scrollToTopOfThePage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,0)");
	}
	
	public void scrollToTheGivenElementUsingJS(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();", element); 
	}
	

	public void clickTheGivenElementUsingJS(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	public void sendTextToAnElement(WebElement ele) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("arguments[0].value='enter the value here';", ele);
	}
	
	public void scrollToElementUsingActions(WebElement ele) {
		Actions actions = new Actions(driver);
		actions.scrollToElement(ele).build().perform();
	}


}
