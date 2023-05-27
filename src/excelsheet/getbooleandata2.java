package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getbooleandata2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("F:\\software testing\\automation\\selenium\\excelsheet\\sampleboolean.xlsx");
	boolean b1=	WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getCell(2).getBooleanCellValue();
	
	System.out.println(b1);
	
	
	}
}
