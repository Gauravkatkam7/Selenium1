package POM_DDF_TestNG_BaseClass_UtilityClass_CaptureSSOfFailedTCes_PropertyFile;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PBLoginTest1 extends BaseClass1
{

	PBLoginPage1 login;
	PBMobNumPage1 mobnum;
	PBPwdPage1 pwd;
	PBHomePage1 home;
	PBMyAccPage1 myacc;
	PBProfilePage1 profile;
	
	int TCID;
	
	@BeforeClass
	public void openBrowser() throws IOException
	{
		initializeBrowser();
		login=new PBLoginPage1(driver);
		mobnum=new PBMobNumPage1(driver);
		pwd=new PBPwdPage1(driver);
		home=new PBHomePage1(driver);
		myacc=new PBMyAccPage1(driver);
		profile=new PBProfilePage1(driver);
	}
	
	@BeforeMethod
	public void signInToApp() throws IOException, InterruptedException
	{
		login.clickPBLoginPage1SignInBtn();
		mobnum.inpPBMobNumPage1MobNum(UtilityClass1.getPFData("MobNum"));
		mobnum.clickPBMobNumPage1SignInWithPwdBtn();
		pwd.inpPBPwdPage1Pwd(UtilityClass1.getPFData("Pwd"));
		pwd.clickPBPwdPage1SignInBtn();
		Thread.sleep(2000);
	}
	
	@Test
	public void verifyFullName() throws EncryptedDocumentException, IOException, InterruptedException
	{
		TCID=102;
		home.openDDOptionsPBHomePage1MyAcc();
		myacc.clickPBMyAccPage1MyProfileBtn();
		profile.switchToChildBrowser();
		String actualResult = profile.getPBProfilePage1fullName();
		String expectedResult =UtilityClass1.getTestData(0, 2);
		
		Assert.assertEquals(actualResult, expectedResult,"Failed:both results are not same");
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void logOutFromApp(ITestResult s1) throws IOException
	{
		if(s1.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass1.captureSS(driver, TCID);
		}
	}
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
}
