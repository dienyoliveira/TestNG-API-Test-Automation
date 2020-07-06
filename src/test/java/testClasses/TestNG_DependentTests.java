package testClasses;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import appCode.GFTApplication;

public class TestNG_DependentTests {
	
	GFTApplication obj = new GFTApplication();
	
	@Test(dependsOnMethods = {"testMethod2"})
	public void testMethod1() {
		System.out.println("testMethod1");
	}
	
	@Test(dependsOnMethods = {"testMethod4", "testMethod3"})
	public void testMethod2() {
		System.out.println("testMethod2");
		
		int currentResult = obj.sum(1, 2);
		int expectedResult = 3;
		assertEquals(currentResult, expectedResult);
	}
	
	@Test
	public void testMethod3() {
		System.out.println("testMethod3");
	}
	
	@Test
	public void testMethod4() {
		System.out.println("testMethod4");
	}
}
