package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import fileReading.PropertyFileReading;

public class RobotClass {

	static WebDriver driver;
	static RobotClass obj = new RobotClass();

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\drivers\\chromedriver_128.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//		String filePath = "C:\\Users\\LENOVO\\OneDrive\\Desktop\\abc.txt";
//		String filePath = "C:/Users/LENOVO/OneDrive/Desktop/abc.txt";
//		String filePath = "C:\Users\LENOVO\OneDrive\Desktop\abc.txt";

//		PropertyFileReading obj = new PropertyFileReading();
//
//		String filePath = obj.readApropertyAndReturnItsValue("filePath");
//		System.out.println(filePath);
//
//		StringSelection stringSelection = new StringSelection(filePath);
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

//		driver.findElement(By.className("upload_txt")).click();

//		driver.findElement(By.id("uploadfile_0")).click();

//		driver.findElement(By.xpath("//div[@id='file_wraper0']//input[@type='file']")).click();

		Thread.sleep(2000);

		WebElement fileUploadButton = driver.findElement(By.xpath("//div[@id='file_wraper0']//input[@type='file']"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(fileUploadButton).click().perform();
//		actions.click(fileUploadButton).perform();
		
		fileUploadButton.sendKeys("C:\\Users\\LENOVO\\OneDrive\\Desktop\\abc.txt");

//		boolean fileUploadCheck = driver.findElement(By.xpath("//div[@id='file_wraper0']//input[@type='file']")).isDisplayed();
//		System.out.println(fileUploadCheck);

		Thread.sleep(2000);

		Robot robo = new Robot();

		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);

//		Thread.sleep(3000);

		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);

	}

	public void uploadAFileUsingSendKeys(By by, String pathOfFileToBeUploaded) {
		driver.findElement(by).sendKeys(pathOfFileToBeUploaded);
	}
	// uploadAFileUsingSendKeys(By.id("fileToUpload"),"D:\\sathiya\\Text123.txt"),

	public void uploadAFileUsingRobotClass(String pathOfFile) throws Exception {
		Robot robo = new Robot();
//		C:\Users\LENOVO\Desktop\Vinothini.txt

		StringSelection stringSelection = new StringSelection(pathOfFile);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(3000);

		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void enterAKeyUsingRobotClass(String keyName) throws AWTException {
		Robot robo = new Robot();
		switch (keyName) {
		case "a":
			robo.keyPress(KeyEvent.VK_A);
			robo.keyRelease(KeyEvent.VK_A);
			break;

		}

	}

	public static void enterAStringUsingRobotClass(String value) throws AWTException {
		Robot robo = new Robot();
		String[] letters = value.split("");
		for (String eachLetter : letters) {
			switch (eachLetter) {
			case "a":
				robo.keyPress(KeyEvent.VK_A);
				robo.keyRelease(KeyEvent.VK_A);
				break;

			case "b":
				robo.keyPress(KeyEvent.VK_B);
				robo.keyRelease(KeyEvent.VK_B);
				break;

			case "c":
				robo.keyPress(KeyEvent.VK_C);
				robo.keyRelease(KeyEvent.VK_C);
				break;

			case " ":
				robo.keyPress(KeyEvent.VK_SPACE);
				robo.keyRelease(KeyEvent.VK_SPACE);
				break;
			}
		}
	}

	public static void enterTwoKeyUsingRobotClass(String keysName) throws AWTException {
		Robot robo = new Robot();
		switch (keysName) {
		case "ControlA":
			robo.keyPress(KeyEvent.VK_CONTROL);
			robo.keyPress(KeyEvent.VK_A);
			robo.keyRelease(KeyEvent.VK_A);
			robo.keyRelease(KeyEvent.VK_CONTROL);
			break;

		case "CapsA":
			robo.keyPress(KeyEvent.VK_SHIFT);
			robo.keyPress(KeyEvent.VK_A);
			robo.keyRelease(KeyEvent.VK_A);
			robo.keyRelease(KeyEvent.VK_SHIFT);
			break;

		}
	}

}
