package it.unisannio.studenti.panasia.ettoreantonio.tester;

import java.util.Scanner;

public class Factoring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Inserisci un numero intero positivo: ");
		int numero=sc.nextInt();
		
		System.out.println("I fattori primi di "+numero+" sono: ");
		for (int i = 2; i < numero; i++) {
			while (numero%i==0) {
				System.out.println(i+" ");
				numero/=i;
			}
		}
	}
}
