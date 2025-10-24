package fileUtility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtil {
	public String getDataFromExcel(String sheetName,int rowNum, int colNum) throws EncryptedDocumentException, IOException {
		File file = new File("C:\\Users\\User\\eclipse-workspace\\REST_Assured_Project\\testData\\projects.xlsx");
		Workbook wb = WorkbookFactory.create(file);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		String data = row.getCell(colNum).toString();
		return data;
	}
	public int getTheLastRowIndex(String sheetName) throws EncryptedDocumentException, IOException {
		File file = new File("C:\\Users\\User\\eclipse-workspace\\REST_Assured_Project\\testData\\projects.xlsx");
		Workbook wb = WorkbookFactory.create(file);
		Sheet sh = wb.getSheet(sheetName);
		return sh.getLastRowNum();
	}
}
