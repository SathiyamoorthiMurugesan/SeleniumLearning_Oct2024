package seleniumBasics;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//https://browserstack.com/guide/handling-dropdown-in-selenium-without-select-class

public class DropDownPractice {
	
	static WebDriver driver;
//	RemoteWebDriver;
	
	static String url = "https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html";

	public static void pauseExecution(long time) throws InterruptedException {
		TimeUnit.SECONDS.sleep(time);
	}
	
	public static void main(String[] args) throws Exception {
		DropDownPractice obj = new DropDownPractice();
		obj.launchApplication(url, 10);
		
		WebElement courseName = driver.findElement(By.id("course"));

		obj.validateADropdownIsMultiSelect(courseName);
		
		obj.printAllOptionFromADropDown(courseName);
		
		obj.selectOptionByIndex(courseName, 1);
		
		
	}

	public static void main1(String[] args) throws Exception {
//		DropDownPractice DDW = new DropDownPractice();
//		DDW.TC_ExampleForDropDownWithoutSelectClass("Highest to lowest");

		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\drivers\\chromedriver_128.exe");

		WebDriver driver = new ChromeDriver();
		System.out.println(driver.getWindowHandle());

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement courseName = driver.findElement(By.id("course"));
		Select select = new Select(courseName);
		
		System.out.println("Is Course dropdown allows multi select? --> "+select.isMultiple());
		
		System.out.println("All options in Course dropdown");
		List<WebElement> allOptions = select.getOptions();
		for(WebElement eachOption : allOptions) {
			System.out.println(eachOption.getText());
		}

		select.selectByIndex(1);
		Thread.sleep(2000);
		select.selectByValue("js");
		Thread.sleep(2000);
		select.selectByVisibleText("Python");
		Thread.sleep(2000);
		
//		We can use deselect only in multiSelect
		select.deselectByVisibleText("Python");
		Thread.sleep(2000);

	}
	
	public WebDriver launchApplication(String applicationURL, long implicitWaitTime) {

		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\drivers\\chromedriver_128.exe");

		driver = new ChromeDriver();
		System.out.println(driver.getWindowHandle());

		driver.manage().window().maximize();

		driver.get(applicationURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWaitTime));
		
