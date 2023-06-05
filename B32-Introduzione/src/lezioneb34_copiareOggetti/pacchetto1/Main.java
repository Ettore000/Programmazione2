/* Lezione 34
 * - copiare oggetti
 * 
 * - tramite metodo
 * - tramite costruttore
 */

package lezioneb34_copiareOggetti.pacchetto1;

public class Main {

	public static void main(String[] args) {
		Persona persona1=new Persona("Luca", "Rossi");
		Persona persona2=new Persona("Marco", "Verdi");
		Persona persona3=new Persona(persona2); //copia tramite costruttore
		
		//copia tramite metodo
		persona2.copy(persona1); //la persona 2 copia la persona 1
		
		persona1.setNome("Orazio");
		
		System.out.println(persona1);
		System.out.println(persona2);
		System.out.println(persona3);
		System.out.println();
		System.out.println(persona1.getNome());
		System.out.println(persona1.getCognome());
		System.out.println();
		System.out.println(persona2.getNome());
		System.out.println(persona2.getCognome());
		System.out.println();
		System.out.println(persona3.getNome());
		System.out.println(persona3.getCognome());
	}

}
