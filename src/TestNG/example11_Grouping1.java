package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example11_Grouping1 {

	@Test(groups="login")
	public void TC1()
	{
		Reporter.log("RUnning TC1",true);
	}
	
	@Test(groups="setting")
	public void TC2()
	{
		Reporter.log("RUnning TC2",true);
	}
	
	@Test(groups="login")
	public void TC3()
	{
		Reporter.log("RUnning TC3",true);
	}
	
	@Test(groups="setting")
	public void TC4()
	{
		Reporter.log("RUnning TC4",true);
	}
	
}
