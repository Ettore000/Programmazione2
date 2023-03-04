package it.unisannio.studenti.panasia.ettoreantonio.tester;

import java.util.LinkedHashMap;

import it.unisannio.studenti.panasia.ettoreantonio.classi.Studente;

public class StudenteTest {

	public static void main(String[] args) {
		//Creiamo la LinkedHashMap
		LinkedHashMap<String, Studente> studenti=new LinkedHashMap<String, Studente>();
		
		//Aggiungiamo alcuni studenti alla mappa
		studenti.put("Mario", new Studente("Mario", "Rossi", 7.5));
		studenti.put("Paolo", new Studente("Paolo", "Neri", 8.0));
		studenti.put("Luca", new Studente("Luca", "Verdi", 6.5));
		
		//Stampiamo i nomi e le medie degli studenti in ordine di inserimento
		System.out.println("Nomi e medie degli studenti in ordine di inserimento: ");
		for(String nome:studenti.keySet())System.out.println(nome+": "+studenti.get(nome).getMedia());
	}

}
