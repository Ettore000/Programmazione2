package classi;

/**
 * Camion: modella un camion
 */
public class Camion {
	/**
	 * Crea un camion
	 * @param numeroAssi
	 * @param peso
	 */
	public Camion(int numeroAssi, int peso) {
		this.numeroAssi = numeroAssi;
		this.peso = peso;
	}

	/**
	 * Ottiene il numero di assi
	 * @return numeroAssi
	 */
	public int getNumeroAssi() {
		return numeroAssi;
	}

	/**
	 * Ottiene il peso
	 * @return peso
	 */
	public int getPeso() {
		return peso;
	}

	private int numeroAssi, peso;
}
