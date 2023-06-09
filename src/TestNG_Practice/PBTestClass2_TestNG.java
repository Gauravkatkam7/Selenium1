package TestNG_Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PBTestClass2_TestNG {

	WebDriver driver1;
	Sheet sh1;
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("F:\\software testing\\automation\\selenium\\excelsheet\\samplestring.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver1=driver;
        sh1=sh;
	}
	@BeforeMethod
	public void signInToPB() throws InterruptedException
	{
		PBLoginPage2 login=new PBLoginPage2(driver1);
		login.clickPBLoginPage2SignIn();
		Thread.sleep(2000);
		
		PBMobNumPage2 mobnum=new PBMobNumPage2(driver1);
		mobnum.inpPBMobNumPage2MobNum(sh1.getRow(0).getCell(0).getStringCellValue());
		mobnum.clickSignInWithPwdBtn();
		Thread.sleep(2000);
	
		PBPwdPage2 pwd=new PBPwdPage2(driver1);
		pwd.inpPBPwdPage2Pwd(sh1.getRow(0).getCell(1).getStringCellValue());
		pwd.clickPBPwdPage2SignIn();
		Thread.sleep(2000);
		
		PBHomePage2 home=new PBHomePage2(driver1);
		home.openDDOptionsPBHomePage2MyAcc();
		Thread.sleep(2000);
		
		PBMyAccPage2 myacc=new PBMyAccPage2(driver1);
		myacc.clickPBMyAccPage2MyProfile();
		Thread.sleep(2000);
	}
	
	@Test
	public void verifyFullName() throws InterruptedException
	{
		PBProfilePage2 profile=new PBProfilePage2(driver1);
		profile.switchToChildBrowser();
		profile.verifyPBProfilePage2FullName(sh1.getRow(0).getCell(2).getStringCellValue());
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void logOutFromPB() throws InterruptedException
	{
		PBLogOutPage2 logout=new PBLogOutPage2(driver1);
		logout.clickPBLogOutPage2LogOutBtn();
		Thread.sleep(2000);
	}
	@AfterClass
	public void closeBrowser()
	{
		driver1.quit();
	}
	
	
}
