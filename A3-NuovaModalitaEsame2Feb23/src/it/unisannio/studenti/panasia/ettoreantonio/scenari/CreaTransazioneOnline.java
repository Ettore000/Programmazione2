package it.unisannio.studenti.panasia.ettoreantonio.scenari;

import java.io.IOException;
import java.util.Scanner;

import it.unisannio.studenti.panasia.ettoreantonio.classi.Libro;
import it.unisannio.studenti.panasia.ettoreantonio.classi.TransazioneOnline;

public class CreaTransazioneOnline {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		TransazioneOnline transazioneOnline=TransazioneOnline.read(sc);
		Libro libro=Libro.read(sc);
		transazioneOnline.addLibri(libro);
		System.out.println("Istanza inserita: ");
		transazioneOnline.print();
		sc.close();
		System.out.println("***Scenario concluso con successo***");
	}
}
