package readingDataFromExcelShee;
 
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class readingDataFromExcelSheet {
	
	
	public static void main(String[] args) throws IOException {
		 
		 
		String pathofExcelsheet = "C:\\Users\\039391744\\RestAPIhashmap.xlsx";
		File file  = new File(pathofExcelsheet);
	    FileInputStream fis = new FileInputStream(file); 
	     
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
	    XSSFSheet sheet1 = wb.getSheet("Sheet1");
	    XSSFRow row1 =sheet1.getRow(1);
	    System.out.println(row1.getCell(1).getStringCellValue());
	}
	
	}

