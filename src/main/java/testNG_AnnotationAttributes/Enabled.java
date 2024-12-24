package testNG_AnnotationAttributes;

import org.testng.annotations.Test;

public class Enabled {
	
	@Test
	public void TestEnabled1() {
		System.out.println("1111111");
	}
	
	@Test (enabled = false )
	public void TestEnabled2() {
		System.out.println("2222222");
	}
	
	@Test (alwaysRun = true )
	public void TestEnabled3() {
		System.out.println("3333333");
	}

}
