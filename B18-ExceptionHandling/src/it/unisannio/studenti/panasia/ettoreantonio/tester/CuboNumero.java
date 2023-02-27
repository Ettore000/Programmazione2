package it.unisannio.studenti.panasia.ettoreantonio.tester;

import java.util.Scanner;

import it.unisannio.studenti.panasia.ettoreantonio.classi.NegativeNumberException;

public class CuboNumero {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Inserisci un numero intero: ");
		try {
			/*
			 *  Il metodo nextInt() solleverà automaticamente un'eccezione di tipo InputMismatchException
			 */
			int num=sc.nextInt();
			if(num<0)throw new NegativeNumberException(); //Eccezione personalizzata definita in una Classe

			int cubo=num*num*num;
			System.out.println("Il cubo di "+num+" e' "+cubo);
		} catch (NegativeNumberException e) {
			System.err.println("Errore: il numero inserito e' negativo");
		} catch (Exception e) {
			System.err.println("Errore: devi inserire un numero intero");
		} finally {
			sc.close();
		}
	}

}
