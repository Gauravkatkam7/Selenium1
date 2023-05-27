package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getDataByVerifyingTypeOfCell1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("F:\\software testing\\automation\\selenium\\excelsheet\\111.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
		Cell info = sh.getRow(0).getCell(2);
		CellType s1=info.getCellType();
			
			if(s1==CellType.STRING)
			{
				String value=info.getStringCellValue();
				System.out.println(value);
			}
			else if(s1==CellType.NUMERIC)
			{
				double value = info.getNumericCellValue();
				System.out.println(value);
		
			}
			else if(s1==CellType.BOOLEAN)
			{
				boolean value = info.getBooleanCellValue();
				System.out.println(value);
			}
	
	
	
	
	}
}
