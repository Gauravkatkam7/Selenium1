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

public class PBLoginTest1 {

	PBLoginPage1 login;
	PBMobNumPage1 mobnum;
	PBPwdPage1 pwd;
	PBHomePage1 home;
	PBMyAccPage1 myacc;
	PBProfilePage1 profile;
	PBLogOutPage1 logout;
	
	WebDriver driver;
	Sheet sh;
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException
	{
		 FileInputStream file=new FileInputStream("F:\\software testing\\automation\\selenium\\excelsheet\\samplestring.xlsx");
	     sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		 driver=new ChromeDriver();
		 driver.get("https://www.policybazaar.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 login=new PBLoginPage1(driver);
		 mobnum=new PBMobNumPage1(driver);
	     pwd=new PBPwdPage1(driver);
		 home=new PBHomePage1(driver);
		 myacc=new PBMyAccPage1(driver);
		 profile=new PBProfilePage1(driver);
		 logout=new PBLogOutPage1(driver);
	}
	
	@BeforeMethod
	public void logInToApp() throws InterruptedException
	{
		login.clickPBLoginPage1SignInBtn();
		mobnum.inpPBMobNumPage1MobNum(sh.getRow(0).getCell(0).getStringCellValue());
		mobnum.clickPBMobNumPage1SignInWithPwdBtn();
		pwd.inpPBPwdPage1Pwd(sh.getRow(0).getCell(1).getStringCellValue());
		pwd.clickPBPwdPage1SignInBtn();
		Thread.sleep(2000);
	}
	
	@Test
	public void verifyFullName() throws InterruptedException
	{
		home.openDDOptionsPBHomePage1MyAcc();
		Thread.sleep(2000);
		myacc.clickPBMyAccPage1MyProfileBtn();
		profile.switchToChildBrowser();
		
		String actResult = profile.getPBProfilePage1Fullname();
		String expResult = sh.getRow(0).getCell(2).getStringCellValue();
		
		Assert.assertEquals(actResult, expResult, "failed:both results are not same");
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
