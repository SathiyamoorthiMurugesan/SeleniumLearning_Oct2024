package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassPractice extends GenericMethods {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		ActionClassPractice ACP = new ActionClassPractice();
		GenericMethods GM = new GenericMethods();

		driver = launchApplicationInChrome("https://www.geeksforgeeks.org/", 10);

		WebElement link_Tutorials = driver.findElement(By.xpath("//div[text() = 'Tutorials']"));

		Actions actions = new Actions(driver);
//		actions.click(link_Tutorials);
//		actions.build();
//		actions.perform();

//		actions.click(link_Tutorials).build().perform();

//		actions.moveToElement(link_Tutorials).build().perform();

		actions.moveToElement(link_Tutorials).perform();

		actions.pause(2000);

		actions.click(link_Tutorials).build().perform();

//		WebElement source = GM.findAnElementUsingXpath("//a[text() = 'DSA: Basic To Advanced Course']");
//		WebElement target = GM.findAnElementUsingXpath("//input[contains(@class,'HomePageSearchContainer')]");
//		
//		actions.dragAndDrop(source, target).perform();

//		actions.doubleClick().perform();

//		actions.doubleClick(GM.findAnElementUsingXpath("//*[text() = 'Hello, What Do You Want To Learn?']"))
//		.perform();
		
//		actions.doubleClick(GM.findAnElementUsingXpath("//*[text() = 'Hello, What Do You Want To Learn?']"))
//		.click().perform();
		
//		actions.contextClick().perform();
		
//		driver.findElement(By.linkText("Practice Problem")).click();
		
		WebElement link_practiceProblems = driver.findElement(By.linkText("Practice Problem"));
		
//		actions.contextClick(link_practiceProblems).pause(3000).keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
//		
		actions.contextClick(link_practiceProblems).pause(3000).keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
		
	}

	public void scrollToAnElementUsingActions(WebElement element) {
		Actions actions = new Actions(driver);
		actions.scrollToElement(element).build().perform();
	}

	public void rightClickAnElement(WebElement ele) {
		Actions actions = new Actions(driver);
		actions.contextClick(ele).build().perform();
	}
	
	public void moveMouseOnAnElement(WebElement ele) {
		Actions actions = new Actions(driver);
		actions.moveToElement(ele).perform();;
	}

	public void rightClickOnMouse() {
		Actions actions = new Actions(driver);
		actions.contextClick().build().perform();
	}

	public void launchBrowser(String browserName) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\git\\SaraswathyJavaProject\\drivers\\chromedriver_109.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void launchApplication(String appName, long implicitWaitSeconds) {
		switch (appName) {
		case "Crocs":
			driver.get("https://www.crocs.in/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWaitSeconds));
		}
	}

	public void clickAnElementUsingActions(WebElement ele) {
		Actions actions = new Actions(driver);
		actions.moveToElement(ele).build().perform();
	}

	public void pressAKeyUsingActionsClass(String keyName) {
		Actions actions = new Actions(driver);
		switch (keyName) {
		case "a":
//			actions.keyDown(Keys.A).keyUp(Keys.a);
		}
	}

	public void typeInCaptialUsingActions(String text) {
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.SHIFT).sendKeys(text).keyUp(Keys.SHIFT).build().perform();
	}

}
