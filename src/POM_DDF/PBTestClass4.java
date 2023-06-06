package POM_DDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBTestClass4 {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("F:\\software testing\\automation\\selenium\\excelsheet\\samplestring.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		PBLoginPage4 login=new PBLoginPage4(driver);
		login.clickPBLoginPage4SignInBtn();
		Thread.sleep(2000);
		
		PBMobNumPage4 mobnum=new PBMobNumPage4(driver);
		String mobilenumber = sh.getRow(0).getCell(0).getStringCellValue();
		mobnum.inpPBMobNumPage4mobNum(mobilenumber);
		mobnum.clickPBMobNumPage4SignInWithPwdBtn();
		Thread.sleep(2000);
		
		PBPwdPage4 pwd=new PBPwdPage4(driver);
		String password = sh.getRow(0).getCell(1).getStringCellValue();
		pwd.inpPBPwdPage4Pwd(password);
		pwd.clickPBPwdPage4signInBtn();
		Thread.sleep(2000);
		
		PBHomePage4 home=new PBHomePage4(driver);
		home.openDDOptionsPBHomePage4MyAcc();
		Thread.sleep(2000);
		
		PBMyAccPage4 myacc=new PBMyAccPage4(driver);
		myacc.clickPBMyAccPage4MyProfileBtn();
		Thread.sleep(2000);
		
		PBProfilePage4 profile=new PBProfilePage4(driver);
		profile.switchToChildwindow();
		String expectedname = sh.getRow(0).getCell(2).getStringCellValue();
		profile.verifyPBProfilePage4FullName(expectedname);
		Thread.sleep(2000);
		
		driver.quit();
	}
}
