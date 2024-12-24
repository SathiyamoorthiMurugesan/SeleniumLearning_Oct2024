package testNG;

//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterGroups;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeGroups;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;

import org.testng.annotations.*;

public class AnnotationsOrderOfExecution {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am @BeforeSuite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("I am @AfterSuite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("I am @BeforeTest");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("I am @AfterTest");
	}

	
	@BeforeGroups
	public void beforeGroups() {
		System.out.println("I am @BeforeGroups");
	}
	
	@AfterGroups
	public void afterGroups() {
		System.out.println("I am @AfterGroups");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("I am @BeforeClass");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("I am @AfterClass");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am @BeforeMethod");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("I am @AfterMethod");
	}
	
	@Test
	public void method1() {
		System.out.println("I am @Test");
	}

}
