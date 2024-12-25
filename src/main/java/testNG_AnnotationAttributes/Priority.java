package testNG_AnnotationAttributes;

import org.testng.annotations.Test;

public class Priority {

	@Test (priority = 1)
	public void TC01() {
//		step1 
//		step2
		System.out.println("Hello");
	}
	
	@Test
	public void TC02() {
		System.out.println("Hiiii");
	}
	
	@Test 
//	(priority = 1)
	public void AA() {
		System.out.println("AAA");
	}
}
