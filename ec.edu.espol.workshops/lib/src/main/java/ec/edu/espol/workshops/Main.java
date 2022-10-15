package ec.edu.espol.workshops;

import java.util.Scanner;

public class Main {
	
	public static int validateCustomer(Customer customer) {
		if (customer.getAge() > 80) {
			return -1;
		} else if  (!customer.isDrivingLicence()) {
			return -1;
		}
		return 0;
	}

	public static void main(String[] args) {		
		
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			Customer customer = new Customer();
			CarInsurance insurance = new CarInsurance();
			while (true) {
				try {
					System.out.println("Input your age:");
					int input = Integer.parseInt(scan.next());
					if (input >= 18 && input <= 80) {
						customer.setAge(input);
						break;
					}
					System.out.println("Invalid data. Please input a valid number.");
				} catch (Exception e) {
					System.out.println("Invalid data. Please input a number.");
				}
			}
			while (true) {
				try {
					System.out.println("Input your sex (M - F):");
					String inputSex = scan.next();
					if (inputSex.toUpperCase().equals("M")) {
						customer.setSex(Sex.MALE);
						break;
					} else if (inputSex.toUpperCase().equals("F")) {
						customer.setSex(Sex.FEMALE);
						break;
					} else {
						System.out.println("Invalid data. Plese input a valid option");
					}
				} catch (Exception e) {
					System.out.println("Invalid data. Plese input a valid option.");
				}
			}
			while (true) {
				try {
					System.out.println("Are you married? (Y - N):");
					String inputMarried = scan.next();
					if (inputMarried.toUpperCase().equals("Y")) {
						customer.setMaritalStatus(true);
						break;
					} else if (inputMarried.toUpperCase().equals("N")) {
						customer.setMaritalStatus(false);
						break;
					} else {
						System.out.println("Invalid data. Plese input a valid option");
					}
				} catch (Exception e) {
					System.out.println("Invalid data. Plese input a valid option.");
				}
			}
			while (true) {
				try {
					System.out.println("Is your driving license valid? (Y - N):");
					String inputLicense = scan.next();
					if (inputLicense.equals("Y")) {
						customer.setDrivingLicence(true);
						break;
					} else if (inputLicense.equals("N")) {
						customer.setDrivingLicence(false);
						break;
					} else {
						System.out.println("Invalid data. Plese input a valid option.");
					}
				} catch (Exception e) {
					System.out.println("Invalid data. Plese input a valid option.");
				}
			}
			if (validateCustomer(customer) == 0) {
				System.out.println("Your premium value is: " + insurance.calculatePremium(customer));
				
				
				
			} else {
				System.out.println("Customer data invalid, returned -1.");
			} 
			System.out.println("Want to check another customer premium value? (Y/N)");
			String action = scan.next();
			if (action.toUpperCase().equals("N")) {
				break;
			}
		}
		scan.close();

	}

}
