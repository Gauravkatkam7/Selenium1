package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example5_TestNGKeyword3_priority1 {

	@Test(priority=3)
	public void TC1()
	{
		Reporter.log("TC1",true);
	}
	@Test(priority=2)
	public void TC2()
	{
		Reporter.log("TC2",true);
	}
	@Test(priority=3)
	public void TC3()
	{
		Reporter.log("TC3",true);
	}
	@Test(priority=-4)
	public void TC4()
	{
		Reporter.log("TC4",true);
	}
	@Test      //bydefault =0
	public void TC5()
	{
		Reporter.log("TC5",true);
	}
	
}
