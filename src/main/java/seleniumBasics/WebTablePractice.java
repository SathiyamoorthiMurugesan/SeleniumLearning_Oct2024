package seleniumBasics;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePractice {

	static WebDriver driver;
	static WebElement table;
	static int tableRows;
	public static Map<String, String> map = null;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\drivers\\chromedriver_128.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
//		maximizeAWindow();
		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		table = driver.findElement(By.tagName("table"));
		tableRows = table.findElements(By.tagName("tr")).size();

		WebTablePractice obj = new WebTablePractice();
//		obj.getAllHeadersFromTable(table);

//		obj.getAllValuesFromARow(0);
//		obj.getAllValuesFromARow(1);

//		obj.getAllRowIncludingHeaderRow(2);

//		obj.getRowValuesInMap(1);

//		System.out.println(map.get("Salary"));

//		obj.getAllColumnValues("Email124");
		int rowNumber = obj.getRowValueOfAGivenColumnValue("First Name", "Alden");
		System.out.println(rowNumber);
		
		obj.getAllValuesFromARow(rowNumber);
		obj.getAllRowIncludingHeaderRow(rowNumber);
		obj.getRowValuesInMap(rowNumber);

	}

	public int getRowValueOfAGivenColumnValue(String columnName, String ColumnValue) {
		int count = 0;
		switch (columnName) {
		case "First Name":

			for (int i = 2; i <= tableRows; i++) {
				// table[@class = 'table table-striped mt-3']//tr)[1]//td[1]
				String firstName = driver
						.findElement(By.xpath("(//table[@class = 'table table-striped mt-3']//tr)[" + i + "]//td[1]"))
						.getText();
				if (firstName.equalsIgnoreCase(ColumnValue)) {
					count = i-1;
					break;
				}
			}
		}
		return count;

	}

	public void getAllColumnValues(String columnName) {

		switch (columnName) {
		case "First Name":

			for (int i = 2; i <= tableRows; i++) {
				// table[@class = 'table table-striped mt-3']//tr)[1]//td[1]
				String firstName = driver
						.findElement(By.xpath("(//table[@class = 'table table-striped mt-3']//tr)[" + i + "]//td[1]"))
						.getText();
				System.out.println(firstName);
			}

		case "Email124":

			for (int i = 2; i <= tableRows; i++) {
				System.out.println(driver
						.findElement(By.xpath("(//table[@class = 'table table-striped mt-3']//tr)[" + i + "]//td[4]"))
						.getText());
			}
		}
	}

	public void getAllHeadersFromTable(WebElement tableElementName) {
		List<WebElement> allRows = tableElementName.findElements(By.tagName("tr"));
		for (WebElement eachRow : allRows) {
			List<WebElement> allHeaders = eachRow.findElements(By.tagName("th"));
			for (WebElement eachHeader : allHeaders) {
				System.out.println(eachHeader.getText());
			}
		}
	}

	// https://www.geeksforgeeks.org/how-to-handle-dynamic-web-tables-using-selenium-webdriver-in-java/
	public void getAllValuesFromARow(int row) {
		List<WebElement> rowText = driver.findElements(By.tagName("tr"));
		for (int i = 0; i < tableRows; i++) {
			if (i == row) {
				List<WebElement> allData = null;
				if (i == 0) {
					allData = rowText.get(i).findElements(By.tagName("th"));
				} else {
					allData = rowText.get(i).findElements(By.tagName("td"));
				}

				for (WebElement eachData : allData) {
					System.out.println(eachData.getText());
				}
				break;
			}
		}
	}

	public void getAllValuesFromARowUsingForEach(int row) {
		List<WebElement> rowText = driver.findElements(By.tagName("tr"));
		int temp = 0;
		for (WebElement eachRow : rowText) {
			if (temp == row) {
				List<WebElement> allData = eachRow.findElements(By.tagName("td"));
				for (WebElement eachData : allData) {
					System.out.println(eachData.getText());
				}
				break;
			}
			temp++;
		}
	}

	public void getAllRowIncludingHeaderRow(int row) {
		HashMap<String, String> map = new HashMap<String, String>();
		String key = null;
		String value = null;
		ArrayList<String> headerList = new ArrayList<String>();
		ArrayList<String> givenRowList = new ArrayList<String>();
		List<WebElement> rowText = driver.findElements(By.tagName("tr"));
		int temp = 0;
		for (WebElement eachRow : rowText) {
			if (temp == 0) {
				List<WebElement> allHeaders = eachRow.findElements(By.tagName("th"));
				for (WebElement eachHeader : allHeaders) {
					System.out.println("Headers in table are " + eachHeader.getText());
					headerList.add(eachHeader.getText());
				}
//				break;
			}
			if (temp == row) {
				List<WebElement> allHeaders = eachRow.findElements(By.tagName("td"));
				for (WebElement eachHeader : allHeaders) {
					System.out.println(eachHeader.getText());
					givenRowList.add(eachHeader.getText());
				}
			}
			temp++;
		}
		System.out.println(headerList);
		System.out.println(givenRowList);
//		map.put(key, value);

		for (int i = 0; i < headerList.size(); i++) {
			map.put(headerList.get(i), givenRowList.get(i));
		}

		System.out.println(map);
	}

	public void getRowValuesInMap(int row) {
		List<WebElement> rowText = driver.findElements(By.tagName("tr"));
		List<WebElement> allData = null;
		List<WebElement> allHeaders = null;

		map = new HashMap<String, String>();

		for (int i = 1; i < tableRows; i++) {

			allHeaders = rowText.get(0).findElements(By.tagName("th"));

			if (i == row) {
				allData = rowText.get(i).findElements(By.tagName("td"));
				break;
			}

		}
		for (int i = 0; i < allHeaders.size(); i++) {
//			System.out.println(allHeaders.get(i).getText());
//			System.out.println(allData.get(i).getText());
			map.put(allHeaders.get(i).getText(), allData.get(i).getText());
		}

		System.out.println(map);

//		for (WebElement eachData : allHeaders) {
//			System.out.println(eachData.getText());
//		}
//
//		for (WebElement eachData : allData) {
//			System.out.println(eachData.getText());
//		}
	}

	public static void validateGivenTextPresentInGivenRow(int row, String text) {
		List<WebElement> rowText = driver.findElements(By.tagName("tr"));
		for (int i = 1; i < tableRows; i++) {
			if (i == row) {
				List<WebElement> allData = rowText.get(i).findElements(By.tagName("td"));
				for (WebElement eachData : allData) {
					if (eachData.getText().equalsIgnoreCase(text)) {
						System.out.println(eachData.getText());
						int rowNum = i + 1;
						System.out.println(driver
								.findElement(By.xpath("//table[@name = 'Table']//tr[" + rowNum + "]/td[1]")).getText());
					}
				}
			}
		}
	}
}
