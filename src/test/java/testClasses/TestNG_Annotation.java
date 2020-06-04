package testClasses;

import org.testng.annotations.Test;

public class TestNG_Annotation {
	
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
}
