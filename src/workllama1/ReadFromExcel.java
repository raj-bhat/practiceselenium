package workllama1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExcel {

	
	public static String ReadExcelValue(String FILE_NAME,String sheet,int row, int col) throws EncryptedDocumentException, IOException, InvalidFormatException{
		
		FileInputStream fis=new FileInputStream(FILE_NAME);
		  Workbook wb=WorkbookFactory.create(fis);
		Sheet s= wb.getSheet(sheet);
		Row r=s.getRow(row);
		Cell c=r.getCell(col);
	String CellValue=c.toString();
		
		return CellValue;
	}
	
	
	
}
