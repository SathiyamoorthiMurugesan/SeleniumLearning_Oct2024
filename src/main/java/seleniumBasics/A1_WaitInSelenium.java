package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A1_WaitInSelenium {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver_131.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

		driver.findElement(By.id("btn1")).click();

		driver.findElement(By.id("txt1")).sendKeys("Hello");

		driver.findElement(By.id("btn2")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt2")));

		driver.findElement(By.id("txt2")).sendKeys("Hello");
	}
	
	public void waitForAlertToBePresent(long seconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.alertIsPresent());
	}

	public void waitForElementToBeClickableById(String idText, long seconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(idText)));
	}

	public void waitForElementToBeClickableByXpath(String xpathText, long seconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathText)));
	}

	public void waitForElementToBeClickableByClass(String classText, long seconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.elementToBeClickable(By.className(classText)));
	}

	public void waitForElementToBeClickableByLocator(String locatorName, String classText, long seconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));

		switch (locatorName) {
		case "id":
			wait.until(ExpectedConditions.elementToBeClickable(By.id(classText)));
			break;
		case "className":
			wait.until(ExpectedConditions.elementToBeClickable(By.className(classText)));
			break;

		case "name":
			wait.until(ExpectedConditions.elementToBeClickable(By.name(classText)));
			break;

		case "tagName":
			wait.until(ExpectedConditions.elementToBeClickable(By.tagName(classText)));
			break;

		case "css selector":
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(classText)));
			break;

		case "xpath":
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(classText)));
			break;

		}
	}
	
	//WebElemet userName = driver.findElement(By.id(""));
	public void waitForElementToBeClickable(WebElement ele, long seconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}


}
