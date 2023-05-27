package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getstringdata4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("F:\\software testing\\automation\\selenium\\excelsheet\\sample.xlsx");
	String s1=	WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(3).getStringCellValue();
	System.out.println(s1);
	
	
	}
}
