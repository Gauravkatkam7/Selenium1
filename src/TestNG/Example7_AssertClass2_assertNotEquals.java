package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example7_AssertClass2_assertNotEquals {

	@Test
	public void TC1()
	{
		String act="hi";
		String exp="hi";
		
		Assert.assertNotEquals(act, exp,"Failed:both results are same");
	}
}
