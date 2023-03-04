package it.unisannio.studenti.panasia.ettoreantonio.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		//Crea una mappa per archiviare le informazioni degli studenti
		//si usa come chiave il nome dello studente
		//si usa come valore una lista di votazioni
		Map<String, List<Integer>> votiStudenti=new HashMap<String, List<Integer>>();
		
		//aggiunta delle informazioni degli studenti nella mappa
		votiStudenti.put("Alice", Arrays.asList(85, 92, 78));
		votiStudenti.put("Bob", Arrays.asList(90, 87, 93));
		votiStudenti.put("Charlie", Arrays.asList(76, 85, 89));
		
		//calcola la media delle votazioni di ogni studente
		//per ogni studente della lista votiStudenti
		//si usa keyset per iterare attraverso le chiavi della mappa
		//utilizzare keySet() è più efficiente per accedere agli elementi di una mappa
		for(String studente:votiStudenti.keySet()) {
			//Si crea una lista dove si inseriscono solo i voti di uno studente
			List<Integer> voti= votiStudenti.get(studente);
			
			double media=0;
			
			//per ogni voto della lista
			for(int voto:voti)media+=voto; //si aggiunge un valore del voto alla media
			
			//si divide la media per il numero dei voti di quello studente
			media/=voti.size();
			
			//si stampa la media di ogni studente
			System.out.println(studente+" ha una media di: "+media);
		}
	}

}
