package storeOrangeHRMTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HookTest {
	
	@When("action1")
	public void action1() {
	    System.out.println("Action1");
	}

	@Then("result1")
	public void result1() {
		 System.out.println("Result1");
	}

	@When("action2")
	public void action2() {
		System.out.println("Action2");
	}

	@Then("result2")
	public void result2() {
		System.out.println("Result2");
	}

}
