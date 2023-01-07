package StepDefinations;

import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinations {
	
	
	
	@Given("^Validate the browser$")
    public void validate_the_browser() throws Throwable {
System.out.println("browser starting");    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
    	System.out.println("browser triggered"); 
    }

    @Then("^check if browser is started$")
    public void check_if_browser_is_started() throws Throwable {
    	System.out.println("browser started"); 
    }
	
	
	
	
	@Given("^User is on banking landing page$")
	public void user_is_on_banking_landing_page() throws Throwable {
		System.out.println("Login to page");
	}

	/*
	 * @When("^User logs into application with \"([^\"]*)\" and password \"([^\"]*)\"$"
	 * ) public void
	 * user_logs_into_application_with_something_and_password_something(String
	 * strArg1, String strArg2) throws Throwable { System.out.println(strArg1);
	 * System.out.println(strArg2); }
	 */
	
	
	//   Data Table 
	  @When("^User sign in into application with following details$") public void
	  user_sign_in_into_application_with_following_details(DataTable data) throws
	  Throwable {
	  
	  List<List<String>>obj= data.asLists(); System.out.println(obj.get(0).get(0));
	  System.out.println(obj.get(0).get(1)); System.out.println(obj.get(0).get(2));
	  System.out.println(obj.get(0).get(3)); }
	 
	
	//Pareterization
	  @When("^User logs into application with (.+) and password (.+)$")
	    public void user_logs_into_application_with_and_password(String username, String password) throws Throwable {
	    System.out.println(username);
	    System.out.println(password);

	  
	  }

	  
	  
	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {

	}

	@Then("Cards displayed are {string}")
	public void cards_displayed_are(String string) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(string);
		
     
	}
}