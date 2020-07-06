package testClasses;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameters {
	
	@BeforeClass
	@Parameters({"browser", "plataform"})
	public void setUp(String browser, String plataform) {
		System.out.println("Parametro 1: " + browser);
		System.out.println("Parametro 2: " + plataform);
	}
	
	@Test
	@Parameters("response")
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
