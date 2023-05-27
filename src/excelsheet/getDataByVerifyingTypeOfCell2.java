package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getDataByVerifyingTypeOfCell2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("F:\\software testing\\automation\\selenium\\excelsheet\\111.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
		Cell s1=sh.getRow(1).getCell(3);
		CellType type=s1.getCellType();
		
		if(type==CellType.STRING)
		{
			String value=s1.getStringCellValue();
			System.out.println(value);
		}
		else if(type==CellType.NUMERIC)
		{
			double value = s1.getNumericCellValue();
			System.out.println(value);
		}
		else if(type==CellType.BOOLEAN)
		{
			boolean value=s1.getBooleanCellValue();
			System.out.println(value);
		}
		
	}
}
