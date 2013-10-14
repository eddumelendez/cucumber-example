package la.doosoft.cucumber.google;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSteps {

	@Autowired
	private WebDriver browser;
	
	@Given("^I visit google search page '(.+)'$")
	public void testGoogleGiven(String url) throws MalformedURLException {
		browser.navigate().to(new URL(url));
	}
	
	@When("^I type '(.+)' as a search string$")
	public void testGoogleWhen(String searchString) {
		WebElement element = browser.findElement(By.name("q"));
		element.sendKeys(searchString);
	}
	
	@Then("^I should get search results like '(.+)'")
	public void testGoogleThen(String searchString) {
		WebElement element = new WebDriverWait(browser, 20).pollingEvery(1, TimeUnit.SECONDS).until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
		
		String textContent = browser.getPageSource();
		boolean textValuePresent = textContent.contains(searchString);
		Assert.assertTrue("Found matching string", textValuePresent);
	}
	
	@After
	public void end() {
		browser.close();
		browser.quit();
	}
	
}
