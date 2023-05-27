package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getRowSizeInASheet3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("F:\\software testing\\automation\\selenium\\excelsheet\\samplenumeric.xlsx");
		int rowsize = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
		System.out.println(rowsize);
	}
}
