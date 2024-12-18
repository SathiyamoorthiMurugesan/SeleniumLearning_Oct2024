package seleniumBasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class A1_ActionsClass {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver_131.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions action = new Actions(driver);
		
//		List<WebElement> allOptions = driver.findElements(By.xpath("//select[@id='ide']//option"));
//		
//		for(WebElement each: allOptions) {
//			each.click();
//		}
//		
//		Select select = new Select(driver.findElement(By.xpath("//select[@id='ide']")));
//		
//		System.out.println(select.getFirstSelectedOption().getText());
//		
//		for(WebElement each: select.getAllSelectedOptions()) {
//			System.out.println(each.getText());
//		}
		
		driver.findElement(By.id("course")).click();
		driver.findElement(By.id("course")).click();
		
		action.pause(Duration.ofSeconds(2));
//		action.pause(2000);
		action.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).build().perform();
	}

	public static void main1(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver_131.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions action = new Actions(driver);
		
//		action.click().build().perform();
		
//		action.click(driver.findElement(By.linkText("Contact")))
//		.build().perform();
		
//		moving the virtual mouse to the desired element
		
//		action.moveToElement(driver.findElement(By.linkText("Selenium Practice"))).build().perform();
//		WebElement link_WaitPractice = driver.findElement(By.linkText("Waits Practice"));
		
//		action.moveToElement(link_WaitPractice).build().perform();
//		action.click().build().perform();
		
//		action.moveToElement(link_WaitPractice).click().build().perform();
		
//		action.click(link_WaitPractice).build().perform();
		
//		link_WaitPractice.click();
		
		
//		Context click - right click;
//		action.contextClick(driver.findElement(By.linkText("Selenium Practice"))).build().perform();
		
//		action.contextClick(driver.findElement(By.linkText("Selenium Practice")))
//		.pause(5000)
//		.keyDown(Keys.ARROW_DOWN)
//		.keyUp(Keys.ARROW_DOWN)
//		.keyDown(Keys.ENTER)
//		.keyUp(Keys.ENTER)
//		.build().perform();
		
//		action.contextClick(driver.findElement(By.linkText("Contact")))
//		.pause(3000)
//		.keyDown(Keys.ARROW_DOWN)
//		.keyUp(Keys.ARROW_DOWN)
//		.keyDown(Keys.ENTER)
//		.keyUp(Keys.ENTER)
//		.build().perform();
		
		
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
