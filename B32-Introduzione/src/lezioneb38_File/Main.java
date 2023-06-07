/* Lezione 38
 * - Lavorare con i File
 * 
 * - verificare se il file esiste nel progetto o nel computer
 * - getPath, getAbsolutePath, isFile
 * - eliminare File
 * - scrivere in un File con fileWriter: write e append
 * - leggere un file con fileReader
 */

package lezioneb38_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		File file=new File("prova.txt");
		
		//verifichiamo che il File esista
		if (file.exists()) {
			System.out.println("Il file esiste");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
			//per eliminare il file si usa file.delete();
		} else {
			System.out.println("Il file non esiste");
		}
		
		//con FileWriter
		try {
			FileWriter fw=new FileWriter("prova.txt"); //non si deve aprire prima con File()
			fw.write("Ciao sono Ettore \nsto facendo il corso di Java\n mi sto divertendo");
			fw.append("\nBellissimo file");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//leggere un file con FileReader
		try {
			FileReader fr=new FileReader("prova.txt");
			int data=fr.read(); //in questo modo legge solo la prima lettera
			System.out.println(data);
			
			//per leggere tutto il file dobbiamo costruire un ciclo
			while (data!=-1) { //restituisce -1 se non trova nessun carattere
				System.out.print((char)data); //conversione a carattere
				data=fr.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
