package seleniumBasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1_Frames {
	
	static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver_131.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		driver.findElement(By.id("Open New Tab")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("Open New Window")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("iFrame")).click();
//		Thread.sleep(2000);
		
//		goToMenuTab("Tab");
		
		Thread.sleep(3000);
//		driver.switchTo().frame(0);
//		driver.switchTo().frame("globalSqa");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='globalSqa']")));
		
		String title = driver.findElement(By.xpath("//h1[text() = 'Trainings']")).getText();
		System.out.println(title);
		
//		goToMenuTab("Tab");
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("//h1[text() = 'Frames And Windows']")).getText());
		
		int totalIFramesInMainWebPage = driver.findElements(By.tagName("iframe")).size();
		System.out.println(totalIFramesInMainWebPage); //12
	}
	
	public static void goToMenuTab(String tabName) {
		List<WebElement> tabNames = driver.findElements(By.xpath("//ul[@class = 'resp-tabs-list ']/li"));
		for(WebElement eachTabName : tabNames) {
			if(eachTabName.getText().contains(tabName)) {
				eachTabName.click();
			}
		}
	}
	
	public void switchToFrame(int frameIndex) {
		driver.switchTo().frame(frameIndex);
	}
	
	public void switchToFrame(String frameName) {
		driver.switchTo().frame(frameName);
	}
	
	public void switchToFrame(WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}
	
	public void switchToParentFrame() {
		driver.switchTo().parentFrame();
	}
	
	public void switchToDefaultContent() {
		driver.switchTo().defaultContent();
	}
	
	public int getTotalIFrames() {
		return driver.findElements(By.tagName("iframe")).size();
	}
	
	public int getTotalFrames() {
		return driver.findElements(By.tagName("frame")).size();
	}


}
