package TestProject;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExcelMvn {
	static ChromeDriver chrome;
	  @Test
	  public void LoginTest() throws Exception 
	  {
		  FileInputStream readExcelFileData = new FileInputStream("E:\\Driver\\Excels_java\\orangehrm1.xlsx");
		  XSSFWorkbook book1 = new XSSFWorkbook(readExcelFileData);
		  
		  Sheet sh = book1.getSheetAt(0);
		  
		  System.setProperty("webdriver.chrome.driver","E:\\Driver\\chromedriver.exe");
		    chrome = new ChromeDriver();
			chrome.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
			chrome.manage().window().maximize(); //maximize chrome
			chrome.get("https://opensource-demo.orangehrmlive.com/"); //Enter URL
		  
		  for(int row=0;row<3;row++)
		  {
			  Row r = sh.getRow(row);

			  for(int cell=0;cell<1;cell++)
			  {
				  String uname = r.getCell(cell).getStringCellValue();
				  String pass = r.getCell(cell+1).getStringCellValue();
					chrome.findElement(By.name("txtUsername")).sendKeys(uname);
					chrome.findElement(By.name("txtPassword")).sendKeys(pass);
					chrome.findElement(By.name("Submit")).click();
					sh.getRow(row).createCell(cell).setCellValue("Login Success");
					
					try
					{   
						String DashPageA = "Marketplace";  //actual input
						String DashPageE = chrome.findElement(By.id("MP_link")).getAttribute("value");
						//System.out.println(DashPageE);
						//sh.getRow(row).createCell(cell).setCellValue("Login Success");
						Assert.assertEquals(DashPageA, DashPageE);
						System.out.println("Dashboard page loaded");
					    chrome.findElement(By.id("welcome")).click();
					    Thread.sleep(2000);
					    chrome.findElement(By.linkText("Logout")).click();
					}
					catch(Exception e)
					{   sh.getRow(row).createCell(cell).setCellValue("Login not Success");
						String PageErrorA = "Invalid credentials";
						String PageErrorE = chrome.findElement(By.id("spanMessage")).getText();
						//System.out.println(PageErrorE);
						Assert.assertEquals(PageErrorA, PageErrorE);
						e.printStackTrace();
						System.out.println("Invalid credentials");
						sh.getRow(row).createCell(cell).setCellValue("Login not Success");
					}
				  
			  }
		  }
		  
		  chrome.close();
	  }
}
