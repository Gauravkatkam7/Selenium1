package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getAllDataInACol3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("F:\\software testing\\automation\\selenium\\excelsheet\\numericasstring.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
	int rowindex = sh.getLastRowNum();
	for(int i=0;i<=rowindex;i++)
	{
		String value = sh.getRow(i).getCell(1).getStringCellValue();
		System.out.println(value);
	}
	}
}
