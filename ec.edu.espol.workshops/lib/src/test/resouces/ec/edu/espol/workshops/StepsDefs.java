package ec.edu.espol.workshops;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class StepsDefs {
	Customer customer = new Customer();
	CarInsurance carInsurance = new CarInsurance();
	private double answer;
	
	@Given("the customer is")
	public void the_customer_is() {
		customer.setAge(24);
		customer.setDrivingLicence(true);
		customer.setMaritalStatus(true);
		customer.setSex(Sex.MALE);
		
	}
	@Given("today is {string}")
	public void today_is(String today) {
		this.today = today;
	}
	@When("I ask whether it's Friday yet")
	public void i_ask_whether_it_s_Friday_yet() {
		actualAnswer = IsItFriday.isItFriday(today);
	}
	@Then("I should be told {string}")
	public void i_should_be_told(String expectedAnswer) {
		assertEquals(expectedAnswer, actualAnswer);
	}
}