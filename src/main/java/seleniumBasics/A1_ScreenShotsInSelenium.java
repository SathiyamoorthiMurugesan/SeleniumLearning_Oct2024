package seleniumBasics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class A1_ScreenShotsInSelenium {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver_131.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.geeksforgeeks.org/javascriptexecutor-in-selenium/");
//		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		TakesScreenshot screenShot = ((TakesScreenshot) driver);
		File screenshotImage = screenShot.getScreenshotAs(OutputType.FILE);
		
		LocalDateTime localDateAndTime = LocalDateTime.now();
		System.out.println(localDateAndTime);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
		String dateTime = formatter.format(localDateAndTime);
		System.out.println(dateTime);
		
//		File file = new File(".\\src\\test\\resources\\screenshots\\123.jpeg");
		File file = new File(".\\src\\test\\resources\\screenshots\\"+dateTime+".jpeg");
		FileHandler.copy(screenshotImage, file);

	}
}