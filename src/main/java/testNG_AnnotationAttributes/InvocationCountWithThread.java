package testNG_AnnotationAttributes;

import org.testng.annotations.Test;

public class InvocationCountWithThread {
	
	@Test(invocationCount = 10, threadPoolSize = 5)
	public void method1() {
		System.out.println("hello");
//		System.out.println(Thread.currentThread());
	}
	
	

}
