package TestNG_practice2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example2_assertClass_assertNotEquals {

	@Test
	public void TC1()
	{
		String actResult="hi";
		String expResult="hello";
		
		Assert.assertNotEquals(actResult, expResult,"Failed:Both Result are same");
		
	}
}
