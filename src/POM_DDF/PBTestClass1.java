package POM_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBTestClass1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		FileInputStream file=new FileInputStream("F:\\software testing\\automation\\selenium\\excelsheet\\samplestring.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		PBLoginPage1 login=new PBLoginPage1(driver);
		login.clickPBLoginPage1signIN();
		Thread.sleep(2000);
		
		PBMobNumPage1 mobnum=new PBMobNumPage1(driver);
		String mobilenumber = sh.getRow(0).getCell(0).getStringCellValue();
		mobnum.inpPBMobNumPage1mobNum(mobilenumber);
		mobnum.clickPBMobNumPage1signInWithPwdBtn();
		Thread.sleep(2000);
		
		PBPwdPage1 pwd=new PBPwdPage1(driver);
		String password = sh.getRow(0).getCell(1).getStringCellValue();
		pwd.inpPBPwdPage1pwd(password);
		pwd.clickPBPwdPage1SignInBtn();
		Thread.sleep(2000);
		
		PBHomePage1 home=new PBHomePage1(driver);
		home.openDDOptionsPBHomePage1myAcc();
		Thread.sleep(2000);
		
		PBMyAccPage1 myacc=new PBMyAccPage1(driver);
		myacc.clickPBMyAccPage1myProfile();
		Thread.sleep(2000);
		
		PBProfilePage1 profile=new PBProfilePage1(driver);
		profile.switchToChildBrowser();
		String expectedtext = sh.getRow(0).getCell(2).getStringCellValue();
		profile.verifyPBProfilePage1FullName(expectedtext);
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
	}
}
