package it.unisannio.studenti.panasia.ettoreantonio.scenari;

import java.util.Scanner;

import it.unisannio.studenti.panasia.ettoreantonio.classi.Contatore;

public class Decrementa {
	public static void main(String[] args) {
		//Inserisci un numero da tastiera e ottieni il numero incrementato di 1
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci un numero da decrementare di 1: ");
		int numero=sc.nextInt();sc.nextLine(); //ho usato nextLine() per sincronizzare il puntatore di sc verso una nuova linea
		
		Contatore contatore = new Contatore(numero);
		int numeroDecrementato=contatore.decrementaConta();
		
		System.out.println("Il numero decrementato e': "+numeroDecrementato);
		
		sc.close();
	}
}
