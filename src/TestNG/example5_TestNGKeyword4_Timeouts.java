package TestNG;

import org.testng.annotations.Test;

public class example5_TestNGKeyword4_Timeouts {

	@Test(timeOut=5000)
	public void TC1() throws InterruptedException
	{
		Thread.sleep(6000);
		System.out.println("Running TC1");
	}
	
	@Test
	public void TC2()
	{
		System.out.println("running TC2");
	}
	
	@Test
	public void TC3()
	{
		System.out.println("running TC3");
	}
}
