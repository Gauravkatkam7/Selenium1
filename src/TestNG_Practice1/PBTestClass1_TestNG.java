package TestNG_Practice1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PBTestClass1_TestNG {

	@Test
	public void test() throws InterruptedException, EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("F:\\software testing\\automation\\selenium\\excelsheet\\samplestring.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		PBLoginPage1 login=new PBLoginPage1(driver);
		login.clickPBLoginPage1SignInBtn();
		Thread.sleep(2000);
		
		PBMobNumPage1 mobnum=new PBMobNumPage1(driver);
		String mobilenumber = sh.getRow(0).getCell(0).getStringCellValue();
		mobnum.inpPBMobNumPage1MobNum(mobilenumber);
		mobnum.clickPBMobNumPage1SignInWithPwdBtn();
		Thread.sleep(2000);
		
		PBPwdPage1 pwd=new PBPwdPage1(driver);
		String password = sh.getRow(0).getCell(1).getStringCellValue();
		pwd.inpPBPwdPage1pwd(password);
		pwd.clickPBPwdPage1SignInBtn();
		Thread.sleep(2000);
		
		PBHomePage1 home=new PBHomePage1(driver);
		home.openDDOptionsPBHomePage1MyAcc();
		Thread.sleep(2000);
		
		PBMyAccPage1 myacc=new PBMyAccPage1(driver);
		myacc.clickPBMyAccPage1MyprofileBtn();
		Thread.sleep(2000);
		
		PBProfilePage1 profile=new PBProfilePage1(driver);
		profile.switchToChildBrowser();
		String expectedname = sh.getRow(0).getCell(2).getStringCellValue();
		profile.verifyPBProfilePage1FullName(expectedname);
		Thread.sleep(2000);
		
		driver.quit();
	}
}
