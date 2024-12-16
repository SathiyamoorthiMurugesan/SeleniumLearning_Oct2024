package seleniumBasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A1_dropDownPractice2 {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver_131.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		List<WebElement> allSorts = driver.findElements(By.xpath("//select[@id='s-result-sort-select']/option"));
		
		for(WebElement eachSort: allSorts) {
			if(eachSort.getText().contains("High to Low")) {
				eachSort.click();
				eachSort.click();
			}
		}
		
		
	}

	public static void main1(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver_131.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
//		String str = "C:\\Users\\LENOVO\\git\\JavaSel_Oct2024\\src\\main\\java\\seleniumBasics";

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropDown_Course = driver.findElement(By.id("course"));
		Select select = new Select(dropDown_Course);
		
		System.out.println(select.isMultiple());
		
		List<WebElement> allOptionsInCourse = select.getOptions();
		for(WebElement each: allOptionsInCourse) {
			System.out.println(each.getText());
		}
		
		select.selectByIndex(1); //Java
		Thread.sleep(2000);
		
		select.selectByVisibleText("Dot Net");
		Thread.sleep(2000);
		
		select.selectByValue("python");
		Thread.sleep(2000);
		
		select.selectByContainsVisibleText("script");
		
		
	}
	
	public boolean isTheDropDownMultipleSelect(WebElement ele) {
		Select select = new Select(ele);
		return select.isMultiple();
	}
	
	public void selectByVisibleText(WebElement ele, String text) {
		Select select = new Select(ele);
		select.selectByVisibleText(text);
	}
	
	Select select1 = null;
	
	public Select yourDropDown(WebElement ele) {
		select1 = new Select(ele);
		return select1;
		
	}
	public boolean isTheDropDownMultipleSelect1() {
		return select1.isMultiple();
	}
	
	public void selectByVisibleText1(String text) {
		select1.selectByVisibleText(text);
	}

}
