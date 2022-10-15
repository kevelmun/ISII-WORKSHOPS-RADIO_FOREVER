package ec.edu.espol.workshops;


public class CarInsurance {
	private long id;
	private double mount = 500;
	private Customer customer;
	
	public long getId() {
		return id;
	}
	
	public double getMount() {
		return mount;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public double calculatePremium(Customer customer) {
		if (customer.getSex() == Sex.MALE && customer.isMaritalStatus() == false && customer.getAge() < 25) {
			return this.mount += 1500;
		} else if (customer.getSex() == Sex.FEMALE && customer.isMaritalStatus() == true) {
			return this.mount -= 200;
		} else if (customer.getAge() >= 45 && customer.getAge() < 65) {
			return this.mount -= 100;
		}
		return this.mount;
	}
	
}
