package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getAllDataInARow6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("F:\\software testing\\automation\\selenium\\excelsheet\\samplenumeric.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
		int rowsize = sh.getRow(5).getLastCellNum()-1;
		for(int i=0;i<=rowsize;i++)
		{
			double value = sh.getRow(5).getCell(i).getNumericCellValue();
			System.out.print(value+" ");
		}
	}
}
