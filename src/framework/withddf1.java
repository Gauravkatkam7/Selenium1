package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class withddf1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		FileInputStream file=new FileInputStream("F:\\software testing\\automation\\selenium\\excelsheet\\samplestring.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");
	
		String mobno = sh.getRow(0).getCell(0).getStringCellValue();
		String pass = sh.getRow(0).getCell(1).getStringCellValue();
		String exp = sh.getRow(0).getCell(2).getStringCellValue();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		
		driver.findElement(By.xpath("(//input[@id=\"central-login-module-sign-mobile\"])[2]")).sendKeys(mobno);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
		
		driver.findElement(By.xpath("//input[@id=\"central-login-password\"]")).sendKeys(pass);
		
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		Thread.sleep(2000);
		WebElement myAccount = driver.findElement(By.xpath("//div[text()='My Account']"));
		WebElement myProfile = driver.findElement(By.xpath("//span[text()=' My profile ']"));
		Actions act=new Actions(driver);
		
		act.moveToElement(myAccount).perform();
		act.click(myProfile).perform();
		
		Set<String> allids = driver.getWindowHandles();
		ArrayList<String>ar=new ArrayList<String>(allids);
		driver.switchTo().window(ar.get(1));
		
		String acttext = driver.findElement(By.xpath("//input[@name=\"personName\"]")).getAttribute("value");
		
		String exptext="exp";
		
		if(exp.equals(acttext))
		{
			System.out.println("test case pass");
		}
		else
		{
			System.out.println("test case failed");
		}
		
		
		
	
	
	
	
	}
}
