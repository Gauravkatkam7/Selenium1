package TestNG;

import org.testng.annotations.Test;

public class sample2 {

	@Test
	public void TC4()
	{
		System.out.println("running TC4");
	}
	
	@Test
	public void TC5()
	{
		System.out.println("running TC5");
	}
	
	@Test(dependsOnMethods="TC5")
	public void TC6()
	{
		System.out.println("running TC6")
	}
}