package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*There are two types...
1.ImplicitlyWait
	* written only once when opening the application.
	* This one line wait for page to load
	* This one line is also applicable for all the pages you open in that session.
2. Explicit wait
3. Fluent wait

*/
public class WaitInSelenium {

	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				".\\src\\test\\resources\\drivers\\chromedriver_114.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
//		maximizeAWindow();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());

		wait.until(ExpectedConditions.elementToBeClickable(By.id("")));

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("")));

		wait.until(ExpectedConditions.textToBe(By.xpath(""), "String"));
		
		WebElement ele = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.id("")));

	}
	
	public void maximizeAWindow() {
		driver.manage().window().maximize();
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
