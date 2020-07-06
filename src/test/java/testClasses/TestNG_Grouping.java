package testClasses;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestNG_Grouping {
	
	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() {
		System.out.println("bfr");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("aft");
	}
	
	@Test(groups = {"login", "smoke"})
	public void tc001_login_valido() {
		System.out.println("tc001");
	}
	
	@Test(groups = {"login"})
	public void tc002_login_invalido() {
		System.out.println("tc002");
	}
	
	@Test(groups = {"cadastro", "smoke"})
	public void tc003_cadastro_valido() {
		System.out.println("tc003");
	}
	
	@Test(groups = {"cadastro"})
	public void tc004_cadastro_valido() {
		System.out.println("tc004");
	}
	
	@Test(groups = {"cadastro"})
	public void tc005_cadastro_duplicado() {
		System.out.println("tc005");
	}
}
