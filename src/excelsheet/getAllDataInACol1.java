package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getAllDataInACol1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("F:\\software testing\\automation\\selenium\\excelsheet\\samplestring.xlsx");
		Sheet sheet = WorkbookFactory.create(file).getSheet("sheet1");
		int rowindex = sheet.getLastRowNum();
		
		for(int i=0;i<=rowindex;i++)
		{
			String value=sheet.getRow(i).getCell(2).getStringCellValue();
			System.out.println(value);
		}
	}
}
