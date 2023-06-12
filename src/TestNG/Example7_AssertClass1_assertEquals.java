package TestNG;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example7_AssertClass1_assertEquals {

	@Test
	public void TC1()
	{
		String exp="hi";
		String act="hi";
		
		Assert.assertEquals(exp, act,"Fail:both result are different");
	}
}
