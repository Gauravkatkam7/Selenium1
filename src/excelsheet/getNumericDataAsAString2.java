package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getNumericDataAsAString2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("F:\\software testing\\automation\\selenium\\excelsheet\\numericasstring.xlsx");
		String value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue();
		System.out.println(value);
	}
}
