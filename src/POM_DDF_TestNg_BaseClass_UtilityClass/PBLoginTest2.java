package POM_DDF_TestNg_BaseClass_UtilityClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PBLoginTest2 extends BaseClass2 
{

	PBLoginPage2 login;
	PBMobNumPage2 mobnum;
	PBPwdPage2 pwd;
	PBHomePage2 home;
	PBMyAccPage2 myacc;
	PBProfilePage2 profile;
	PBLogOutPage2 logout;
	
	@BeforeClass
	public void openBrowser()
	{
		initializeBrowser();
		
		login=new PBLoginPage2(driver);
		mobnum=new PBMobNumPage2(driver);
		pwd=new PBPwdPage2(driver);
		home=new PBHomePage2(driver);
		myacc=new PBMyAccPage2(driver);
		profile=new PBProfilePage2(driver);
		logout=new PBLogOutPage2(driver);
	}
	
	@BeforeMethod
	public void signIntoApp() throws EncryptedDocumentException, IOException, InterruptedException
	{
		login.clickPBLoginPage2SignIn();
		mobnum.inpPBMobNumPage2mobNum(UtilityClass2.getTestData(0, 0));
		mobnum.clickSignInWithPwdBtn();
		pwd.inpPBPwdPage2pwd(UtilityClass2.getTestData(0, 1));
		pwd.clickPBPwdPage2signInBtn();
		Thread.sleep(2000);
	}
	
	@Test
	public void verifyFullName() throws EncryptedDocumentException, IOException, InterruptedException
	{
		home.openDDOptionsPBHomePage2myAcc();
		myacc.clickPBMyAccPage2myProfile();
		profile.switchToChildBrowser();
		String actualResult = profile.getPBProfilePage2fullName();
		String expectedResult = UtilityClass2.getTestData(0, 2);
		Assert.assertEquals(actualResult, expectedResult,"Failed: both results are not same");
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void logOutFromApp()
	{
		logout.clickPBLogOutPage1LogOutBtn();
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
	
}
