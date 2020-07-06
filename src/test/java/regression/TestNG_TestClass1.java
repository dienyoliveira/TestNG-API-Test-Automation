package regression;


import org.testng.annotations.Test;

import baseTest.BaseTestSuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestNG_TestClass1 extends BaseTestSuite {
		
	@Test
	public void testMethod1() {
		System.out.println("class1 - testMethod1");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("class1 -> testMethod2");
	}
	
	@Test
	public void testDieny() {
		System.out.println("class1 -> Dieny");
	}
	
	@BeforeMethod
	public void beforeMethod() {
	System.out.println("Before Method");
	
	}
	
	@AfterMethod
	public void afterMethod() {
	System.out.println("After Method");
	
	}
}
