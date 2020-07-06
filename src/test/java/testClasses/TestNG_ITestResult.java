package testClasses;

import static org.testng.Assert.assertTrue;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestNG_ITestResult {
	@Test
	public void testMethod1() {
		System.out.println("@Test -> testMethod1");
		assertTrue(true);
	}
	
	@Test
	public void testMethod2() {
		System.out.println("@Test -> testMethod2");
		assertTrue(false);
	}
	
	@Test
	public void testDieny() {
		System.out.println("@Test -> Dieny");
		assertTrue(true);
	}
	
	@AfterMethod
	public void afterMethod(ITestResult testResult)
	{
		if (testResult.getStatus() == ITestResult.FAILURE) {
			System.out.println("Failed: " + testResult.getMethod().getMethodName());
		} else if (testResult.getStatus() == ITestResult.SUCCESS)	{
			System.out.println("Successful: " + testResult.getMethod().getMethodName());
		}
		
		
	}
	
}
