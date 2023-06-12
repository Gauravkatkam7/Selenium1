package TestNG_practice2;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class example5_assertClass_multiVerificationInOneMethod {

	@Test
	public void TC1()
	{
		SoftAssert soft=new SoftAssert();
		
		String actResult="hi";
		String expResult="hello";
		
		soft.assertEquals(actResult, expResult,"Failed:both results are not equal");
		
		boolean actResult1=false;
		
		soft.assertTrue(actResult1,"Failed:actual result is false");
		
		soft.assertAll();
	}
}
