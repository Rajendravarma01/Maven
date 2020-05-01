package orangehrmlive;

import org.testng.annotations.Test;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataProviWithExcel {
  @Test(dataProvider = "dp")
  public void f(String s1, String s2) {
	  System.out.println(s1+" "+s2);
  }

  @DataProvider
  public Object[][] dp() throws Exception{
	  Object [][] str = getExcelData(); //ReadData[][]
	  return str;
  }
  
  String[][] getExcelData() throws Exception
  {
	//String readData[][] = null;
	FileInputStream readExcelData = new FileInputStream("E:\\Driver\\Excels_java\\orangehrm.xlsx");
	XSSFWorkbook book1 = new XSSFWorkbook(readExcelData);
	Sheet sh = book1.getSheetAt(0);//3 row n 2cols
	int totalRows = sh.getLastRowNum();//row count = 2 row count starts from 0
	int totalcols = sh.getRow(0).getLastCellNum();//2
	System.out.println("Row:"+totalRows+"Coloms:" +" "+totalRows);
	String readData[][] = new String[totalRows+1][totalcols]; //String [2][2]: 2row 2 colms
	
	//System.out.println(totalcols +" "+totalRows);
	//readData = new String[totalRows][totalcols];
	
	for(int r=0;r<=totalRows;r++)
	{
		for(int c=0;c<totalcols;c++)
		{
			readData[r][c] = sh.getRow(r).getCell(c).getStringCellValue();
		}
	}
	return readData;
	
  }
}
