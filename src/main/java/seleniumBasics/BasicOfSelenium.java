package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BasicOfSelenium {

	public static void main(String[] args) {

		System.out.println(System.getProperty("user.dir"));

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\git\\JavaSel_Oct2024\\drivers\\chromedriver_131.exe");
		WebDriver driver = new ChromeDriver();

//		System.setProperty("webdriver.edge.driver", "C:\\Users\\LENOVO\\git\\JavaSel_Oct2024\\drivers\\msedgedriver_131.exe");
//		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\drivers\\msedgedriver_131.exe");
//		System.setProperty("webdriver.edge.driver", ".\\drivers\\msedgedriver_131.exe");
//		EdgeDriver driver1 = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		System.out.println(driver.getTitle());
		
//		System.out.println(driver.getPageSource());
		
		driver.close();

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