		return driver;

	}
	
	public void launchApplication(String browserName, String applicationURL, long implicitWaitTime) {

		switch(browserName.toLowerCase()) {
		case "chrome":
		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\drivers\\chromedriver_128.exe");
		driver = new ChromeDriver();
		break;
		
		case "edge": 
			
			break;
			
		case "firefox":
			
			break;
			
		}
	}
		
		public void launchApplication(String browserName) {

			switch(browserName.toLowerCase()) {
			case "chrome":
			System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\drivers\\chromedriver_128.exe");
			driver = new ChromeDriver();
			break;
			
			case "edge": 
				
				break;
				
			case "firefox":
				
				break;
				
			}
			
		
//		System.out.println(driver.getWindowHandle());

		driver.manage().window().maximize();

		driver.get("");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

	}
	
	
	public void validateADropdownIsMultiSelect(WebElement ele) {
		Select select = new Select(ele);
		boolean check = select.isMultiple();
		if(check==true) {
			System.out.println("It is a multi select drop down");
		}
		else 
			System.out.println("It is not a multi select drop down");
	}

	public void TC_GetSelectedDropDownValues() {
		DropDownPractice DDW = new DropDownPractice();

		ArrayList<String> options = new ArrayList<String>();
		options.add("Eclipse");
		options.add("IntelliJ IDEA");

		openChromeBrowser("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");

		WebElement DD_IDEName = driver.findElement(By.id("ide"));
//		DDW.chooseMultipleValuesFromDropDown(DD_IDEName, "Eclipse", "IntelliJ IDEA");
//		DDW.chooseMultipleValuesFromDropDown(DD_IDEName, "Eclipse", "");

		DDW.chooseMultipleValuesFromDropDown(DD_IDEName, options);

		// return selected options names
		System.out.println(DDW.getAllSelectedValues(DD_IDEName));

	}

	public void TC_ExampleForDropDownWithoutSelectClass(String sortDropDownValue) {
		DropDownPractice DDW = new DropDownPractice();

		openChromeBrowser("https://www.bstackdemo.com/");

		List<WebElement> allSortOptions = driver.findElements(By.xpath("//div[@class = 'sort']//option"));

		for (WebElement each : allSortOptions) {
//			if(each.getText()==sortDropDownValue) {
			// Lowest to Highest == memory location or address of "Lowest to Highest"
			// (xys894389)
			if (each.getText().equalsIgnoreCase(sortDropDownValue)) {
				// Lowest to Highest.equalIgnoreCase("Lowest to Highest")
				each.click();
				break;
			}
		}
	}

	public static void openChromeBrowser(String url) {
		// Open Chrome Browser (exe file location, initializing chromeDriver, max, open
		// application, implicitWait)
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver_125.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public void chooseOptionByValue(WebElement ele, String value) {
		Select select = new Select(ele);
		select.selectByValue(value);
	}

//	Select select;
	public void selectOptionByIndex(WebElement ele, int optionIndex) {
//		select = new Select(ele);
		Select select = new Select(ele);
		select.selectByIndex(optionIndex);
	}

	public void selectOptionByVisibleText(WebElement ele, String value) {
		Select select = new Select(ele);
		select.selectByVisibleText(value);
	}

	public void printAllOptionFromADropDown(WebElement ele) {
		Select select = new Select(ele);
		List<WebElement> courseAllOptions = select.getOptions();
		for (WebElement each : courseAllOptions) {
			System.out.println(each.getText());
		}

	}

	public void validateAnOptionPresentInDropDown(WebElement ele, String optionName) {
		Select select = new Select(ele);
		List<WebElement> courseAllOptions = select.getOptions();
		for (WebElement each : courseAllOptions) {
			if (each.getText().equalsIgnoreCase(optionName)) {
				System.out.println("Given option: " + optionName + " is present in the drop down");
			} else
				System.out.println("Given option: " + optionName + " is NOT present in the drop down");
		}
	}

	public void chooseOptionFromDropDownWithoutUsingSelectClass(String xpath, String optionName) {
//		List<WebElement>  allOptions = driver.findElements(By.xpath("//select[@id='course']//option"));
//		for(WebElement eachOption: allOptions) {
//			if(eachOption.getText().equalsIgnoreCase("Python")) {
//				eachOption.click();
//			}
//		}

		List<WebElement> allOptions = driver.findElements(By.xpath(xpath));
		for (WebElement eachOption : allOptions) {
			if (eachOption.getText().equalsIgnoreCase(optionName)) {
				eachOption.click();
			}
		}

	}

//	List<WebElement>  allOptions = driver.findElements(By.xpath(xpath));
	public void chooseOptionFromDropDownWithoutUsingSelectClass(List<WebElement> elements, String optionName) {

		for (WebElement eachOption : elements) {
			if (eachOption.getText().equalsIgnoreCase(optionName)) {
				eachOption.click();
			}
		}

	}

	public void getFirstSelectedOption(WebElement ele) {
		Select select = new Select(ele);
		select.getFirstSelectedOption();
	}

	public void deSelectOptionByValue(WebElement ele, String value) {
		Select select = new Select(ele);
		select.deselectByValue(value);
	}

	public void deSelectOptionByIndex(WebElement ele, int index) {
		Select select = new Select(ele);
		select.deselectByIndex(index);
	}

	public List<String> getAllSelectedValues(WebElement dropDown) {
		Select select = new Select(dropDown);
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();

		String value = null;
		List<String> selectedOptionsList = new ArrayList<String>();

		int totalSelectedOptions = allSelectedOptions.size();
		if (totalSelectedOptions > 0) {
			System.out.println("The total options selected is " + totalSelectedOptions);
			for (WebElement eachOption : allSelectedOptions) {
				value = eachOption.getText();
				selectedOptionsList.add(value);
			}
		} else
			System.out.println("No options were selected");

//		return allSelectedOptions;
		return selectedOptionsList;
	}

	public void chooseMultipleValuesFromDropDown(WebElement dropDownElement, String option1Name, String option2Name) {
		// Locate drop down - IDE Name
		Select select = new Select(dropDownElement);

		// Choose Multiple drop down in IDE Name drop down
		if (select.isMultiple()) {
			select.selectByVisibleText(option1Name);
			select.selectByVisibleText(option2Name);
		}
	}

	public void chooseMultipleValuesFromDropDown(WebElement dropDownElement, ArrayList<String> optionsToBeSelected) {
		// Locate drop down - IDE Name
		Select select = new Select(dropDownElement);

		// Choose Multiple drop down in IDE Name drop down
		if (select.isMultiple()) {
			for (String each : optionsToBeSelected) {
				select.selectByVisibleText(each);
			}
		}
	}

}
