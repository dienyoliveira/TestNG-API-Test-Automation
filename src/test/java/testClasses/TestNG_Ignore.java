package testClasses;

import org.testng.annotations.Test;

public class TestNG_Ignore {
	
	@Test
	public void testMethod1() {
		System.out.println("@Test -> testMethod1");
	}
	
	@Test(enabled = false)
	public void testMethod2() {
		System.out.println("@Test -> testMethod2");
	}
	
	@Test
	public void testDieny() {
		System.out.println("@Test -> Dieny");
	}
}
