package it.unisannio.studenti.panasia.ettoreantonio.scenari;

import java.util.Scanner;

import it.unisannio.studenti.panasia.ettoreantonio.classi.Contatore;

public class Incrementa {

	public static void main(String[] args) {
		//Inserisci un numero da tastiera e ottieni il numero incrementato di 1
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci un numero da incrementare di 1: ");
		int numero=sc.nextInt();sc.nextLine();
		
		Contatore contatore = new Contatore(numero);
		int numeroIncrementato=contatore.incrementaConta();
		
		System.out.println("Il numero incrementato e': "+numeroIncrementato);
		
		sc.close();
	}

}
