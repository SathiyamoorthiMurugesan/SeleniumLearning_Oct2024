package seleniumBasics;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GenericMethods2 {
	
	WebDriver driver;

	public WebDriver launchABrowser(String browserName) {

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

		return driver;

	}

	public void switchToAWindowBasedOnTitle(String windowTitle) {
		Set<String> allWindowHandle = driver.getWindowHandles();

		for (String eachWindowHandle : allWindowHandle) {
			driver.switchTo().window(eachWindowHandle);
//			System.out.println(driver.getTitle());
			if (driver.getTitle().contains(windowTitle)) {
				break;
			}
		}
	}

	public void closeAllChildWindows(String parentWindowHandle) {
		Set<String> allWindowHandle = driver.getWindowHandles();

		for (String eachWindowHandle : allWindowHandle) {
			if (!eachWindowHandle.equals(parentWindowHandle)) {
				driver.switchTo().window(eachWindowHandle);
				driver.close();
			}
		}
		driver.switchTo().window(parentWindowHandle);
	}

	public void switchToParentWindow(String parentWindowHandle) {
		driver.switchTo().window(parentWindowHandle);
	}

	public void closeAllTheWindowsExceptGivenWindow(String windowTitle) {
		Set<String> allWindowHandle = driver.getWindowHandles();

		String bWindowHandle = null;

		for (String eachWindowHandle : allWindowHandle) {
			driver.switchTo().window(eachWindowHandle);
//			System.out.println(driver.getTitle());
			if (driver.getTitle().contains(windowTitle)) {
				bWindowHandle = driver.getWindowHandle();
				continue;
			} else
				driver.close();
		}
		driver.switchTo().window(bWindowHandle);
	}

	public void maximizeTheWindow() {
		driver.manage().window().maximize();
	}

	public void minimizeTheWindow() {
		driver.manage().window().minimize();
	}

	public void fullScreenTheWindow() {
		driver.manage().window().fullscreen();
	}

	public void openAnApplication(String ApplicationUrl) {
		driver.get(ApplicationUrl);
	}

	public void openAnApplication() throws Exception {
//		String url = readAProperty("url");
//		driver.get(url);

		driver.get(readAProperty("url"));
	}

	public void implicitWait(long secondsToWait) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(secondsToWait));
	}

//	public void implicitWait() throws FileNotFoundException, IOException {
	public void implicitWait() throws Exception {
		Properties prop = new Properties();

		File file = new File(".\\ProjectProperty.properties");
		FileInputStream fis = new FileInputStream(file);
//		FileInputStream fis = new FileInputStream(new File(".\\ProjectProperty.properties"));

		prop.load(fis);

		String secondsToWait = prop.getProperty("implicitWait");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(secondsToWait)));
	}

	public void launchABrowser() throws Exception {

//		Properties prop = new Properties();
//
//		File file = new File(".\\ProjectProperty.properties");
//		FileInputStream fis = new FileInputStream(file);
//		prop.load(fis);
//
//		String browserName = prop.getProperty("browser");

		String browserName = readAProperty("browser");

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

	public String readAProperty(String propertyName) throws Exception {
		Properties prop = new Properties();

		File file = new File(".\\ProjectProperty.properties");
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);

		return prop.getProperty(propertyName);
	}

	public String readAProperty(String propertyFileName, String propertyName) throws Exception {
		Properties prop = new Properties();

		File file = new File(propertyFileName);
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);

		return prop.getProperty(propertyName);
	}

	public String getTitle() {
		System.out.println(driver.getTitle());
		return driver.getTitle();
	}

	public String getCurrentUrl() {
		System.out.println(driver.getCurrentUrl());
		return driver.getCurrentUrl();
	}

	public String getCurrentWindowHandle() {
		return driver.getWindowHandle();
	}
	
	public WebElement findTheElement(String elementLocator, String value) {

		switch (elementLocator) {
		case "id":
			return driver.findElement(By.id(value));

		case "xpath":
			return driver.findElement(By.xpath(value));

		case "linkText":
			return driver.findElement(By.linkText(value));
		}
		return null;
	}

	public void sendTextToAnElement(WebElement ele, String text) {
		ele.sendKeys(text);
	}

	public void clickAnElement(WebElement ele) {
		ele.click();
	}

	public boolean elementIsSelected(WebElement ele) {
		return ele.isSelected();
	}
	
	public String getTextFromAnElement(WebElement ele) {
		return ele.getText();
	}


}
