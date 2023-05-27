package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getAllDataInARow3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("F:\\software testing\\automation\\selenium\\excelsheet\\samplestring.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		 int cellindex = sh.getRow(2).getLastCellNum()-1;
		 for(int i=0;i<=cellindex;i++)
		 {
			 String value=sh.getRow(2).getCell(i).getStringCellValue();
			 System.out.print(value+" ");
		 }
		 
	}
}