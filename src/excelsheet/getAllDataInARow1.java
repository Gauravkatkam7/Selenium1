package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getAllDataInARow1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("F:\\software testing\\automation\\selenium\\excelsheet\\samplestring.xlsx");
		 Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		 int colindex = sheet.getRow(1).getLastCellNum()-1;
		 for(int i=0;i<=colindex;i++)
		 {
			 String value = sheet.getRow(1).getCell(i).getStringCellValue();
			 System.out.print(value+" ");
		 }
	}
}
