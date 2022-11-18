package ec.edu.espol.workshops;

import java.util.Locale;
import java.util.Scanner;

/**
 * Main Class.
 *
 * @author CltControl
 *
 */
public class Main {

	/**
	 * Static method that validate the conditions of customer.
	 *
	 * @param customer A customer that applied the car insurance.
	 * @return -1 if the customer not applied, 0 if applied.
	 */
	public static int validateCustomer(Customer customer) {
		boolean validAge = customer.getAge() > 80 || customer.getAge() < 18;
		if (validAge) {
			return -1;
		} else if  (!customer.isDrivingLicence()) {
			return -1;
		}
		return 0;
	}
	
	/**
	   * Main method.
	   *
	   * @param args any argument.
	   */
	public static void main(String[] args) {		
		
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			Customer customer = new Customer();
			CarInsurance insurance = new CarInsurance();
			while (true) {
				try {
					System.out.println("Input your age:");
					int input = Integer.parseInt(scan.next());
					customer.setAge(input);
					break;
				} catch (NumberFormatException e) {
					System.out.println("Invalid data. Please input a number.");
				}
			}
			while (true) {
				try {
					System.out.println("Input your sex (M - F):");
					String inputSex = scan.next();
					if (inputSex.toUpperCase(Locale.ENGLISH).equals("M")) {
						customer.setSex(Sex.MALE);
						break;
					} else if (inputSex.toUpperCase(Locale.ENGLISH).equals("F")) {
						customer.setSex(Sex.FEMALE);
						break;
					} else {
						throw new RuntimeException();
					}
				} catch (RuntimeException e) {
					System.out.println(e);
					System.out.println("Invalid data. Please input a valid option.");
				}
			}
			while (true) {
				try {
					System.out.println("Are you married? (Y - N):");
					String inputMarried = scan.next();
					if (inputMarried.toUpperCase(Locale.ENGLISH).equals("Y")) {
						customer.setMaritalStatus(true);
						break;
					} else if (inputMarried.toUpperCase(Locale.ENGLISH).equals("N")) {
						customer.setMaritalStatus(false);
						break;
					} else {
						throw new RuntimeException();
					}
				} catch (RuntimeException e) {
					System.out.println("Invalid data. Please input a valid option.");
				}
			}
			while (true) {
				try {
					System.out.println("Is your driving license valid? (Y - N):");
					String inputLicense = scan.next();
					if (inputLicense.toUpperCase(Locale.ENGLISH).equals("Y")) {
						customer.setDrivingLicence(true);
						break;
					} else if (inputLicense.toUpperCase(Locale.ENGLISH).equals("N")) {
						customer.setDrivingLicence(false);
						break;
					} else {
						System.out.println("Invalid data. Please input a valid option.");
					}
				} catch (Exception e) {
					System.out.println("Invalid data. Please input a valid option.");
				}
			}
			if (validateCustomer(customer) == 0) {
				System.out.println("Your premium value is: " + insurance.calculatePremium(customer));
			} else {
				System.out.println("Customer data invalid, returned -1.");
			} 
			System.out.println("Want to check another customer premium value? (Y/N)");
			String action = scan.next();
			if (action.toUpperCase(Locale.ENGLISH).equals("N")) {
				break;
			}
		}
		scan.close();
	}
}