package scenari;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import classi.Canzone;

public class ScriviCanzoniSuFile {

	public static void main(String[] args) {
		Canzone[] canzoni=new Canzone[15];
		
		//scrivi su file
		//Jazz
		try {
			PrintStream psJazz=new PrintStream(new File("jazz.lib"));
			
			
			canzoni[0] = new Canzone("Moonlit Serenade", "Jazz Ensemble Quintet");
			canzoni[1] = new Canzone("Blue Skies", "Ella Fitzgerald");
			canzoni[2] = new Canzone("Take Five", "Dave Brubeck Quartet");
			canzoni[3] = new Canzone("All of Me", "Billie Holiday");
			canzoni[4] = new Canzone("Autumn Leaves", "Cannonball Adderley");
			
			for (int i=0; i<4; i++) {
				canzoni[i].print(psJazz);
			}
		} catch (FileNotFoundException e) {
			System.err.println("File della categoria jazz non trovato");
		}
		
		//Classica
		try {
			PrintStream psClassica=new PrintStream(new File("classica.lib"));
			
			canzoni[5] = new Canzone("Canon in D", "Johann Pachelbel");
			canzoni[6] = new Canzone("Für Elise", "Ludwig van Beethoven");
			canzoni[7] = new Canzone("Air on the G String", "Johann Sebastian Bach");
			canzoni[8] = new Canzone("Clair de Lune", "Claude Debussy");
			canzoni[9] = new Canzone("Symphony No. 5", "Ludwig van Beethoven");
			
			for (int i=5; i<9; i++) {
				canzoni[i].print(psClassica);
			}
		} catch (FileNotFoundException e) {
			System.err.println("File della categoria classica non trovato");
		}
		
		//Pop
		try {
			PrintStream psPop=new PrintStream(new File("pop.lib"));
			
			canzoni[10] = new Canzone("Shape of You", "Ed Sheeran");
			canzoni[11] = new Canzone("Uptown Funk", "Mark Ronson ft. Bruno Mars");
			canzoni[12] = new Canzone("Happy", "Pharrell Williams");
			canzoni[13] = new Canzone("Roar", "Katy Perry");
			canzoni[14] = new Canzone("Can't Stop the Feeling!", "Justin Timberlake");
			
			for (int i=10; i<14; i++) {
				canzoni[i].print(psPop);
			}
		} catch (FileNotFoundException e) {
			System.err.println("File della categoria pop non trovato");
		}
	}

}
