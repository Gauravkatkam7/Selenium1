package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getAllDataInSheet3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("F:\\software testing\\automation\\selenium\\excelsheet\\samplenumeric.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
		int rowindex=sh.getLastRowNum();
		int colindex = sh.getRow(1).getLastCellNum()-1;
		
		for(int i=0;i<=rowindex;i++)
		{
			for(int j=0;j<=colindex;j++)
			{
				double value = sh.getRow(i).getCell(j).getNumericCellValue();
				System.out.print(value+" ");
			}
			System.out.println();
		}
	
	
	}
}
