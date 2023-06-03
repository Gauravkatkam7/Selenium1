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

public class withddf3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream file=new FileInputStream("F:\\software testing\\automation\\selenium\\excelsheet\\samplestring.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		
		driver.findElement(By.xpath("(//input[@type=\"number\"])[2]")).sendKeys(sh.getRow(0).getCell(0).getStringCellValue());
		
		driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
		
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(sh.getRow(0).getCell(1).getStringCellValue());
		
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		
		Thread.sleep(2000);
		WebElement myAcc = driver.findElement(By.xpath("//div[text()='My Account']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(myAcc).perform();
		
		driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
		
		Set<String> allids = driver.getWindowHandles();
		ArrayList<String>ar=new ArrayList<String>(allids);
		driver.switchTo().window(ar.get(1));
		
		String acttext = driver.findElement(By.xpath("//input[@class=\"MuiInputBase-input MuiOutlinedInput-input\"]")).getAttribute("value");
		
		String exptext=sh.getRow(0).getCell(2).getStringCellValue();
		
		if(exptext.equals(acttext))
		{
			System.out.println("TC pass");
		}
		else
		{
			System.out.println("TC fail");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
