package it.unisannio.studenti.panasia.ettoreantonio.tester;

import java.util.ArrayList;
import java.util.List;

public class EsercizioLista {

	public static void main(String[] args) {
		//Crea una lista di numeri interi
		List<Integer> numeri=new ArrayList<Integer>();
		
		numeri.add(1);
		numeri.add(2);
		numeri.add(3);
		numeri.add(4);
		numeri.add(5);
		numeri.add(6);
		numeri.add(7);
		numeri.add(8);
		numeri.add(9);
		numeri.add(10);
		
		//Stampa la lista
		System.out.println("Lista di numeri: "+numeri); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		
		//Somma tutti i numeri della lista
		int somma=0;
		for(int numero:numeri)somma+=numero;
		
		//Stampa la somma
		System.out.println("Somma di tutti i numeri: "+somma); // 55
		
		//Rimuovi i numeri pari dalla lista
		List<Integer> numeriDispari=new ArrayList<Integer>();
		
		for(int numero:numeri)if(numero%2!=0)numeriDispari.add(numero);
		numeri.removeAll(numeriDispari);
		
		//Stampa la lista senza i numeri dispari
		System.out.println("Lista di numeri pari: "+numeri); // [2, 4, 6, 8, 10]
	}

}
