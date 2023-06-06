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

public class PBTestClass5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		FileInputStream file=new FileInputStream("F:\\software testing\\automation\\selenium\\excelsheet\\samplestring.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		PBLoginPage5 login=new PBLoginPage5(driver);
		login.clickPBLoginPage5SignInBtn();
		Thread.sleep(2000);
		
		PBMobNumPage5 mobnum=new PBMobNumPage5(driver);
		String mobilenumber = sh.getRow(0).getCell(0).getStringCellValue();
		mobnum.inpPBMobNumPage5MobNum(mobilenumber);
		mobnum.clickSignInWithPwdBtn();
		Thread.sleep(2000);
		
		PBPwdPage5 pwd=new PBPwdPage5(driver);
		String password = sh.getRow(0).getCell(1).getStringCellValue();
		pwd.inpPBPwdPage5Pwd(password);
		pwd.clickPBPwdPage5SignInBtn();
		Thread.sleep(2000);
		
		PBHomePage5 home=new PBHomePage5(driver);
		home.openDDOptionsPBHomePage5MyAcc();
		Thread.sleep(2000);
		
		PBMyAccPage5 myacc=new PBMyAccPage5(driver);
		myacc.clickPBMyAccPage5MyProfile();
		Thread.sleep(2000);
		
		PBProfilePage5 profile=new PBProfilePage5(driver);
		profile.switchToChildBrowser();
		String expectedname = sh.getRow(0).getCell(2).getStringCellValue();
		profile.verifyPBProfilePage5FullName(expectedname);
		Thread.sleep(2000);
		
		driver.quit();
		
	}
}
