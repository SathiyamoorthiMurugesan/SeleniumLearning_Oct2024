package testNG_AnnotationAttributes;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(invocationCount = 10)
	public void method1() {
		System.out.println("hello");
	}

}
