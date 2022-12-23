package lib;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ec.edu.espol.workshops.CarInsurance;
import ec.edu.espol.workshops.Customer;
import ec.edu.espol.workshops.Main;
import ec.edu.espol.workshops.Sex;

class PathCoverageTest {

	@Test
	public void tc0008() {
		Customer cliente = new Customer();
		cliente.setMaritalStatus(false);
		cliente.setAge(65);
		cliente.setSex(Sex.MALE);
		
		CarInsurance ci = new CarInsurance();
		ci.setCustomer(cliente);
		
		double expectRes = 500.0;
		
		assertEquals(ci.calculatePremium(cliente), expectRes, 1);
	
	}
	
	@Test
	public void tc0009() {
		Customer cliente = new Customer();
		cliente.setMaritalStatus(true);
		cliente.setAge(20);
		cliente.setSex(Sex.FEMALE);
		
		CarInsurance ci = new CarInsurance();
		ci.setCustomer(cliente);
		
		double expectRes = 300.0;
		assertEquals(ci.calculatePremium(cliente), expectRes, 1);
	
	}
	
	@Test
	public void tc0010() {
		Customer cliente = new Customer();
		cliente.setMaritalStatus(false);
		cliente.setAge(24);
		cliente.setSex(Sex.MALE);
		
		CarInsurance ci = new CarInsurance();
		ci.setCustomer(cliente);
		
		double expectRes = 2000.0;
		
		assertEquals(ci.calculatePremium(cliente), expectRes, 1);
	
	}
	
	@Test
	public void tc0011() {
		Customer cliente = new Customer();
		cliente.setMaritalStatus(false);
		cliente.setAge(50);
		cliente.setSex(Sex.FEMALE);
		
		CarInsurance ci = new CarInsurance();
		ci.setCustomer(cliente);
		
		double expectRes = 400.0;
		
		assertEquals(ci.calculatePremium(cliente), expectRes, 1);
	
	}
	
	@Test
	public void tc0012() {
		Customer cliente = new Customer();
		cliente.setMaritalStatus(false);
		cliente.setDrivingLicence(true);
		cliente.setAge(81);
		cliente.setSex(Sex.MALE);

		int response = Main.validateCustomer(cliente); 
		int expectRes = -1;
		
		assertEquals(expectRes, response);
	
	}

	@Test
	public void tc0013() {
		Customer cliente = new Customer();
		cliente.setMaritalStatus(false);
		cliente.setDrivingLicence(false);
		cliente.setAge(70);
		cliente.setSex(Sex.MALE);

		int response = Main.validateCustomer(cliente); 
		int expectRes = -1;
		
		assertEquals(expectRes, response);
	}

	@Test
	public void tc00014() {
		Customer cliente = new Customer();
		cliente.setMaritalStatus(false);
		cliente.setDrivingLicence(true);
		cliente.setAge(79);
		cliente.setSex(Sex.MALE);

		int response = Main.validateCustomer(cliente); 
		int expectRes = 0;
		
		assertEquals(expectRes, response);
	}

}
