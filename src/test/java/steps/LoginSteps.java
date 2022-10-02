package steps;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user navigates to facebook site")
	public void user_navigates_to_facebook_site() {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("user validates login page title")
	public void user_validates_login_page_title() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("user enters the {string} username")
	public void user_enters_the_username(String username) {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("user enters the {string} password")
	public void user_enters_the_password(String pwd) {

		System.out.println("user_enters_the_password:" + pwd);
	}

	@Then("user enters firstname and lastname")
	public void user_enters_firstname_and_lastname(io.cucumber.datatable.DataTable dataTable) {
		
		// Parameterized data Table as Map

				for (Map<String, String> data : dataTable.asMaps(String.class, String.class)) {

					System.out.println(
							"First name is: " + data.get("firstname") + " Last name is: " + data.get("lastname"));
					
				}

		/*
		 * // Using data Table as List
		 * 
		 * List<List<String>> data = dataTable.asLists();
		 * System.out.print(data.get(0).get(0) + " ");
		 * System.out.println(data.get(0).get(1)); System.out.print(data.get(1).get(0) +
		 * " "); System.out.println(data.get(1).get(1));
		 * 
		 * // Using data Table as Map
		 * 
		 * List<Map<String, String>> map = dataTable.asMaps();
		 * 
		 * System.out.println( "First name is: " + map.get(0).get("firstname") +
		 * " Last name is: " + map.get(0).get("lastname")); System.out.println(
		 * "First name is: " + map.get(1).get("firstname") + " Last name is: " +
		 * map.get(1).get("lastname"));
		 */

		

	}

	@Then("user clicks on sign-in button")
	public void user_clicks_on_sign_in_button() {
		// Write code here that turns the phrase above into concrete actions
	}

}
