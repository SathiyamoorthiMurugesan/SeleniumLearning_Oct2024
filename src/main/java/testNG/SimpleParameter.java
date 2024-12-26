package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SimpleParameter {
	
	@Parameters({"myParameter"})
	
	@Test
	public void nameTest(String name) {
		System.out.println(name);
	}

}
