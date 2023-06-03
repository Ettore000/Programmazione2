package lezione1_5_Java_variabili;
/* Lezione 3
 * Perchè imparare Java:
 * 
 * - Top 3 linguaggi più popolari
 * - Usato a livello aziendale (framework Spring), giochi (Minecraft), web app e android
 * 
 * Come funziona:
 * 
 * - computer usano codice macchina (basso livello) binario 00000001 00000010 00000011 00000100
 * - noi scriviamo source code (alto livello) in file .java
 * - java viene poi compilato ovvero tradotto in codice macchina
 * - quando però compiliamo il codice è specifico per il sistema operativo (Mac, Windows ecc..)
 * - java mette a disposizione uno step intermedio
 * 		source code --> compiler --> byte code --> jvm --> machine code
 * 
 * JVM: java virtual machine è contenuto nel JDK
 * JDK: java development kit che contiene JRE
 * JRE: java runtime environment contiene librerie e toolkits
 * 
 * JDK --> JRE --> JVM
 * 
 * Ci serve un IDE
 * IDE: integrate development environment (ambiente di sviluppo integrato)
 * - eclipse, intellij e vsc
 * 
 */

/* Lezione 4
 * 
 * - Cos'è una variabile?
 * - dichiarazione, assegnazione, inizializzazione
 * - variabili con diversi tipi di dati
 * - nomenclatura delle variabili
 * 
 */

/* Lezione 5
 * 
 * - Tipi di dati primitive e reference
 * 
 * - boolean	|	true	:	false	|	1 bit
 * 
 * - byte		|	-128	:	127		| 	1 byte
 * - short		|	-32768	:	32767	|	2 bytes
 * - int		|	-2mld	:	2mld	|	4 bytes
 * - long		|	-9qln	:	9qln	|	8 bytes
 * 
 * - float		|	numero con 6-7 cifre decimali 5.123526f			|	4 bytes
 * - double		|	numero con 15 cifre decimali 5.123526236701522	|	8 bytes
 * 
 * - char		|	singolo carattere/lettera/ASCII 'f'			|	2 bytes
 * - String		|	sequenza di caratteri "ciao dal corso Java"	|	variabile
 * 
 * - differenze tra primitive e reference (inizile e attributi disponibili)
 * 		I primitivi sono i tipi di dati che ci vengono forniti da Java, iniziano con la lettera minuscola;
 * 		Le reference cominciano con la lettera maiuscola e portano con se una serie di attributi e di metodi
 * 		che possiamo utilizzare;
 */

public class Main {

	public static void main(String[] args) {
		int x; //dichiarazione
		x=45; //assegnazione
		
		//oppure
		
		int y=34; //inizializzazione
		
		//stampa su schermo
		System.out.println(x);
		System.out.println(y);

	}

}
