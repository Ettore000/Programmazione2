package it.unisannio.studenti.panasia.ettoreantonio.scenari;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import it.unisannio.studenti.panasia.ettoreantonio.classi.Veicolo;

public class LeggiDaFileEStampa {
	public static void main(String[] args) throws FileNotFoundException{
		/*
		 * Non viene eseguito un blocco try per l'eccezione FileNotFoundException perché viene auto-gestita
		 */
		Scanner sc=new Scanner(new File("veicoli.txt"));
		
		while (sc.hasNextLine()) {
			Veicolo veicolo=Veicolo.read(sc);

			if (veicolo!=null)System.out.println(veicolo);;
		}
		
		sc.close();
	}

}
