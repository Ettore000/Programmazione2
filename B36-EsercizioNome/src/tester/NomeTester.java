/**
 * Test driver della classe Nome
 */

package tester;

import classi.Nome;

public class NomeTester {

	public static void main(String[] args) {
		Nome nome=new Nome("Luca", "Rossi", "Sig.");
		
		System.out.println(nome.getTitle()+" "+nome.getLast()+" "+nome.getFirst());
		System.out.println(nome.getTitle()+" "+nome.getIinitials());
	}

}
