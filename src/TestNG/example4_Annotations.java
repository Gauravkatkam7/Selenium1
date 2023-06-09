package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class example4_Annotations {

	@BeforeClass	
	public void TC4()
	{
		Reporter.log("RUNNING TC4",true);
	}
	@BeforeMethod
	public void TC2()
	{
		Reporter.log("RUNNING TC2",true);
	}
	@Test
	public void TC3()
	{
		Reporter.log("RUNNING TC3",true);
	}
	@Test
	public void TC6()
	{
		Reporter.log("RUNNING TC6",true);
	}
	@AfterMethod
	public void TC1()
	{
		Reporter.log("RUNNING TC1",true);
	}
	@AfterClass
	public void TC5()
	{
		Reporter.log("RUNNING TC5",true);
	}
}
