package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mixture3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		FileInputStream file=new FileInputStream("F:\\software testing\\automation\\selenium\\excelsheet\\samplestring.xlsx");
		
		 Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
	
		 String w1 = sheet.getRow(0).getCell(1).getStringCellValue();
		 String w2 = sheet.getRow(0).getCell(2).getStringCellValue();
		//System.out.println(w1.concat(w2));
	
		
	
		
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys(w1.concat(" "+w2));
	
	}
}
