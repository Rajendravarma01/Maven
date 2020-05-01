package orangehrmlive;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.testng.annotations.Test;
public class WriteIntoExcel {
 @Test
public void WriteIntoExcelFile() throws Exception
{
	
	FileInputStream readExcelFileData = new FileInputStream("E:\\Driver\\Excels_java\\orangehrm1.xlsx");
	  XSSFWorkbook book1 = new XSSFWorkbook(readExcelFileData);
	  
	  Sheet sh = book1.getSheetAt(0);
	  sh.createRow(5).createCell(2).setCellValue("Testing");
	  FileOutputStream f = new FileOutputStream("E:\\\\Driver\\\\Excels_java\\\\orangehrm2.xlsx");
	  Workbook w = new XSSFWorkBook(f1);
	  book1.write(f);
	  System.out.println("Data Inserted");
	  
	  
	  
  }
}

