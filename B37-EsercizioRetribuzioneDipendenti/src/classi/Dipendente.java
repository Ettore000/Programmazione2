package classi;

/**
 * Dipendente: modella la retribuzione di un dipendente
 */
public class Dipendente {
	/**
	 * Crea un profilo dipendente
	 * @param nome
	 * @param retribuzioneOraria
	 */
	public Dipendente(String nome, double retribuzioneOraria) {
		this.nome = nome;
		this.retribuzioneOraria = retribuzioneOraria;
	}
	
	/**
	 * Crea un profilo dipendente in cui non viene specificata la retribuzione oraria,
	 * quindi viene applicato un valore predefinito
	 * @param nome
	 */
	public Dipendente(String nome) {
		this.nome = nome;
		this.retribuzioneOraria = 6.26;
	}
	
	/**
	 * Calcola la paga di un dipendente
	 * @param oreLavorate
	 * @return paga
	 */
	public double calcolaPaga(int oreLavorate) {
		double paga;
		if (oreLavorate<40) { //niente straordinari
			paga=oreLavorate*retribuzioneOraria;
		} else if (oreLavorate<(40+30)) { //straordinari fino a 30 ore
			paga=40*retribuzioneOraria+(oreLavorate-40)*(retribuzioneOraria*1.5); //straordinari pagati una volta e mezzo la normale retribuzione oraria
		} else { //straordinari oltre le 30 ore
			paga=40*retribuzioneOraria+30*(retribuzioneOraria*1.5); //vengono calcolate le ore fino al limite
			System.out.println("Hai superato le 30 ore di straordinario, le ore successive al limite massimo non verranno calcolate");
		}
		
		return paga;
	}

	/**
	 * Ottiene il nome
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Ottiene il valore della retribuzione oraria
	 * @return retribuzioneOraria
	 */
	public double getRetribuzioneOraria() {
		return retribuzioneOraria;
	}
	
	/**
	 * Modifica il valore della retribuzione oraria
	 * @param retribuzioneOraria
	 */
	public void setRetribuzioneOraria(double retribuzioneOraria) {
		this.retribuzioneOraria = retribuzioneOraria;
	}
	
	//Riassunto del dipendente
	/**
	 * Riassunto del dipendente
	 * @return stringa con nome e retribuzione oraria
	 */
	@Override
	public String toString() {
		return "Dipendente [nome=" + nome + ", retribuzioneOraria=" + retribuzioneOraria +"]";
	}

	private String nome;
	private double retribuzioneOraria;
}
