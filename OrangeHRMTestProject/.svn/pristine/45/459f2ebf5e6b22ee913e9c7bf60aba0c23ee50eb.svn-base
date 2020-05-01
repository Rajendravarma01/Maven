package orangehrmlive;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationsDemo {
	@BeforeGroups("demo")
	  public void bGroup1()
	  {
		  System.out.println("BeoforeGroupd---demo");
	  }
	  
	  @AfterGroups("demo")
	  public void AGroup1()
	  {
		  System.out.println("AfterGroup---demo");
	  }
  @Test(groups= {"test"})
  public void test1() 
  {
	  System.out.println("AnnotationDemo.Test1");
  }
  @Test(groups= {"test"})
  public void test2() 
  {
	  System.out.println("AnnotationDemo.Test2");
  }
  @Test(groups= {"demo"})
  public void test3() 
  {
	  System.out.println("AnnotationDemo.Test3");
  }
  @Test(groups= {"demo"})
  public void test4() 
  {
	  System.out.println("AnnotationDemo.Test4");
  }
  @BeforeGroups("test")
  public void bGroup()
  {
	  System.out.println("BeoforeGroup---test");
  }
  
  @AfterGroups("test")
  public void AGroup()
  {
	  System.out.println("AfterGroup---tests");
  }
 
}
