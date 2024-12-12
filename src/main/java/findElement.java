import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElement {
	
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
//		BasicOfSelenium obj = new BasicOfSelenium();
//		obj.launchABrowser();
//		obj.maximizeTheWindow();
//		obj.openAnApplication("https://www.hyrtutorials.com/p/window-handles-practice.html");
//		obj.implicitWait(8);
//		obj.getTitle();
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver_131.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
//		WebElement text_Header = driver.findElement(By.tagName("h1"));
//		WebElement text_Header = driver.findElement(By.className("post-title entry-title"));
		WebElement text_Header = driver.findElement(By.xpath("//h1[@itemprop='name']"));
		String headerText = text_Header.getText();
		System.out.println(headerText);
		
		WebElement link_ContactUs = driver.findElement(By.linkText("Contact"));
		link_ContactUs.click();
		
	}

}
