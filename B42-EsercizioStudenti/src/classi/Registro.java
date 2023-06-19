package classi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Modella un registro contenente studenti e esami
 */
public class Registro {
	/**
	 * Crea un registro
	 * @param scStudente
	 * @param scEsami
	 */
	public Registro(Scanner scStudente, Scanner scEsami) {
		this.studenti=new ArrayList<Studente>();
		this.esami=new ArrayList<Esame>();
		
		Studente s=Studente.read(scStudente);
		while (s!=null) {
			studenti.add(s);
			s=Studente.read(scStudente);
			
		}
		
		Esame e=Esame.read(scEsami);
		while (e!=null) {
			esami.add(e);
			e=Esame.read(scEsami);
		}
	}
	
	//TODO find
	//TODO filter
	//TODO sort
	//TODO add
	//TODO remove
	//TODO print studenti (for)
	//TODO print esami (for)
	//TODO print (tutti e due sempre con for)

	private List<Studente> studenti;
	private List<Esame> esami;
}
