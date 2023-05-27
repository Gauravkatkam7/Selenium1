package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getCellType5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("F:\\\\software testing\\\\automation\\\\selenium\\\\excelsheet\\\\111.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
		CellType type=sh.getRow(1).getCell(3).getCellType();
		System.out.println(type);
	
	
	}
}
