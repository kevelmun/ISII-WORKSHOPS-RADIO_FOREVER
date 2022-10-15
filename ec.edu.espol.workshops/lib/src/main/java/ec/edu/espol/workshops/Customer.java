package ec.edu.espol.workshops;

public class Customer {
	private int age;
	private Sex sex;
	private boolean maritalStatus;
	private boolean drivingLicence;
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setSex(Sex sex) {
		this.sex = sex;
	}
	
	public void setMaritalStatus(boolean maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public int getAge() {
		return age;
	}

	public Sex getSex() {
		return sex;
	}

	public boolean isMaritalStatus() {
		return maritalStatus;
	}

	public boolean isDrivingLicence() {
		return drivingLicence;
	}	
	
	
}
