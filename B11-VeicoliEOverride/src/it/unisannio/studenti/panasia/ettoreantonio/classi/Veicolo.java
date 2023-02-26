package it.unisannio.studenti.panasia.ettoreantonio.classi;

public class Veicolo {
	/*
	 * Si omette di proposito il costruttore, così devo utilizzare super. nella sottoclasse per
	 * accedere all'identificatore definito in questa classe (la superclasse)
	 */
	
	public int getVelocita() {
		return velocita;
	}
	
	public void accelera() {
		velocita+=10;
	}
	
	private int velocita;
}
