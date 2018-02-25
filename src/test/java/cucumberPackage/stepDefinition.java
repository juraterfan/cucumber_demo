package cucumberPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runnerPackage.TestRunner;

public class stepDefinition extends TestRunner {
	
	@Given("^this is a given step$")
	public void this_is_a_given_step()  {
	    System.out.println("Running given step");
	    
	}

	@When("^this is a when step$")
	public void this_is_a_when_step()  {
		 System.out.println("Running when step");
	    
	}

	@When("^this is a and step$")
	public void this_is_a_and_step()  {
		 System.out.println("Running when step");
	   
	}

	@Then("^this is a then step$")
	public void this_is_a_then_step()  {
		 System.out.println("Running Then step");
	    
	}
	@Given("^I navigate to google$")
	public void i_navigate_to_google()  {
	    
	    driver.get("http://google.com");
	}

	@Then("^I search for porsche$")
	public void i_search_for_porsche()  {
		WebElement search_box = driver.findElement(By.name("q"));
		search_box.sendKeys("porsche" + Keys.ENTER);
		
	}

	@Then("^I should see the title to have prosche$")
	public void i_should_see_the_title_to_have_prosche() {
		Assert.assertTrue(driver.getTitle().contains("porsche"));
	}
	}

