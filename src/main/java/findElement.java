import java.time.Duration;
import java.util.List;

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
//		link_ContactUs.click();
//		link_ContactUs.sendKeys("ABC");

		System.out.println(link_ContactUs.isDisplayed());
		System.out.println(link_ContactUs.isSelected());
		System.out.println(link_ContactUs.isEnabled());

		driver.findElement(By.id("name")).sendKeys("MyTextffjksdjdflsdkfj349038");
		driver.findElement(By.id("name")).clear();

		WebElement text_WindowHandlePractice = driver
				.findElement(By.xpath("//h1[contains(text(), 'Window Handles Practice')]"));
		System.out.println(text_WindowHandlePractice.getAttribute("class"));
		System.out.println(text_WindowHandlePractice.getDomAttribute("class"));
		System.out.println(text_WindowHandlePractice.getDomProperty("class"));

		findElement obj = new findElement();
//		obj.findTheElement("linkText", "Contact").click();

//		List<WebElement> link_AllMenu = driver
//				.findElements(By.xpath("//div[@class='menu section']//ul[@id = 'nav1']/li/a"));
//
//		for (WebElement eachMenu : link_AllMenu) {
//			eachMenu.click();
//		}
		
		obj.clickMenuInHYRTutorials("Contact");

	}

	public void clickMenuInHYRTutorials(String menuName) {
		List<WebElement> link_AllMenu = driver
				.findElements(By.xpath("//div[@class='menu section']//ul[@id = 'nav1']/li/a"));

		for (WebElement eachMenu : link_AllMenu) {
			if (menuName.equalsIgnoreCase(eachMenu.getText()))
				eachMenu.click();
		}
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

}
