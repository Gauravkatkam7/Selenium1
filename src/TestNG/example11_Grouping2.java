package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example11_Grouping2 {

	@Test(groups="login")
	public void TC5()
	{
		Reporter.log("RUnning TC5",true);
	}
	
	@Test(groups="setting")
	public void TC6()
	{
		Reporter.log("RUnning TC6",true);
	}
	
	@Test(groups="login")
	public void TC7()
	{
		Reporter.log("RUnning TC7",true);
	}
	
	@Test(groups="profile")
	public void TC8()
	{
		Reporter.log("RUnning TC8",true);
	}
	
}
