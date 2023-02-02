package Generic_utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	/**
	 * fetching data from excel
	 * @return
	 * @author akhil
	 * @throws Throwable 
	 */
	
	public String getExcelData(String SheetName,int RowNum,int ColNum) throws Throwable
	{
		

		//FileInputStream fi=new FileInputStream("C:\\Users\\akhil\\OneDrive\\Desktop\\product.xlsx");
		
		
		FileInputStream fi=new FileInputStream("C:\\Users\\akhil\\OneDrive\\Desktop\\latest_excel.xlsx");
		Workbook book=WorkbookFactory.create(fi);
		Sheet sh = book.getSheet("ProductNameSheet");
		Row row = sh.getRow(RowNum);
		Cell cell = row.getCell(ColNum);
		String value= cell.getStringCellValue();
		return value;
		
		
		
	}
}
