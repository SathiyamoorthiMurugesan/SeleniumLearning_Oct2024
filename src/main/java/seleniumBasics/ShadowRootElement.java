package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowRootElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\drivers\\chromedriver_128.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://watir.com/examples/shadow_dom.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		SearchContext shadowHost1 = driver.findElement(By.id("shadow_host")).getShadowRoot();
//		String text = shadowHost1.findElement(By.xpath("//span[text() = 'some text']")).getText();
		String text = shadowHost1.findElement(By.className("info")).getText();
		System.out.println(text);
		
		
		SearchContext nestedShadowHost1 = shadowHost1.findElement(By.cssSelector("#nested_shadow_host")).getShadowRoot();
		String nestedText = nestedShadowHost1.findElement(By.cssSelector("#nested_shadow_content > div")).getText();
		System.out.println(nestedText);
		
		
//	       SearchContext shadowRoot = driver.findElement (By.id ("shadow_host")).getShadowRoot ();
//	       SearchContext shadowRootTwo = shadowRoot.findElement (By.cssSelector ("#nested_shadow_host")).getShadowRoot ();
//	       String nestedText = shadowRootTwo.findElement (By.cssSelector ("#nested_shadow_content > div")).getText ();
		
	}

}
