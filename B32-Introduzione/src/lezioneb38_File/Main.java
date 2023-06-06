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

public class Main {

	public static void main(String[] args) {
		File file=new File("prova.txt");
		
		//verifichiamo che il File esista
		if (file.exists()) {
			System.out.println("Il file esiste");
		} else {
			System.out.println("Il file non esiste");
		}
	}

}
