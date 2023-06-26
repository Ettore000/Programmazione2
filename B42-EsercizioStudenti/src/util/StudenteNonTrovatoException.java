package util;

public class StudenteNonTrovatoException extends RuntimeException{
	public StudenteNonTrovatoException() {

	}

	public StudenteNonTrovatoException(String message) {
		super(message);
	}

	/**
	 * Identificativo eccezione
	 */
	private static final long serialVersionUID = -5922829371143032583L;

}
