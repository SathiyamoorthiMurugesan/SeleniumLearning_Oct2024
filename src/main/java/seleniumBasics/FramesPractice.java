package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesPractice {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		FramesPractice obj = new FramesPractice();
		
		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\drivers\\chromedriver_128.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.id("iFrame")).click();
		
		Thread.sleep(3000);
//		driver.findElement(By.id("current_filter")).click();
		System.out.println(obj.noOfiFramesInWebPage());
		
		
//		By using frame index
//		driver.switchTo().frame(100);
//		driver.switchTo().frame(0);
//		System.out.println(driver.getPageSource());
//		driver.findElement(By.id("current_filter")).click();
		
//		By using frame id or name
//		driver.switchTo().frame("globalSqa");
//		driver.findElement(By.id("current_filter")).click();
		
//		By using frame webElement
		WebElement ele = driver.findElement(By.xpath("//iframe[@class=' lazyloaded']"));
		driver.switchTo().frame(ele);
		driver.findElement(By.id("current_filter")).click();
		
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("Open New Window")).click();
		
		obj.openNewWindowAndSwitch();
		System.out.println(driver.getTitle());

	}


	public int noOfiFramesInWebPage() {
		int noOfiFramesdriver = driver.findElements(By.tagName("iframe")).size();
		return noOfiFramesdriver;
	}

	public int noOfFramesInWebPage() {
		int noOfiFramesdriver = driver.findElements(By.tagName("frame")).size();
		return noOfiFramesdriver;
	}
	
	public int noOfFramesiFramesInWebPage() {
		
//		return driver.findElements(By.tagName("iframe")).size() + driver.findElements(By.tagName("frame")).size();
		return noOfiFramesInWebPage()+ noOfFramesInWebPage();
	}
	
	public void switchToFrameByIndex(int frameIndex) {
		driver.switchTo().frame(frameIndex);
	}

	public void switchToFrameByName(String frameName) {
		driver.switchTo().frame(frameName);
	}

//	first find the "frameElement" first
//	WebElement frameElement = driver.findElement(By.id(""));
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

	public void clickAnElement(WebElement ele) {
		ele.click();
	}

}
