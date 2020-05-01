package orangehrmlive;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class StoreDataProvider {
	@DataProvider(name="dpTest")
	  public Object[][] Credentials() {
	    return new Object[][] {
	      new Object[] { "pqrs", "aaaa" },
	      new Object[] { "Admin", "admin123" },
	    };
	  }
}
