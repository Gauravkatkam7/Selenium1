package POM_DDF_TestNg_BaseClass_UtilityClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PBLoginTest3 extends BaseClass3 
{
	PBLoginPage3 login;
	PBMobNumPage3 mobnum;
	PBPwdPage3 pwd;
	PBHomePage3 home;
	PBMyAccPage3 myacc;
	PBProfilePage3 profile;
	PBLogOutPage3 logout;
	
@BeforeClass
public void openBrowser() 
{
	initializeBrowser();
	
	login=new PBLoginPage3(driver);
	mobnum=new PBMobNumPage3(driver);
	pwd=new PBPwdPage3(driver);
	home=new PBHomePage3(driver);
	myacc=new PBMyAccPage3(driver);
	profile=new PBProfilePage3(driver);
	logout=new PBLogOutPage3(driver);
	
}
@BeforeMethod
public void signInToApp() throws EncryptedDocumentException, IOException, InterruptedException
{
	login.clickPBLoginPage2SignIn();
	mobnum.inpPBMobNumPage3MobNum(UtilityClass3.getTestData(0, 0));
	mobnum.clickPBMobNumPage3SignInWithPwdBtn();
	pwd.inpPBPwdPage1Pwd(UtilityClass3.getTestData(0, 1));
	pwd.clickPBPwdPage1SignInBtn();
	Thread.sleep(2000);
}
@Test
public void verifyFullName() throws InterruptedException, EncryptedDocumentException, IOException
{
	home.openDDOptionsPBHomePage1MyAcc();
	myacc.clickPBMyAccPage1MyProfileBtn();
	profile.switchToChildBrowser();
	String actualResult = profile.getPBProfilePage3fullName();
	String expectedResult=UtilityClass3.getTestData(0, 2);
	
	Assert.assertEquals(actualResult, expectedResult);
	Thread.sleep(2000);
}
@AfterMethod
public void logOutFromApp() throws InterruptedException
{
	logout.clickPBLogOutPage3LogOutBtn();
	Thread.sleep(2000);
}
@AfterClass
public void closeBrowser() throws InterruptedException
{
	Thread.sleep(2000);
	driver.quit();
}
	
}