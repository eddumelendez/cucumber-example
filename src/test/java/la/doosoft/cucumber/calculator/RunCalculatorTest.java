package la.doosoft.cucumber.calculator;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.junit.Cucumber.Options;

@RunWith(Cucumber.class)
@Options(tags = {"@calculator"}, format = "html:target/calculator.html", features = "classpath:features")
public class RunCalculatorTest {
	
}
