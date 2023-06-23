package POM_DDF_TestNg_BaseClass_UtilityClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PBLoginTest1 extends BaseClass 
{

	PBLoginPage1 login;
	PBMobNumPage1 mobnum;
	PBPwdPage1 pwd;
	PBHomePage1 home;
	PBMyAccPage1 myacc;
	PBProfilePage1 profile;
	PBLogOutPage1 logout;
	
	@BeforeClass
	public void OpenBrowser()
	{
		initializeBrowser();
		
		login=new PBLoginPage1(driver);
		mobnum=new PBMobNumPage1(driver);
		pwd=new PBPwdPage1(driver);
		home=new PBHomePage1(driver);
		myacc=new PBMyAccPage1(driver);
		profile=new PBProfilePage1(driver);
		logout=new PBLogOutPage1(driver);
	}
	
	@BeforeMethod
	public void signIntoApp() throws EncryptedDocumentException, IOException, InterruptedException
	{
		login.clickPBLoginPage1SignInBtn();
		mobnum.inpPBMobNumPage1MobNum(UtilityClass.getTestData(0, 0));
		mobnum.clickPBMobNumPage1SignInWithPwdBtn();
		pwd.inpPBPwdPage1Pwd(UtilityClass.getTestData(0, 1));
		pwd.clickPBPwdPage1SignInBtn();
		Thread.sleep(2000);
	}
	
	@Test
	public void verifyFullName() throws EncryptedDocumentException, IOException
	{
		home.openDDOptionsPBHomePage1MyAcc();
		myacc.clickPBMyAccPage1MyProfileBtn();
		profile.switchToChildBrowser();
		
		String actualResult = profile.getPBProfilePage1fullName();
		String expectedResult =UtilityClass.getTestData(0, 2);
		
		Assert.assertEquals(actualResult, expectedResult,"Failed Both Results Are Not Same");
	}
	
	@AfterMethod
	public void logOutFromApp() throws InterruptedException
	{
		logout.clickPBLogOutPage1LogOutBtn();
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
}
