package it.unisannio.studenti.panasia.ettoreantonio.classi;

public class Auto extends Veicolo {
	//Override del metodo accelera() di Veicolo
	public void accelera() {
		super.accelera(); //Richiama il metodo della superclasse
		super.accelera(); //Incrementa ulteriormente la velocità
	}
}
