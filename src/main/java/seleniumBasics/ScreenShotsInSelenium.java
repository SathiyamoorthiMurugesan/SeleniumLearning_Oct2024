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

public class ScreenShotsInSelenium {

	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\drivers\\chromedriver_128.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.geeksforgeeks.org/javascriptexecutor-in-selenium/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		TakesScreenshot screenShot = ((TakesScreenshot) driver);
		File screenshotImage = screenShot.getScreenshotAs(OutputType.FILE);

		LocalDateTime localDateAndTime = LocalDateTime.now();
		System.out.println(localDateAndTime);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
		String dateTime = formatter.format(localDateAndTime);
		System.out.println(dateTime);

		File file = new File(".\\src\\test\\resources\\screenshots\\" + dateTime + ".jpeg");
		FileHandler.copy(screenshotImage, file);

	}

}
