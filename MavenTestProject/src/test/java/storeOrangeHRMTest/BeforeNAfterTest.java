package storeOrangeHRMTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BeforeNAfterTest {
	
	@Before
	public void beforeScenario()
	{
		System.out.println("Before Scenario");
	}
 
	@After
	public void AfterScenario()
	{
		System.out.println("after Scenario");
	}
}
