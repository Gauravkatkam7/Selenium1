package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example5_TestNGKeyword2_EnableFalse {

	@Test(enabled=false)
	public void TC1()
	{
		Reporter.log("running tc1",true);
	}
	
	@Test
	public void TC2() 
	{
		Reporter.log("running tc2",true);
	}
	
	@Test(enabled=false)
	public void TC3()
	{
		Reporter.log("running tc3",true);
	}
}
