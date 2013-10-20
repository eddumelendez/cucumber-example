package la.doosoft.cucumber.calculatorTable;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalculatorTableSteps {

	private Integer result;

	@Given("^I have two numbers$")
	public void I_have_two_numbers() {
		
	}

	@When("^I have two numbers (\\d+) (\\d+)")
	public void testCalculatorGiven(Integer number1, Integer number2) {
		result = number1 + number2;
	}

	@Then("^I receive (\\d+)")
	public void testCalculatorThen(Integer result) {
		Assert.assertEquals(this.result, result);
	}

}
