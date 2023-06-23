package POM_DDF_TestNg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PBLoginTest3 {

	PBLoginPage3 login;
	PBMobNumPage3 mobnum;
	PBPwdPage3 pwd;
	PBHomePage3 home;
	PBMyAccPage3 myacc;
	PBProfilePage3 profile;
	PBLogOutPage3 logout;
	
	WebDriver driver;
	Sheet sh;
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("F:\\software testing\\automation\\selenium\\excelsheet\\samplestring.xlsx");
		sh=WorkbookFactory.create(file).getSheet("Sheet1");
		
		driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		login=new PBLoginPage3(driver);
		mobnum=new PBMobNumPage3(driver);
		pwd=new PBPwdPage3(driver);
		home=new PBHomePage3(driver);
		myacc=new PBMyAccPage3(driver);
		profile=new PBProfilePage3(driver);
		logout=new PBLogOutPage3(driver);
		
	}
	
	@BeforeMethod
	public void signInToApp() throws InterruptedException
	{
		login.clickPBLoginPage2SignIn();
		mobnum.inpPBMobNumPage3MobNum(sh.getRow(0).getCell(0).getStringCellValue());
		mobnum.clickPBMobNumPage3SignInWithPwdBtn();
		pwd.inpPBPwdPage1Pwd(sh.getRow(0).getCell(1).getStringCellValue());
		pwd.clickPBPwdPage1SignInBtn();
		Thread.sleep(2000);
	}
	
	@Test
	public void verifyFullName() throws InterruptedException
	{
		home.openDDOptionsPBHomePage1MyAcc();
		myacc.clickPBMyAccPage1MyProfileBtn();
		profile.switchToChildBrowser();
		
		String actualResult = profile.getPBProfilePage3fullName();
		String expectedResult=sh.getRow(0).getCell(2).getStringCellValue();
		
		Assert.assertEquals(actualResult, expectedResult,"failed:both result are not same");	
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
