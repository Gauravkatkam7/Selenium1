package TestNG_practice2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example5_disableTestCaseExecutionFromTestClassAndTestSuit {

	@Test
	public void TC1()
	{
		Reporter.log("Running TC1",true);
	}
	@Test
	public void TC2()
	{
		Reporter.log("Running TC2",true);
	}
	@Test
	public void TC3()
	{
		Reporter.log("Running TC3",true);
	}
	@Test(enabled=false)
	public void TC4()
	{
		Reporter.log("Running TC4",true);
	}
	
	
}
