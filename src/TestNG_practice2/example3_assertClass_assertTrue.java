package TestNG_practice2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example3_assertClass_assertTrue {

	@Test
	public void TC1()
	{
		boolean actResult=false;
		
		Assert.assertTrue(actResult,"Failed:actResult is false");
		
	}
}
