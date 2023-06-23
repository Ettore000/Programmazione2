package util;

/**
 * Gestisce una eccezione che si verifica quando viene assegnato un valore troppo alto al voto di un esame
 */
public class VotoOltreIlMassimoException extends RuntimeException{
	/**
	 * Crea una eccezione VotoOltreIlMassimoException
	 */
	public VotoOltreIlMassimoException() {
		
	}
	
	/**
	 * Crea una eccezione VotoOltreIlMassimoException specificando un preciso messaggio
	 */
	public VotoOltreIlMassimoException(String message) {
		super(message);
	}

	/**
	 * Identifica l'eccezione
	 */
	private static final long serialVersionUID = -6478000179978811424L;
}
