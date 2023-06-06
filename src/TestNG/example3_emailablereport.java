package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example3_emailablereport {

	@Test
	public void TC1()
	{
		Reporter.log("helllo",true);
	}
	
}
