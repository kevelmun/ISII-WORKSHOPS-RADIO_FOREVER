package ec.edu.espol.workshops;

/**
 * 
 * @author Josebas007
 *
 */
public class CarInsurance {
	
	/**
	 * Class identifier
	 */
	private long id;
	/**
	 * Default mount to pay for an insurance.
	 */
	private double mount = 500;
	/**
	 * The actual customer 
	 */
	private Customer customer;
	


	/**
	 * Creates a instance of CarInsurance with specific attributes.
	 * @param id
	 * @param mount
	 * @param customer
	 */
	public CarInsurance(long id, double mount, Customer customer) {
		this.id = id;
		this.mount = mount;
		this.customer = customer;
	}

	/**
	 * Creates a instance of CarInsurance.
	 */
	public CarInsurance() {
		/**
		 * Default constructor.
		 */
	}
	
	public long getId() {
		return id;
	}
	
	public double getMount() {
		return mount;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public void setMount(double mount) {
		this.mount = mount;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * 
	 * @param customer
	 * @return final customer mount to be pay for the insurance. 
	 */
	public double calculatePremium(Customer customer) {
		if (customer.getSex() == Sex.MALE && !customer.isMaritalStatus() && customer.getAge() < 25) {
			return this.mount += 1500;
		} else if (customer.getSex() == Sex.FEMALE && customer.isMaritalStatus()) {
			return this.mount -= 200;
		} else if (customer.getAge() >= 45 && customer.getAge() < 65) {
			return this.mount -= 100;
		}
		return this.mount;
	}
	
}
