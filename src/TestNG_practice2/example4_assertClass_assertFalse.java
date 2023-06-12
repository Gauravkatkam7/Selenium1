package TestNG_practice2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example4_assertClass_assertFalse {

	@Test
	public void TC1()
	{
		boolean actResult=true;
		
		Assert.assertFalse(actResult,"Failed: actual result is true");
	}
}
