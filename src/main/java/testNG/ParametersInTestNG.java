package testNG;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersInTestNG {
	
	WebDriver driver;
//	public static String browser;
	
	@Parameters({"browser1"})
	@Test
	public void launchBrowser(String browser) {
		
//		browser = browser.toLowerCase();
		switch(browser.toLowerCase()){
			case "chrome":
				System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver_131.exe");
				driver = new ChromeDriver();
				break;
			case "firefox":
				System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
				break;
		}
	
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Parameters({"aParameter", "bParameter"})
	@Test
	public void methoWithParameter(String a, String b) {
		System.out.println(a);
		System.out.println(b);
	}
	

}
