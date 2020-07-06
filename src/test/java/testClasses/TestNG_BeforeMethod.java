package testClasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestNG_BeforeMethod {
	
	@Test
	public void testMethod1() {
		System.out.println("@Test -> testMethod1");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("@Test -> testMethod2");
	}
	
	@Test
	public void testDieny() {
		System.out.println("@Test -> Dieny");
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
