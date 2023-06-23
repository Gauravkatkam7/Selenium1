package TestNG_practice2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example9_Grouping2 {

	@Test(groups="login")
	public void TC5()
	{
		Reporter.log("running TC5",true);
	}
	
	@Test(groups="verify")
	public void TC6()
	{
		Reporter.log("running TC6",true);
	}
	
	@Test(groups="setting")
	public void TC7()
	{
		Reporter.log("running TC7",true);
	}
	
	@Test(groups="login")
	public void TC8()
	{
		Reporter.log("running TC8",true);
	}
	
}

