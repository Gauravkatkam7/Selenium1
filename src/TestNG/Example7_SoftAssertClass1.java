package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Example7_SoftAssertClass1 {

	@Test
	public void TC1()
	{
		SoftAssert soft=new SoftAssert();
		
		String actResult="hi";
		String expResult="hello";
		
		soft.assertEquals(actResult, expResult,"Failed1:Both Results Are Not Same");
		
		boolean expResult1=false;
		
		soft.assertTrue(expResult1,"failed2:expResult is false");
		
		soft.assertAll();
		
	}
}
