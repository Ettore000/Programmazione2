/**
 * Modella la retribuzione di un dipendente
 */

package classi;

public class Dipendente {
	public Dipendente(String nome, double retribuzioneOraria) {
		this.nome = nome;
		this.retribuzioneOraria = retribuzioneOraria;
		this.oreLavorate = 0;
		this.oreStraordinario = 0;
	}
	
	//se la retribuzione oraria non viene specificata, allora viene applicato un valore predefinito
	public Dipendente(String nome) {
		this.nome = nome;
		this.retribuzioneOraria = 6.26;
		this.oreLavorate = 0;
		this.oreStraordinario = 0;
	}
	
	//calcola la paga di un dipendente
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

	public String getNome() {
		return nome;
	}
	public double getRetribuzioneOraria() {
		return retribuzioneOraria;
	}
	public int getOreLavorate() {
		return oreLavorate;
	}
	public int getOreStraordinario() {
		return oreStraordinario;
	}
	
	//la retribuzione oraria può cambiare
	public void setRetribuzioneOraria(double retribuzioneOraria) {
		this.retribuzioneOraria = retribuzioneOraria;
	}
	
	//Riassunto del dipendente
	@Override
	public String toString() {
		return "Dipendente [nome=" + nome + ", retribuzioneOraria=" + retribuzioneOraria + ", oreLavorate="
				+ oreLavorate + ", oreStraordinario=" + oreStraordinario + "]";
	}

	private String nome;
	private double retribuzioneOraria;
	private int oreLavorate, oreStraordinario;
}
