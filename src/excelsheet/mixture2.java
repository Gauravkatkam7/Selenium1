package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class mixture2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("F:\\software testing\\automation\\selenium\\excelsheet\\111.xlsx");
	Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
	int rowindex=sh.getLastRowNum();
    int cellindex=sh.getRow(0).getLastCellNum()-1;
	for(int i=0;i<=rowindex;i++)
	{
		for(int j=0;j<=cellindex;j++)
		{
			Cell data=sh.getRow(i).getCell(j);
			CellType type=data.getCellType();
			
			if(type==CellType.STRING)
			{
				String value=data.getStringCellValue();
				System.out.print(value+" ");
			}
			if(type==CellType.NUMERIC)
			{
				double value = data.getNumericCellValue();
				System.out.print(value+" ");
			}
			if(type==CellType.BOOLEAN)
			{
				boolean value=data.getBooleanCellValue();
				System.out.print(value+" ");
	
			}
		
		}
		System.out.println();
	}
	
	
	
	}
}
