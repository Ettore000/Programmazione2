package it.unisannio.studenti.panasia.ettoreantonio.tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class HashSetTest {

	public static void main(String[] args) {
		//Crea la lista
		List<Integer> inputList=new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 3, 2, 5, 6, 1));
		
		System.out.println("Input list: "+inputList);
		
		//Carica un HashSet ed elimina in automatico i duplicati
		HashSet<Integer> hashSet=new HashSet<Integer>(inputList);
		
		//Scherma la lista iniziale, prende il valore che restituisce l'HashSet
		List<Integer> outputList=new ArrayList<Integer>(hashSet);
		
		//Stampa la nuova lista schermata (senza doppioni)
		System.out.println("Output list: "+outputList);
		
		/*
		 * OUTPUT: 	Input list: [1, 2, 3, 4, 3, 2, 5, 6, 1]
		 * 			Output list: [1, 2, 3, 4, 5, 6]
		 */
	}

}
