package it.unisannio.studenti.panasia.ettoreantonio.scenari;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import it.unisannio.studenti.panasia.ettoreantonio.classi.Veicolo;

public class SalvaConHashMap {

	public static void main(String[] args) throws FileNotFoundException {
		/*
		 * Sono stati inseriti 3 risultati prima del salvataggio
		 * in totale sono aspettati 6 risultati
		 */

		Map<String, Veicolo> veicoli=new HashMap<String, Veicolo>();
		veicoli.put("AA111BB", new Veicolo("Toyota", "Corolla", 2018, 18000.0));
		veicoli.put("CC222DD", new Veicolo("Honda", "Civic", 2019, 20000.0));
		veicoli.put("EE333FF", new Veicolo("Ford", "Mustang", 2020, 30000.0));

		PrintStream ps=new PrintStream(new File("veicoli.txt"));
		for(Veicolo veicolo:veicoli.values())ps.println(veicolo);

		ps.close();
		System.out.println("***Scenario concluso con successo***");
	}

}
