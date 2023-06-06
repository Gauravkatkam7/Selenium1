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

public class PBTestClass2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		FileInputStream file=new FileInputStream("F:\\software testing\\automation\\selenium\\excelsheet\\samplestring.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		PBLoginPage2 login=new PBLoginPage2(driver);
		login.clickPBLoginPage2SignInBtn();
		Thread.sleep(2000);
		
		PBMobNumPage2 mobnum=new PBMobNumPage2(driver);
		String mobilenumber = sh.getRow(0).getCell(0).getStringCellValue();
		mobnum.inpPBMobNumPage2MobNum(mobilenumber);
		mobnum.clickPBMobNumPage2SignInWithPwdBtn();
		Thread.sleep(2000);
		
		PBPwdPage2 pwd=new PBPwdPage2(driver);
		String password = sh.getRow(0).getCell(1).getStringCellValue();
		pwd.inpPBPwdPage2pwd(password);
		pwd.clickPBPwdPage2SignInBtn();
		Thread.sleep(2000);
		
		PBHomePage2 home=new PBHomePage2(driver);
		home.openDDOptionsPBHomePage2MyAcc();
		Thread.sleep(2000);
		
		PBMyAccPage2 myacc=new PBMyAccPage2(driver);
		myacc.clickPBMyAccPage2myProfile();
		Thread.sleep(2000);
		
		PBProfilePage2 profile=new PBProfilePage2(driver);
		profile.switchToChildBrowser();
		String expectedName = sh.getRow(0).getCell(2).getStringCellValue();
		profile.verifyPBProfilePage2FullName(expectedName);
		Thread.sleep(2000);
		
		driver.quit();
	}
}
