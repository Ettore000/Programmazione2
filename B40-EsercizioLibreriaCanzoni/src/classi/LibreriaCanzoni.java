package classi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * LibreriaCanzoni: modella una libreria di canzoni per i diversi generi
 */
public class LibreriaCanzoni {
	/**
	 * Crea una libreria di canzoni specificando il nome del file del genere musicale
	 * @param nomeFileGenereMusicale
	 */
	public LibreriaCanzoni(String nomeFileGenereMusicale) {
		this.nomeFileGenereMusicale=nomeFileGenereMusicale;
	}

	/**
	 * Ottiene il nome del file del genere musicale
	 * @return nomeFileGenereMusicale
	 */
	public String getNomeFileGenereMusicale() {
		return nomeFileGenereMusicale;
	}

	/**
	 * Cerca canzoni specificando l'artista
	 * @param artista
	 */
	public void cercaPerArtista(String artista) {
		try {
			//Crea l'istanza di un file con nome specificato dal costruttore
			Scanner sc=new Scanner(new File(nomeFileGenereMusicale));
			
			Canzone c=Canzone.read(sc);
			
			while (c!=null) {
				if (artista.equals(c.getArtista())) {
					System.out.println(c.getTitolo());
				}
				c=Canzone.read(sc);
			}
		} catch (FileNotFoundException e) {
			System.err.println("Il file specificato non è stato trovato");
		}


	}
	private String nomeFileGenereMusicale;
}
