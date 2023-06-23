package TestNG_practice2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example9_Grouping1 {

	@Test(groups="login")
	public void TC1()
	{
		Reporter.log("running TC1",true);
	}
	

	@Test(groups="verify")
	public void TC2()
	{
		Reporter.log("running TC2",true);
	}
	
	@Test(groups="setting")
	public void TC3()
	{
		Reporter.log("running TC3",true);
	}
	
	@Test(groups="login")
	public void TC4()
	{
		Reporter.log("running TC4",true);
	}
	
}
