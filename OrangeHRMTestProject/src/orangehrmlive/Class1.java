package orangehrmlive;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {
	
	@BeforeTest
	public void bTest()
	{
		System.out.println("this is Beofore Test");
	}
	@BeforeClass
	public void BClass()
	{
		System.out.println("This is Before 1st class");
	}
	
	@AfterClass
	public void AClass()
	{
		System.out.println("This is After 1st class");
	}
  @Test
  public void test1() 
  {
	  System.out.println("This is 1st class");
  }
}
