package la.doosoft.cucumber.calculatorTable;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.junit.Cucumber.Options;

@RunWith(Cucumber.class)
@Options(tags = {"@calculatorTable"}, format = "html:target/calculator.html", features = "classpath:features")
public class RunCalculatorTableTest {
	
}
