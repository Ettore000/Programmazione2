package it.unisannio.studenti.panasia.ettoreantonio.tester;

import it.unisannio.studenti.panasia.ettoreantonio.classi.Auto;
import it.unisannio.studenti.panasia.ettoreantonio.classi.Veicolo;

public class AutoTest {

	public static void main(String[] args) {
		Veicolo veicolo=new Veicolo();
		Auto auto=new Auto();
		
		veicolo.accelera();
		auto.accelera();
		
		System.out.println("Velocita' veicolo: "+veicolo.getVelocita()); //10
		System.out.println("Velocita' auto: "+auto.getVelocita()); //20
	}

}
