package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getAlltypeDataInARow5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("F:\\software testing\\automation\\selenium\\excelsheet\\111.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
		int cellindex=sh.getRow(0).getLastCellNum()-1;
		
		for(int i=0;i<=cellindex;i++)
		{
			Cell info=sh.getRow(0).getCell(i);
			CellType type=info.getCellType();
			
			if(type==CellType.STRING)
			{
				String value=info.getStringCellValue();
				System.out.print(value+" ");
			}
			else if(type==CellType.NUMERIC)
			{
				double value=info.getNumericCellValue();
				System.out.print(value+" ");
			}
			else if(type==CellType.BOOLEAN)
			{
				boolean value=info.getBooleanCellValue();
				System.out.print(value+" ");
			}
		
		
		}
	
	
	
	
	
	
	
	
	}
}
