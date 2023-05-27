package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getAllDataInACol2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("F:\\software testing\\automation\\selenium\\excelsheet\\sampleboolean.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
		int rowsize = sh.getLastRowNum();
		for(int i=0;i<=rowsize;i++)
		{
			boolean value=sh.getRow(i).getCell(1).getBooleanCellValue();
			System.out.println(value);
		
		}
	
	
	
	}
}
