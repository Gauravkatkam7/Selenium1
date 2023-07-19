package TestNG_practice2;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class example11_Annotations {

	@BeforeClass
	public void TC1()
	{
		Reporter.log("running TC1",true);
	}
	
	@BeforeMethod
	public void TC2()
	{
		Reporter.log("running TC2",true);
	}
	
	@Test
	public void TC3()
	{
		Reporter.log("running TC3",true);
	}
	@Test
	public void tC4()
	{
		Reporter.log("running TC4",true);
	}
	
	@AfterMethod
	public void TC5()
	{
		Reporter.log("running TC5",true);
	}
	@AfterMethod
	public void TC6()
	{
		Reporter.log("running TC6",true);
	}
	
	@AfterClass
	public void TC7()
	{
		Reporter.log("running TC7",true);
	}
}
