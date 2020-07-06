package testClasses;

import org.testng.annotations.Test;

public class TestNG_DataProviders{
	
	@Test(dataProvider = "input", dataProviderClass = TestDataFactory.class)
	public void testMethod1(String usuario, String senha) {
		//abre browser
		//clica no login
		//digita user
		//digita senha
		//clica login
		
		System.out.println("Usuario: " + usuario);
		System.out.println("Senha:" + senha);
	}
}
