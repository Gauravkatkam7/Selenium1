package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example3_emailablereport {

	@Test
	public void TC1()
	{
		Reporter.log("hello",true);
	}
	@Test
	public void TC2() 
	{
		Reporter.log("good morning");
	}
	@Test
	public void TC3()
	{
		Reporter.log("good night",true);
	}
	
}
