package ec.edu.espol.workshops;

/**
 * Sex enum.
 *
 * @author CltControl
 *
 */
public enum Sex {
  MALE("M"), FEMALE("F");

  private String sexLetter;

  private Sex(String letter) {
    this.sexLetter = letter;
  }

  @Override
  public String toString() {
    return this.sexLetter;
  }
}
