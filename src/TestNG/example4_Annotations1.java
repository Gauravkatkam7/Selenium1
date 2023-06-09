package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class example4_Annotations1 {

	@Test
	public void TC1()
	{
		Reporter.log("running TC1");
	}
	@AfterClass
	public void TC3()
	{
		Reporter.log("running TC3");
	}
	@BeforeMethod
	public void TC2()
	{
		Reporter.log("running TC2");
	}
	@BeforeClass
	public void TC5()
	{
		Reporter.log("running TC5");
	}
	@AfterMethod
	public void TC4()
	{
		Reporter.log("running TC4");
	}
}
