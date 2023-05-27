package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getnumericdata5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("F:\\software testing\\automation\\selenium\\excelsheet\\samplenumeric.xlsx");
	double value=	WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getCell(0).getNumericCellValue();
		System.out.println(value);
	}
}
