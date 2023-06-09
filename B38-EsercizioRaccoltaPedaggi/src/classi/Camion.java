/**
 * Modella un camion
 */

package classi;

public class Camion {
	public Camion(int numeroAssi, int peso) {
		this.numeroAssi = numeroAssi;
		this.peso = peso;
	}

	public int getNumeroAssi() {
		return numeroAssi;
	}

	public int getPeso() {
		return peso;
	}

	private int numeroAssi, peso;
}
