package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelsheet2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("F:\\software testing\\automation\\selenium\\excelsheet\\111.xlsx");
	
//		Cell sh=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0);
//		
//		CellType type=sh.getCellType();
//	
//		if(type==CellType.STRING)
//		{
//			String value=sh.getStringCellValue();
//			System.out.println(value);
//		}
//		if(type==CellType.NUMERIC)
//		{
//			double value=sh.getNumericCellValue();
//		
//			System.out.println(value);
//		}
//		if(type==CellType.BOOLEAN)
//		{
//			boolean value=sh.getBooleanCellValue();
//			System.out.println(value);
//		}
		
//		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
//		int rowindex=sh.getLastRowNum();
//		for(int i=0;i<=rowindex;i++)
//		{
//			Cell cellinfo=sh.getRow(i).getCell(0);
//			CellType type=cellinfo.getCellType();
//			if(type==CellType.STRING)
//			{
//				String value = cellinfo.getStringCellValue();
//				System.out.println(value);
//			}
//			if(type==CellType.NUMERIC)
//			{
//				double value=cellinfo.getNumericCellValue();
//				System.out.println(value);
//			}
//			if(type==CellType.BOOLEAN)
//			{
//				boolean value=cellinfo.getBooleanCellValue();
//				System.out.println(value);
//			}
		
//		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
//		int cellindex = sh.getRow(0).getLastCellNum()-1;
//		for(int i=0;i<=cellindex;i++)
//		{
//			Cell cellinfo=sh.getRow(0).getCell(i);
//			CellType type=cellinfo.getCellType();
//			if(type==CellType.STRING)
//			{
//				String value=cellinfo.getStringCellValue();
//				System.out.print(value+" ");
//			}
//			if(type==CellType.NUMERIC)
//			{
//				double value=cellinfo.getNumericCellValue();
//				System.out.print(value+" ");
//			}
//			if(type==CellType.BOOLEAN)
//			{
//				boolean value=cellinfo.getBooleanCellValue();
//				System.out.print(value+" ");
//			}
//			
//		}
		
		
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
		int rowindex=sh.getLastRowNum();
		for(int i=0;i<=rowindex;i++)
		{
			int cellindex=sh.getRow(i).getLastCellNum()-1;
			for(int j=0;j<=cellindex;j++)
			{
				Cell cellinfo=sh.getRow(i).getCell(j);
				CellType type=cellinfo.getCellType();
				if(type==CellType.STRING)
				{
					String value=cellinfo.getStringCellValue();
					System.out.print(value+" ");
				}
				if(type==CellType.NUMERIC)
					{
						double value=cellinfo.getNumericCellValue();
						System.out.print(value+" ");
					}
				if(type==CellType.BOOLEAN)
					{
						boolean value=cellinfo.getBooleanCellValue();
						System.out.print(value+" ");
					}
			}
			System.out.println();
		}
		
		
		
		
		
	
	}
}
