package POM_DDF_TestNg_BaseClass_UtilityClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass3 {

//	@Authorname:gaurav
//	this method is use to get testData from excel.
//	need to pass 2 inputs:1 rowIndex ,2 collIndex
	public static String getTestData(int rowIndex,int collIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("F:\\software testing\\automation\\selenium\\excelsheet\\samplestring.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = sh.getRow(rowIndex).getCell(collIndex).getStringCellValue();
		
		return value;
	}
}
