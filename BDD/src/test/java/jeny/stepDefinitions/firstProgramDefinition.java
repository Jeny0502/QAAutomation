package jeny.stepDefinitions;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class firstProgramDefinition {
	@Given("Customer lands in the login page")
	public void customer_lands_into_the_application() {
		System.out.println("Manual lands in the login page");
		System.out.println("Manual lands in the login page");
		System.out.println("Customer lands in the login page");
		System.out.println("Customer lands in the login page");
		
		System.out.println("Customer **** in the login page");
	}

//	@When("user enters the {string} and {string}")
//	public void user_enters_the_username_and_password(String username, String password) {
//		System.out.println("**" + username + " is the username and " + password + " is the password**");
//	}
	
	@When("^user enters the (.+) and (.+)$") //using regular expression
	public void user_enters_the_username_and_password(String username, String password) {
		System.out.println("**" + username + " is the username and " + password + " is the password**");
	}

	@Then("customer logged in successfully")
	public void customer_log_in_successfully() {
		System.out.println("then statement");
	}

	@Then("user not logged in successfully")
	public void user_not_logged_in_successfully() {
		System.out.println("user not logged in");
	}
	
	@Given("User is on practice landing page")
	public void user_is_on_practice_landing_page() {
		System.out.println("User is on practice landing page");
	}
	
	@When("User sign up into application")
	public void user_sign_up_into_application(List<String> data) {
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
	}
	
	@Then("Home page is displayed")
	public void home_page_is_displayed() {
		System.out.println("Home page is displayed");
	}
	
	@And("Cards are displayed")
	public void card_is_displayed() {
		System.out.println("card is displayed");
	}
	
	@Given("user info is available in the database")
	public void settingUpDB() {
		System.out.println("DB");
	}
	
	@When("system variable is set to true")
	public void setToTrue() {
		System.out.println("system variable is set to true");
		System.out.println("system variable is set to true or false");
	}
	
	@And("user login page is available")
	public void loginPageAvailable() {
		System.out.println("Login page ready");
		
	}
}
