package utilitya;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class utility_class {
public static String getID(int rowindex,int colindex) throws Throwable {
	FileInputStream fs=new FileInputStream("C:\\Users\\DELL\\Documents\\ddf.xlsx");
	Sheet sh = WorkbookFactory.create(fs).getSheet("sheet1");
	String ex = sh.getRow(rowindex).getCell(colindex).getStringCellValue();
	return ex;
}
}
