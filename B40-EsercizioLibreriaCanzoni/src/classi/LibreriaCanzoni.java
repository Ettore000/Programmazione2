package classi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LibreriaCanzoni {
	public LibreriaCanzoni(String nomeFileGenereMusicale) {
		this.nomeFileGenereMusicale=nomeFileGenereMusicale;
	}

	public String getNomeFileGenereMusicale() {
		return nomeFileGenereMusicale;
	}

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
