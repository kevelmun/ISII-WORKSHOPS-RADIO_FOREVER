package ec.edu.espol.workshops;

/**
<<<<<<< HEAD
 * Sex enum.
 *
 * @author CltControl
 *
 */

public enum Sex {
	
	/**
	 * M for male.
	 */
	MALE("M"),
	
	/**
	 * F for female. 
	 */
	FEMALE("F");
	/**
	 * Identification letter.
	 */
	private String sexLetter;
	
	private Sex(String letter) {
		this.sexLetter = letter;
	}
	
	@Override
	public String toString() {
		return this.sexLetter;
	}
}
