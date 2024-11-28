package fileReading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class PropertyFileReading {

	static String filePath = ".\\src\\main\\resources\\Files\\file2.properties";

	public static void main(String[] args) throws Exception {
		
//		WebDriver
//		WebElement
//		ChromeDriver;

		System.out.println(System.getProperty("user.dir"));
		String projectLocation = System.getProperty("user.dir");

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\LENOVO\\git\\JavaProject_SelviAndYugendhar\\src\\main\\resources\\Files\\file2.properties");

//		FileInputStream fis = new FileInputStream(
//		projectLocation+ "\\src\\main\\resources\\Files\\file2.properties");

//		FileInputStream fis = new FileInputStream(
//		".\\src\\main\\resources\\Files\\file2.properties");

		Properties prop = new Properties();

		prop.load(fis);

//		String propValue = prop.getProperty("name");
		String propValue = prop.getProperty("company");
		System.out.println(propValue);

		PropertyFileReading obj = new PropertyFileReading();

		prop.setProperty("company", "Wipro");

		System.out.println(prop.getProperty("company"));
	}

	public void readAProperty(String filePath, String propName) throws Exception {
		FileReader reader = new FileReader(filePath);

		Properties prop = new Properties();
		prop.load(reader);

		String prop_name = prop.getProperty(propName);
		System.out.println(prop_name);

	}

	public void readAProperty(String propName) throws Exception {
		FileReader reader = new FileReader(filePath);

		Properties prop = new Properties();
		prop.load(reader);

		String prop_name = prop.getProperty(propName);
		System.out.println(prop_name);
	}

	public static String readApropertyAndReturnItsValue(String propName) throws Exception {
		FileReader reader = new FileReader(filePath);

		Properties prop = new Properties();
		prop.load(reader);

		return prop.getProperty(propName);

	}

	public void setValueToGivenProperty(String propName, String propNewValue) throws Exception {
		FileReader reader = new FileReader(".\\src\\test\\resources\\file2.properties");

		Properties prop = new Properties();
		prop.load(reader);

//		prop.setProperty("company", "TCS");
		prop.setProperty(propName, propNewValue);
	}

}
