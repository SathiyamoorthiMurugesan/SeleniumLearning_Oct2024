package testNG_AnnotationAttributes;

import org.testng.annotations.Test;

public class Groups {

	@Test(groups = { "Group1" })
	public void method1() {
		System.out.println("I am Method1 from Group1");
	}

	@Test(groups = { "Group2" })
	public void method2() {
		System.out.println("I am Method2 from Group2");
	}

	@Test(groups = { "Group1" })
	public void method3() {
		System.out.println("I am Method3 from Group1");
	}

	@Test(groups = { "Group1", "Group2" })
	public void method4() {
		System.out.println("I am Method4 from Group1 and Group2");
	}

	@Test
	public void method5() {
		System.out.println("I am Method5 ");
	}

}
