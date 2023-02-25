package it.unisannio.studenti.panasia.ettoreantonio.scenari;

import it.unisannio.studenti.panasia.ettoreantonio.classi.Auto;
import it.unisannio.studenti.panasia.ettoreantonio.classi.Bicicletta;
import it.unisannio.studenti.panasia.ettoreantonio.classi.Moto;
import it.unisannio.studenti.panasia.ettoreantonio.classi.Veicolo;

public class StampaVeicoli {

	public static void main(String[] args) {
		Veicolo auto=new Auto("Fiat 500", "Sport", 180, 2, "Benzina");
		Veicolo moto=new Moto("Honda", "CBR", 280, 2, "Quadricilindrico a 4 tempi");
		Veicolo bicicletta= new Bicicletta("Specialized", "Stumpjumper", 50, 10, "Disco");
		
		auto.print();
		moto.print();
		bicicletta.print();
	}

}