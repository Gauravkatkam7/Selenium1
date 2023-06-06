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

public class PBTestClass3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		FileInputStream file=new FileInputStream("F:\\software testing\\automation\\selenium\\excelsheet\\samplestring.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		PBLoginPage3 login=new PBLoginPage3(driver);
		login.clickPBLoginPage3SignInBtn();
		Thread.sleep(2000);
		
		PBMobNumPage3 mobnum=new PBMobNumPage3(driver);
		String mobilenumber = sh.getRow(0).getCell(0).getStringCellValue();
		mobnum.inpPBMobNumPage3MobNum(mobilenumber);
		mobnum.clickPBMobNumPage3SignInWithPwdBtn();
		Thread.sleep(2000);
		
		PBPwdPage3 pwd=new PBPwdPage3(driver);
		String password = sh.getRow(0).getCell(1).getStringCellValue();
		pwd.inpPBPwdPage3Pwd(password);
		pwd.clickPBPwdPage3SignInBtn();
		Thread.sleep(2000);
		
		PBHomePage2 home=new PBHomePage2(driver);
		home.openDDOptionsPBHomePage2MyAcc();
		Thread.sleep(2000);
		
		PBMyAccPage3 myacc=new PBMyAccPage3(driver);
		myacc.clickPBMyAccPage3MyProfile();
		Thread.sleep(2000);
		
		PBProfilePage3 profile=new PBProfilePage3(driver);
		profile.switchToChildBrowser();
		String expname = sh.getRow(0).getCell(2).getStringCellValue();
		profile.verifyPBProfilePage3FullNmae(expname);
		Thread.sleep(2000);
		
		driver.quit();
	}
}
