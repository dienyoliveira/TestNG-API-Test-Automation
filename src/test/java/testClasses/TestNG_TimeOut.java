package testClasses;

import org.testng.annotations.Test;

public class TestNG_TimeOut {
	
	@Test(timeOut = 1000)
	public void testMethod1() throws InterruptedException {
		System.out.println("@Test -> testMethod1");
		Thread.sleep(2000);
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
