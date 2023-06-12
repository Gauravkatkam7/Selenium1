package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example5_TestNGKeyword5_dependsOnMethod2 {

	
	@Test
	public void TC1()
	{
		Reporter.log("running login TC1");
	}
	
	@Test
	public void TC2()
	{
		Reporter.log("running verify the name TC2")
	}
	
	@Test(dependsOnMethods= {"TC1","TC2"})
	public void TC3()
	{
		Reporter.log("verify the logout TC3");
	}
}
