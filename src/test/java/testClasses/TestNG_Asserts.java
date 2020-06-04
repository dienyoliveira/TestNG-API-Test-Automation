package testClasses;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import appCode.GFTApplication;

public class TestNG_Asserts {
	
	GFTApplication obj = new GFTApplication();
	
	@Test
	public void testMethod1() {
		System.out.println("@Test -> testMethod1");
		int currentResult = obj.sum(1, 2);
		int expectedResult = 3;
		assertEquals(currentResult, expectedResult);
		
	}
	
	@Test
	public void testMethod2() {
		System.out.println("@Test -> testMethod2");
	}
	
	@Test
	public void testDieny() {
		System.out.println("@Test -> Dieny");
	}
}
