package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericMethods {
	
	static WebDriver driver;
	
	private WebDriver driver1;
	
	public WebDriver getDriver1() {
		return driver1;
	}

	public void setDriver1(WebDriver driver1) {
		this.driver1 = driver1;
	}

	public void launchApplication1(String applicationURL, long implicitWaitTime) {

		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\drivers\\chromedriver_128.exe");

		driver1 = new ChromeDriver();

		getDriver1().manage().window().maximize();

		getDriver1().get(applicationURL);
		getDriver1().manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWaitTime));

	}
	
	public static WebDriver launchApplicationInChrome(String applicationURL, long implicitWaitTime) {

		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\drivers\\chromedriver_128.exe");

		driver = new ChromeDriver();
		System.out.println(driver.getWindowHandle());

		driver.manage().window().maximize();

		driver.get(applicationURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWaitTime));
		
		return driver;

	}
	
//	WebDriver methods
	
	public WebElement findAnElementUsingXpath(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}
	
	
//	SwitchTo methods 
	
	public int noOfiFramesInWebPage() {
		int noOfiFramesdriver = driver.findElements(By.tagName("iframe")).size();
		return noOfiFramesdriver;
	}

	public int noOfFramesInWebPage() {
		int noOfiFramesdriver = driver.findElements(By.tagName("frame")).size();
		return noOfiFramesdriver;
	}
	
	public int noOfFramesiFramesInWebPage() {
		
		return noOfiFramesInWebPage()+ noOfFramesInWebPage();
	}
	
	public void switchToFrameByIndex(int frameIndex) {
		driver.switchTo().frame(frameIndex);
	}

	public void switchToFrameByName(String frameName) {
		driver.switchTo().frame(frameName);
	}

	public void switchToFrameByWebElement(WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}

	public void switchToFrameByWebElement(String xpath) {
		WebElement ele = driver.findElement(By.xpath(xpath));
		driver.switchTo().frame(ele);
	}

	public void switchToAFrameByIndexAndClickAnElement(int frameIndex, WebElement ele) {
		switchToFrameByIndex(frameIndex);
		ele.click();
	}

	public void switchToAFrameByIndexAndSendTextToAnElement(int frameIndex, WebElement ele, String text) {
		switchToFrameByIndex(frameIndex);
		ele.sendKeys(text);
	}

	public void switchToParentFrame() {
		driver.switchTo().parentFrame();
	}

	public void switchToMainWebPage() {
		driver.switchTo().defaultContent();
	}

	public void switchToActiveElement() {
		driver.switchTo().activeElement();
	}

	public void openNewWindowAndSwitch() {
		driver.switchTo().newWindow(WindowType.WINDOW);
	}

	public void switchToWindow(String windowHandle) {
		driver.switchTo().window(windowHandle);
	}


}
