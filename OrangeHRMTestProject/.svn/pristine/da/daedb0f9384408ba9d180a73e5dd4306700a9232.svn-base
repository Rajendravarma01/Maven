package orangehrmlive;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;	
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

	public class  HybridFrameworkt {
		static ChromeDriver chrome;
		
		static void openBrowser()
		{
			 System.setProperty("webdriver.chrome.driver","E:\\Driver\\chromedriver.exe");
			    chrome = new ChromeDriver();
				chrome.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
				
		}
		static void enterURL(String url) 
		{
			chrome.manage().window().maximize(); 
			//chrome.get("https://opensource-demo.orangehrmlive.com/");
			chrome.get(url);
		}
		static void enterUsername(String UnId,String uname)
		{
			chrome.findElement(By.name(UnId)).sendKeys(uname);
		}
		static void enterPassword(String pass,String passw)
		{
			chrome.findElement(By.name(pass)).sendKeys(passw);
		}
		static void login(String btn) throws InterruptedException
		{
			chrome.findElement(By.name(btn)).click();
			try
			{   
				String DashPageA = "Marketplace";  //actual input
				String DashPageE = chrome.findElement(By.id("MP_link")).getAttribute("value");
				Assert.assertEquals(DashPageA, DashPageE);
				System.out.println("Dashboard page loaded And Logout Successfull");
			    chrome.findElement(By.id("welcome")).click();
			    Thread.sleep(2000);
			    chrome.findElement(By.linkText("Logout")).click();
			}
			catch(Exception e)
			{
				String PageErrorA = "Invalid credentials";
				String PageErrorE = chrome.findElement(By.id("spanMessage")).getText();
				Assert.assertEquals(PageErrorA, PageErrorE);
				e.printStackTrace();
				System.out.println("Invalid credentials And Login Not successfull");
				
			}
		}

		public static void main(String[] args) throws Exception 
		{
			FileInputStream readKeyword = new FileInputStream("E:\\Driver\\Excels_java\\keywordTest.xlsx");
			XSSFWorkbook book1 = new XSSFWorkbook(readKeyword);
			Sheet sh = book1.getSheetAt(0);
			Sheet sh1 = book1.getSheetAt(1);
			
			
			  for(int row=0;row<=sh1.getLastRowNum();row++)
			  {
			  String uname = sh1.getRow(row).getCell(0).getStringCellValue();
			  String passw = sh1.getRow(row).getCell(1).getStringCellValue();
			//String keyword[][] = new String[6][1];
			//keyword[0][0] : 1st row
			//keyword[1][0] : 2st row
			//keyword[2][0] : 3st row
			
			for(int r=1;r<sh.getLastRowNum()+1;r++)
			{
					String keyword= sh.getRow(r).getCell(0).getStringCellValue();
					String locator= sh.getRow(r).getCell(1).getStringCellValue();
						
					switch(keyword)
					{
					case "openbrowser":
						openBrowser();
						break;
					case "enterurl":
						enterURL(locator);
						break;
					case "enterusername":
						enterUsername(locator,uname);
						break;
					case "enterpwd":
						enterPassword(locator,passw);
						break;
					case "clickLoginbtn":
						login(locator);
						Thread.sleep(2000);
						break;
					
					}
					
				}chrome.quit();
				
		    }
	  }
}

