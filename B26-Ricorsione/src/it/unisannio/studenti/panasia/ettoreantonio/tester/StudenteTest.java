package it.unisannio.studenti.panasia.ettoreantonio.tester;

import java.util.ArrayList;

import it.unisannio.studenti.panasia.ettoreantonio.classi.Esame;
import it.unisannio.studenti.panasia.ettoreantonio.classi.Studente;

public class StudenteTest {

	public static void main(String[] args) {
		ArrayList<Esame> esami=new ArrayList<Esame>();
		
		esami.add(new Esame("Matematica", 25));
		esami.add(new Esame("Informatica", 28));
        esami.add(new Esame("Fisica", 24));
        
        Studente studente=new Studente("Mario Rossi", 123456, esami);
        
        double media=studente.mediaVoti();
        System.out.println("La media dei voti di "+studente.getNome()+" e': "+media);
	}

}
