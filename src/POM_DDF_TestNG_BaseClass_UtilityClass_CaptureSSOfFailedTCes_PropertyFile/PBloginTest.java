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

public class PBloginTest extends BaseClass
{

	PBLoginPage login;
	PBMobNumPage mobnum;
	PBPwdPage pwd;
	PBHomePage home;
	PBMyAccPage myacc;
	PBProfilePage profile;
	
	int TCID;
	
	@BeforeClass
	public void openBrowser() throws IOException
	{
		initializeBrowser();
		
		login =new PBLoginPage(driver);
		mobnum =new PBMobNumPage(driver);
		pwd =new PBPwdPage(driver);
		home=new PBHomePage(driver);
		myacc=new PBMyAccPage(driver);
		profile=new PBProfilePage(driver);
	}
	
	@BeforeMethod
	public void signInToApp() throws IOException, InterruptedException
	{
		login.clickPBLoginPageSignIN();
		mobnum.inpPBMobNumPageMobNum(UtilityClass.getPFData("MobNum"));
		Thread.sleep(2000);
		mobnum.clickPBMobNumPageSignInWithPwd();
		pwd.inpPBPwdPagePWD(UtilityClass.getPFData("Pwd"));
		pwd.clickPBPwdPageSignIn();
		Thread.sleep(2000);
	}
	@Test
	public void verifyFullName() throws EncryptedDocumentException, IOException, InterruptedException
	{
		TCID=101;
		home.openDDOptionPBHomePageMyAcc();
		myacc.clickPBMyAccPageMyProfile();
		profile.switchToChildBrowser();
		String actualResult = profile.getPBProfilePagefullName();
		String expectedResult =UtilityClass.getTestData(0, 2);
		
		Assert.assertEquals(actualResult, expectedResult,"Failed:both results are not same");
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void logOutFromApp(ITestResult s1) throws IOException
	{
		if(s1.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass.captureSS(driver, TCID);
		}
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
}
