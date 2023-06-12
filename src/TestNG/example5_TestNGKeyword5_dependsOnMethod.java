package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example5_TestNGKeyword5_dependsOnMethod {

	@Test
	public void TC1()
	{
		Reporter.log("login",true)
	}
	
	@Test
	public void TC2()
	{
		Reporter.log("verify",true);
	}
	
	@Test(dependsOnMethods="TC1")
	public void TC3()
	{
		Reporter.log("logOut",true);
	}
	
}
