package ec.edu.espol.workshops;

/**
 * Customer class.
 *
 * @author CltControl
 *
 */
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

  public void setDrivingLicence(boolean drivingLicence) {
    this.drivingLicence = drivingLicence;
  }

  public int getAge() {
    return this.age;
  }

  public Sex getSex() {
    return this.sex;
  }

  public boolean isMaritalStatus() {
    return this.maritalStatus;
  }

  public boolean isDrivingLicence() {
    return this.drivingLicence;
  }

}
