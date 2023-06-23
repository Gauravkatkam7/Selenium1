package POM_DDF_TestNg_BaseClass_UtilityClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass2 {

//	@authorName: Gaurav
//	this method is use to provide testdata from excel
//	need to pass 2 inputs:1 rowIndex,2colIndex.
	public static String getTestData(int rowIndex,int colIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("F:\\software testing\\automation\\selenium\\excelsheet\\samplestring.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
		
		return value;
	}
}
