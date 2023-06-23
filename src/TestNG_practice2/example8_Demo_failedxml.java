package TestNG_practice2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example8_Demo_failedxml {

	@Test
	public void TC1()
	{
		Reporter.log("running TC1");
	}
	
	@Test
	public void TC2()
	{
		Reporter.log("running TC2");
	}
	
	@Test
	public void TC3()
	{
		Reporter.log("running TC3");
	}
	
}
