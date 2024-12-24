package testNG_AnnotationAttributes;

import org.testng.annotations.Test;

public class DependsOnGroup {

	@Test(groups = { "groupA" })
	public void group1() {
		System.out.println(1 / 0);
	}

	@Test(groups = { "groupB" })
	public void group2() {
		System.out.println("I am belongs to group2");
	}

	@Test(dependsOnGroups = { "groupA", "groupB" })
	public void group1and2() {
		System.out.println("I am belongs to group1and2");
	}

	@Test(dependsOnGroups = "groupA")
	public void group2and3() {
		System.out.println("I am belongs to group2and3");
	}
	
	@Test(dependsOnGroups = "groupA", alwaysRun = true)
	public void alwaysRun() {
		System.out.println("I am belongs to group2and3");
	}

	@Test(dependsOnGroups = "groupB")
	public void group3and4() {
		System.out.println("I am belongs to group3and4");
	}
}
