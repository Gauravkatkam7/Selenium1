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

public class PBLoginTest2 {

	PBLoginPage2 login;
	PBMobNumPage2 mobnum;
	PBPwdPage2 pwd;
	PBHomePage2 home;
	PBMyAccPage2 myacc;
	PBProfilePage2 profile;
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
		
	    login=new PBLoginPage2(driver);
		mobnum=new PBMobNumPage2(driver);
		pwd=new PBPwdPage2(driver);
		home=new PBHomePage2(driver);
		myacc=new PBMyAccPage2(driver);
		profile=new PBProfilePage2(driver);
		logout=new PBLogOutPage1(driver);
	}
	
	@BeforeMethod
	public void signIntoApp() throws InterruptedException
	{
		login.clickPBLoginPage2SignIn();
		mobnum.inpPBMobNumPage2mobNum(sh.getRow(0).getCell(0).getStringCellValue());
		mobnum.clickSignInWithPwdBtn();
		pwd.inpPBPwdPage2pwd(sh.getRow(0).getCell(1).getStringCellValue());
		pwd.clickPBPwdPage2signInBtn();
		Thread.sleep(2000);
	}
	
	@Test
	public void verifyFullName() throws InterruptedException
	{
		home.openDDOptionsPBHomePage2myAcc();
		Thread.sleep(2000);
		myacc.clickPBMyAccPage2myProfile();
		profile.switchToChildBrowser();
		
		String actualResult = profile.getActResultPBProfilePage2fullName();
		String expectedresult= sh.getRow(0).getCell(2).getStringCellValue();
		Assert.assertEquals(actualResult, expectedresult,"failed:both results are not same");
	}
	
	@AfterMethod
	public void logoutFromApp() throws InterruptedException
	{
		Thread.sleep(2000);
		logout.clickPBLogOutPage1LogOutBtn();
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
}
