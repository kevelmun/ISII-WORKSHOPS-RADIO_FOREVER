package ec.edu.espol.workshops;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class StepsDefs {
	Customer customer;
	CarInsurance carInsurance = new CarInsurance();
	private double answer;
	
	@Given("a <customer>")
	public void the_customer_is() {
		this.customer = new Customer();
	}
	
	@And("is a male")
	public void customerIs() {
		customer.setSex(Sex.MALE);
	}
	
	@And("24 years old")
	public void yearsOld() {
		customer.setAge(24);
	}
	
	@And("is married")
	public void isMarried() {
		customer.setMaritalStatus(true);
	}
	
	@And("with a valid driven license")
	public void withValidLicense() {
		customer.setDrivingLicence(true);
	}
	
	@When("calculate the premium")
	public void calculateThePremium() {
		answer = carInsurance.calculatePremium(customer);
	}
	
	@Then("show 500")
	public void showMount() {
		assertEquals(500, answer);
	}
	
}