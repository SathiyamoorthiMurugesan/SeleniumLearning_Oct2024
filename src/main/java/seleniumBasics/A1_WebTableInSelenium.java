package seleniumBasics;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1_WebTableInSelenium {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver_131.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		HashMap<String, String> myMap = getSpecificRowValueAndStoreItInMap(1);
		
		System.out.println(myMap.get("First Name"));
		
	}

	public static void main1(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver_131.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement myTable = driver.findElement(By.tagName("table"));

		List<WebElement> allRows = myTable.findElements(By.tagName("tr"));
		System.out.println(allRows.size());

//		get only one row from all the rows
		WebElement headerRow = allRows.get(0);
		List<WebElement> allHeaders = headerRow.findElements(By.tagName("th"));
		for (WebElement eachHeader : allHeaders) {
			System.out.println(eachHeader.getText());
		}

		WebElement firstRow = allRows.get(1);
		List<WebElement> firstRowData = firstRow.findElements(By.tagName("td"));
		for (WebElement eachData : firstRowData) {
			System.out.println(eachData.getText());
		}

		WebElement secondRow = allRows.get(2);
		List<WebElement> secondRowData = secondRow.findElements(By.tagName("td"));
		for (WebElement eachData : secondRowData) {
			System.out.println(eachData.getText());
		}

		System.out.println("Getting all row values(excluding header) using for loop");

		for (int i = 1; i < allRows.size(); i++) {
			List<WebElement> allRowData = allRows.get(i).findElements(By.tagName("td"));
			for (WebElement eachRowData : allRowData) {
				System.out.println(eachRowData.getText());
			}
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		}

		System.out.println("Getting all row values(including header) using for loop");

		for (int i = 0; i < allRows.size(); i++) {
			List<WebElement> allRowData = null;
			if (i == 0) {
				allRowData = allRows.get(0).findElements(By.tagName("th"));
			} else {
				allRowData = allRows.get(i).findElements(By.tagName("td"));
			}
			for (WebElement eachRowData : allRowData) {
				System.out.println(eachRowData.getText());
			}
			System.out.println("*************");
		}

	}

	public void getSpecificRowValue(int rowNumber) {
		WebElement myTable = driver.findElement(By.tagName("table"));
		List<WebElement> allRows = myTable.findElements(By.tagName("tr"));
		for (int i = 1; i < allRows.size(); i++) {
			List<WebElement> allRowData = null;
			if (i == rowNumber) {
				allRowData = allRows.get(i).findElements(By.tagName("td"));
				for (WebElement eachRowData : allRowData) {
					System.out.println(eachRowData.getText());
				}
				break;
			}
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		}
	}

	public void getSpecificRowValue1(int rowNumber) {
		WebElement myTable = driver.findElement(By.tagName("table"));
		List<WebElement> allRows = myTable.findElements(By.tagName("tr"));
		List<WebElement> allRowData = allRows.get(rowNumber).findElements(By.tagName("td"));
		for (WebElement eachRowData : allRowData) {
			System.out.println(eachRowData.getText());
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	}

//	I need output like below. How do I achieve it? 
//			
//			First name = Kierra
//			Last name = Gentry
//			Age = 29
//			Email = kierra@example.com
//			Salary = 2000
//			Department = Legal

//	How do we create a map and add values to it?
//		HashMap<String, String> map = new HashMap<String, String>();
//		map.put("First Name", "Cierra");
//		map.put("Last Name", "Vega");

	public static HashMap<String, String> getSpecificRowValueAndStoreItInMap(int rowNumber) {
		WebElement myTable = driver.findElement(By.tagName("table"));
		List<WebElement> allRows = myTable.findElements(By.tagName("tr"));
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		List<WebElement> allHeaderData = allRows.get(0).findElements(By.tagName("th"));
		List<WebElement> allRowData = allRows.get(rowNumber).findElements(By.tagName("td"));
		
//		map.put("First Name", "Cierra");
//		map.put(allHeaderData.get(0).getText(), allRowData.get(0).getText());
//		map.put(allHeaderData.get(1).getText(), allRowData.get(1).getText());
//		map.put(allHeaderData.get(2).getText(), allRowData.get(2).getText());
		
		for(int i = 0; i<allHeaderData.size(); i++) {
			map.put(allHeaderData.get(i).getText(), allRowData.get(i).getText());
		}
		
		System.out.println(map);
		
		return map;

	}

}
