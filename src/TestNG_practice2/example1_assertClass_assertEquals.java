package TestNG_practice2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example1_assertClass_assertEquals {

	@Test
	public void TC1()
	{
		String actResult="hi";
		String expResult="hello";
		
		Assert.assertEquals(actResult, expResult,"Failed:Both Result Are Not Same");
		
	}
}
