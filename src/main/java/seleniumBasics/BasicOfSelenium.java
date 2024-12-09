package seleniumBasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BasicOfSelenium {

	public static void main(String[] args) {

		System.out.println(System.getProperty("user.dir"));

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\git\\JavaSel_Oct2024\\drivers\\chromedriver_131.exe");
		WebDriver driver = new ChromeDriver();

//		System.setProperty("webdriver.edge.driver", "C:\\Users\\LENOVO\\git\\JavaSel_Oct2024\\drivers\\msedgedriver_131.exe");
//		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\drivers\\msedgedriver_131.exe");
//		System.setProperty("webdriver.edge.driver", ".\\drivers\\msedgedriver_131.exe");
//		EdgeDriver driver1 = new EdgeDriver();

		driver.manage().window().maximize();

//		driver.get("https://www.amazon.in/");
//		
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println(currentUrl);
//		
//		System.out.println(driver.getTitle());

//		System.out.println(driver.getPageSource());

//		driver.close();

//		String window1 = driver.getWindowHandle();
//		System.out.println(window1);

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

//		getting window's handle
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);

//		Opening a new window by clicking the element
		driver.findElement(By.id("newWindowBtn")).click();
//		driver.findElement(By.xpath("//button[contains(text(), 'Open Multiple Windows')]")).click();

//		Even though new window is opened, our driver is still focus on the parent window
//		To confirm that, we are printing the window handle again
		System.out.println("This is parent window handle: "+driver.getWindowHandle());

//		getting all window handles opened during this session
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String eachWindow : allWindowHandles) {
			System.out.println(eachWindow);
		}

		System.out.println(driver.getWindowHandle());

		for (String eachWindow : allWindowHandles) {
			if (!eachWindow.equalsIgnoreCase(parentWindow)) {
				driver.switchTo().window(eachWindow);
			}
//			System.out.println(eachWindow);
		}
		
		System.out.println("My current window Handle id is: "+driver.getWindowHandle());
		
//		driver.close();
		driver.quit();
//		

	}

	public void launchABrowser(String browserName) {

		WebDriver driver;

		switch (browserName) {
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver_131.exe");
			driver = new ChromeDriver();
			break;

		case "Edge":
			System.setProperty("webdriver.edge.driver", ".\\drivers\\msedgedriver_131.exe");
			driver = new EdgeDriver();
			break;

		default:
			System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver_131.exe");
			driver = new ChromeDriver();
		}

	}

}