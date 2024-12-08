package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasic {

	public static void main(String[] args) {

//		open amazon website

//		Go to chrome.exe file path
//		run chrome.exe file
//		chrome browser will open
//		enter Amazon website address 

//		Same goes for ChromeDriver 

//		Go to chormeDriver location
//		click and open ChromeDriver.exe
//		ChromeDriver will act as a driver/user and it will open Chrome.exe file
//		Chrome browser will be launched

//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\LENOVO\\git\\JavaProject_SelviAndYugendhar\\src\\main\\resources\\drivers\\chromedriver_128.exe");
		
//		System.out.println(System.getProperty("user.dir"));
		
		System.setProperty("webdriver.chrome.driver",
				".\\src\\main\\resources\\drivers\\chromedriver_128.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(driver.getTitle());
		
		WebElement link_AmazonMiniTV = driver.findElement(By.linkText("Amazon miniTV"));
		link_AmazonMiniTV.click();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//a[contains(@href,'imported')]//span[text() = 'Imported']")).click();
		System.out.println(driver.getTitle());
		
//		driver.close();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		System.out.println(driver.getTitle());
		
//		System.out.println(driver.getPageSource());
		
//		driver.quit();
		
//		{
////			difference between get() and navigate().to();
//		driver.get("https://www.amazon.in/");
//		
//		WebElement link_AmazonMiniTV = driver.findElement(By.linkText("Amazon miniTV"));
//		link_AmazonMiniTV.click();
//		
//		driver.navigate().to("https://www.amazon.in/gp/bestsellers");
//		
//		driver.get("https://www.amazon.in/amazonprime");
//		}
		
		
		
		
//		{
//		Synchronization between driver and web page loading
		
//			driver.get("https://www.amazon.in/");
//			WebElement link_AmazonMiniTV = driver.findElement(By.linkText("Amazon miniTV"));
//			link_AmazonMiniTV.click();
			
//			NoSuchElementException();
			
//			To avoid this we use wait - implicitWait();
			
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
//		}
		
//		{
//			driver.close();
//			driver.quit();
//		}
		
//		{
//			driver.getCurrentUrl();
//			driver.getTitle();
//		}
		
		{
//			WebDriver driver1 = new ChromeDriver(); //A webdriver session is created. Each session has a unique ID. 
			
//			Each browser window opened through a session has a unique ID..a - Window handle
		}
		

	}

}
