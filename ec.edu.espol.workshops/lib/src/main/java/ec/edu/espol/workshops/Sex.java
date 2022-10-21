package ec.edu.espol.workshops;

/**
 * 
 * @author Josebas007
 *
 * Sex options.
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
