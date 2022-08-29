package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility_class {
public static String getTD(int rowindex,int colindex) throws Throwable, IOException {
	
	FileInputStream fis=new FileInputStream("C:\\Users\\ADMIN\\Desktop\\Zerodha.xlsx");
	Sheet sh = WorkbookFactory.create(fis).getSheet("A1");
	String data=sh.getRow(rowindex).getCell(colindex).getStringCellValue();
	return data;
	
	
}
}
