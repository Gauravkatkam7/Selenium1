package POM_DDF_TestNG_BaseClass_UtilityClass_CaptureSSOfFailedTCes_PropertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass2 {

	public static String getTestData(int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("F:\\software testing\\automation\\selenium\\excelsheet\\samplestring.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
	
		return value;
	
	}
	
	public static void captureSS(WebDriver driver,int TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("F:\\software testing\\automation\\selenium\\screenshots\\TestCaseID"+TCID+".jpg");
	    
		FileHandler.copy(src, dest);
	}
	
	public static String getPFData(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Gaurav\\eclipse-workspace\\Selenium1\\PropertyFile.properties");
		
		Properties p=new Properties();
		p.load(file);
		String value = p.getProperty(key);
		
		return value;
	}
	
}
