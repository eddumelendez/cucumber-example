package la.doosoft.cucumber.calculator;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CalculatorSteps {

	private Integer result;
	
	@Given("^I have two numbers (\\d+) (\\d+) to add")
	public void testCalculatorGiven(Integer number1, Integer number2) {
		result = number1 + number2;
	}
	
	@Then("^I should get result (\\d+)")
	public void testCalculatorThen(Integer result) {
		Assert.assertEquals(this.result, result);
	}
	
}
