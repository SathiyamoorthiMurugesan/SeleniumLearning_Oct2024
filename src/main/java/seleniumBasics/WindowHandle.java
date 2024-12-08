package seleniumBasics;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				".\\src\\main\\resources\\drivers\\chromedriver_128.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println(driver.getWindowHandle());
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println(parentWindowHandle);
		
		driver.findElement(By.id("newWindowBtn")).click();
		System.out.println(driver.getWindowHandle());
		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println(allWindowHandles);
		
//		{
//		for(String eachHandle: allWindowHandles) {
//			driver.switchTo().window(eachHandle);
//			if(eachHandle.equalsIgnoreCase(parentWindowHandle)) {
//				driver.close();
//			}
////			System.out.println(driver.getTitle());
//		}
//		
//		System.out.println(driver.getTitle());
//		}
		
//		{
//		Close all the windows except the window which has given title
		for(String eachHandle: allWindowHandles) {
			driver.switchTo().window(eachHandle);
//			if(driver.getTitle().contains("Window Handles")) {
			if(!driver.getTitle().contains("Basic Controls")) {
				driver.close();
			}
		}
		
////		{
////		Close all the windows except the window which has given element
//		String myWindowHandle = "";
//		for(String eachHandle: allWindowHandles) {
//			driver.switchTo().window(eachHandle);
//			try {
//			WebElement ele = driver.findElement(By.xpath(""));
//			myWindowHandle = driver.getWindowHandle();
//			}
//			catch(Exception e) {
//				driver.close();
//			}
//		}
//		driver.switchTo().window(myWindowHandle);
////			}
		
//		switch to a window which has the my desired element;
		{
//		String myWindowHandle = "";
		for(String eachHandle: allWindowHandles) {
			driver.switchTo().window(eachHandle);
			try {
			WebElement ele = driver.findElement(By.xpath(""));
//			myWindowHandle = driver.getWindowHandle();
			break;
			}
			catch(Exception e) {
//				driver.close();
			}
		}
//		driver.switchTo().window(myWindowHandle);
		
		}
		
//		Exception in thread "main" org.openqa.selenium.InvalidSelectorException: Compound class names not permitted
	
//	How to close only the parent window and keep working on the child window
//		1) open a window - get its WindowHandle ID
//		2) Click a link or button - new window is opened. Window handle is created.
//		3) Driver focus is still on the first window.
	
	
		
//		Home work
//			1) get all window titles and handles
//			2) close all windows 
//			3) close the window/windows which has the given title/element
//			4) close the windows which does not have the given title/element
//			5) close only the parent window
//			6) close rest of the window but parent window
		
//		Thread.sleep(1000);
			
	}

}
