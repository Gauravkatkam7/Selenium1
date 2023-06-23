package TestNG_Practice1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PBTestClass3_TestNG {
	WebDriver driver1;
	Sheet sh1;
	@Test(priority=-4)
	public void TC1OpenBrowser() throws InterruptedException, EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("F:\\software testing\\automation\\selenium\\excelsheet\\samplestring.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		Thread.sleep(2000);
		
		driver1=driver;
		sh1=sh;
	}
	@Test(dependsOnMethods="TC1OpenBrowser",priority=-3)
	public void TC2openHelathInsurance() throws InterruptedException
	{
		PBHomePage3 home=new PBHomePage3(driver1);
		home.clickPBHomePage3HealthCareLink();
		Thread.sleep(4000);
	}
		
	@Test(dependsOnMethods="TC2openHelathInsurance")
	public void TC3selectGender() throws InterruptedException
	{
		PBGenderPage1 gender=new PBGenderPage1(driver1);
		gender.scrollToPBGenderPage1ContinueBtn();
		Thread.sleep(2000);
		gender.clickPBGenderPage1ContinueBtn();
		Thread.sleep(2000);
	}
	@Test(dependsOnMethods="TC3selectGender")
	public void TC4selectAge() throws InterruptedException
	{	
		PBAgePage1 age=new PBAgePage1(driver1);
		age.selectPBAgePage1Age();
		age.clickPBAgePage1continue1Btn();
		Thread.sleep(2000);
	}
	@Test(dependsOnMethods="TC4selectAge")
	public void TC5selectCity() throws InterruptedException
	{
		PBCityPage1 city=new PBCityPage1(driver1);
		city.clickPBCityPage1City();
		Thread.sleep(2000);
	}
	
	@Test(dependsOnMethods="TC5selectCity",timeOut=10000)
	public void TC6enterNameandMobNum() throws InterruptedException
	{
		PBSaveProgressPage1 save=new PBSaveProgressPage1(driver1);
		save.inpPBSaveProgressPage1FullName(sh1.getRow(0).getCell(2).getStringCellValue());
		save.inpPBSaveProgressPage1MobNum(sh1.getRow(0).getCell(0).getStringCellValue());
		save.clickPBSaveProgressPage1ContinueBtn();
		Thread.sleep(2000);
	}
	@Test(dependsOnMethods="TC6enterNameandMobNum")
	public void TC7clickCheckBox() throws InterruptedException 
	{
		PBMedicalHistoryPage1 medical=new PBMedicalHistoryPage1(driver1);
		medical.clickCheckBoxPBMedicalHistoryPage1NoneOfThese();
		Thread.sleep(2000);
		driver1.quit();
	}
	


}