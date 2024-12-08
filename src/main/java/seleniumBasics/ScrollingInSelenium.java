package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingInSelenium {

//	https://www.geeksforgeeks.org/selenium-scrolling-a-web-page-using-java/#selenium-scrolling-a-web-page-using-java

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\drivers\\chromedriver_128.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.geeksforgeeks.org/javascriptexecutor-in-selenium/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		JavascriptExecutor js = (JavascriptExecutor) driver;

//		 js.executeScript("window.scrollBy(0,150)");
//		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,5000)");

		Thread.sleep(2000);

		js.executeScript("window.scrollTo(0, 0)");
//		 
//		 js.executeScript("alert('Welcome to Guru99');");

		WebElement element = driver.findElement(By.xpath("//div[text() = 'Practice Tags : ']"));
		 js.executeScript("arguments[0].scrollIntoView();", element); 

		 WebElement ele = driver.findElement(By.className("facebook"));
		 js.executeScript("arguments[0].click();", ele);

//		 js.executeScript("arguments[0].value='---your email id---';", element);
		 
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
	
}
