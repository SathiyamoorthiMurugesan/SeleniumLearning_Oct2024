package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1_AlertsHandling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver_131.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/delete_customer.php");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.name("cusid")).sendKeys("59849");

//		driver.findElement(By.name("submit")).click();
		driver.findElement(By.name("submit")).submit();
//		driver.getTitle();
		Thread.sleep(4000);
//		driver.findElement(By.name("res")).click(); //UnhandledAlertException

		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		System.out.println(driver.getTitle());

//		We wrote code to handle alert but in web page there is no alert pops
		driver.switchTo().alert().accept(); // NoAlertPresentException

//		Alert alert = driver.switchTo().alert();
//		alert.dismiss();
//		alert.accept();

	}

	public void acceptAnAlert() {
		driver.switchTo().alert().accept();
	}

	public void dismissAnAlert() {
		driver.switchTo().alert().dismiss();
	}

	public String getTextFromAnAlert() {
		return driver.switchTo().alert().getText();
	}

	public void sendTextToAnAlert(String text) {
		driver.switchTo().alert().sendKeys(text);
	}

	Alert alert = driver.switchTo().alert(); // default non-static Class level variable

	public void acceptAnAlert1() {
		alert.accept();
	}

	Alert alert1 = null;

	public void acceptAnAlert2() {
		alert1 = driver.switchTo().alert();
		alert1.accept();
	}
	
	public void dismissAnAlert2() {
		alert1 = driver.switchTo().alert();
		alert1.dismiss();
	}

	Alert alert2 = null;

	public Alert switchToAlert() {
		driver.switchTo().alert();
		return alert2;
	}

	public void acceptAnAlert3() {
		alert2.accept();
	}

}
