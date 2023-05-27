package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelsheet1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("F:\\software testing\\automation\\selenium\\excelsheet\\samplenumeric.xlsx");
//		String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
//		System.out.println(data);
		
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
		
//		int rowindex = sh.getLastRowNum();
//		for(int i=0;i<=rowindex;i++)
//		{
//			String rowdata=sh.getRow(i).getCell(0).getStringCellValue();
//			System.out.println(rowdata);
//		}
		
//		int cellindex = sh.getRow(0).getLastCellNum()-1;
//		for(int i=0;i<=cellindex;i++)
//		{
//			String coldata = sh.getRow(0).getCell(i).getStringCellValue();
//			System.out.print(coldata+" ");
//		}
		
		int rowindex = sh.getLastRowNum();
		for(int i=0;i<=rowindex;i++)
		{
			int cellindex=sh.getRow(i).getLastCellNum()-1;
		
			for(int j=0;j<=cellindex;j++)
			{
				double all=sh.getRow(i).getCell(j).getNumericCellValue();
				System.out.print(all+" ");
			}
			System.out.println();
		
		
		}
	}
}
