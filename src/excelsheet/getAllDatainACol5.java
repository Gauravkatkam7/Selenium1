package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getAllDatainACol5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("F:\\software testing\\automation\\selenium\\excelsheet\\samplenumeric.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		int rowindex = sh.getLastRowNum();
		for(int i=0;i<=rowindex;i++)
		{
			double value = sh.getRow(i).getCell(1).getNumericCellValue();
			System.out.println(value);
		}
	}
}
