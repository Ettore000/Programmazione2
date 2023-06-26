package util;

/**
 * Gestisce una eccezione che si verifica quando viene assegnato un valore troppo basso al voto di un esame
 */
public class VotoOltreIlMinimoException extends RuntimeException{
	/**
	 * Crea una eccezione VotoOltreIlMinimoException
	 */
	public VotoOltreIlMinimoException() {
		
	}
	
	/**
	 * Crea una eccezione VotoOltreIlMinimoException
	 */
	public VotoOltreIlMinimoException(String message) {
		super(message);
	}
	
	/**
	 * Identifica l'eccezione
	 */
	private static final long serialVersionUID = 5881191929879327250L;
}
