package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class withddf4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		FileInputStream file=new FileInputStream("F:\\software testing\\automation\\selenium\\excelsheet\\samplestring.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/login");
		
		driver.findElement(By.xpath("//input[@id=\"userName\"]")).sendKeys(sh.getRow(1).getCell(0).getStringCellValue());
		
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(sh.getRow(1).getCell(1).getStringCellValue());
		
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("//button[text()='Login']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",login);
		login.click();
		
		Thread.sleep(2000);
		WebElement bookstore = driver.findElement(By.xpath("//button[text()='Go To Book Store']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",bookstore);
		bookstore.click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Git Pocket Guide']")).click();
		
		Thread.sleep(2000);
		WebElement atc = driver.findElement(By.xpath("//button[text()='Add To Your Collection']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",atc);
		atc.click();
		
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
		al.accept();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Profile']")).click();
		
		Thread.sleep(1000);
		WebElement delete = driver.findElement(By.xpath("//button[text()='Delete All Books']"));
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)");
		delete.click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
		Thread.sleep(1000);
		Alert al1 = driver.switchTo().alert();
		al1.accept();
		
		Thread.sleep(2000);
		WebElement logout = driver.findElement(By.xpath("//button[text()='Log out']"));
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-400)",logout);
		Thread.sleep(4000);
		logout.click();
		
		Thread.sleep(1000);
		driver.quit();
		
	}
}
