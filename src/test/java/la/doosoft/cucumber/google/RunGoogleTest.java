package la.doosoft.cucumber.google;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.junit.Cucumber.Options;

@RunWith(Cucumber.class)
@Options(tags = {"@google"}, format = "html:target/google.html", features = "classpath:features")
public class RunGoogleTest {
	
}
