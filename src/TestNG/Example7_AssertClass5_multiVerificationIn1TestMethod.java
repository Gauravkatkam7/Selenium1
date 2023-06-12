package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example7_AssertClass5_multiVerificationIn1TestMethod {

	@Test
	public void TC1()
	{
		String actResult="hello";
		String expResult="hello";
		
		Assert.assertEquals(actResult, expResult,"Failed:Both results are not equal");
		
		boolean actResult1=false;
		
		Assert.assertTrue(actResult1,"failed:Actula Result is false");
		
		
		
		
	}
}
