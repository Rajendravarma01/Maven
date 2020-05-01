package orangehrmlive;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteExcel {
  @Test
  public void ExcelWrite () throws Exception 
  {
	  String file = "E:\\Driver\\Excels_java\\ExcelWrite.xlsx";
	  File f1 = new File(file);
	  FileInputStream readExcelData = new FileInputStream(f1);
	  Workbook book1 = new XSSFWorkbook(readExcelData);
	  Sheet sh = book1.getSheetAt(0);
	  System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
	  FileOutputStream f = new FileOutputStream(f1);
	  sh.getRow(0).getCell(0).setCellValue("Rajendra");
	  sh.createRow(1).createCell(0).setCellValue("Admin");
	  sh.getRow(1).createCell(1).setCellValue("Admin123");
	  sh.getRow(1).createCell(2).setCellValue("Login");
	  book1.write(f);
	  System.out.println("After Update");
	  System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
	  System.out.println(sh.getRow(1).getCell(1).getStringCellValue());
	  System.out.println(sh.getRow(1).getCell(0).getStringCellValue());
	  f.close();
	  
	  
	  
	  
	  
  }
}
