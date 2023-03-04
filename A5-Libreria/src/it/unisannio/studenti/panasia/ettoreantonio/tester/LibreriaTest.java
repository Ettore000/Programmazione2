package it.unisannio.studenti.panasia.ettoreantonio.tester;

import it.unisannio.studenti.panasia.ettoreantonio.classi.Libreria;
import it.unisannio.studenti.panasia.ettoreantonio.classi.Libro;

public class LibreriaTest {

	public static void main(String[] args) {
		Libreria libreria=new Libreria();
		
		Libro l1=new Libro("Il nome della rosa", "Umberto Eco", 1980);
		Libro l2=new Libro("1984", "George Orwell", 1949);
        Libro l3=new Libro("Il signore degli anelli", "J.R.R. Tolkien", 1954);
        
        libreria.aggiungiLibro(l1);
        libreria.aggiungiLibro(l2);
        libreria.aggiungiLibro(l3);
        
        libreria.stampaLibri();
        
        libreria.rimuoviLibro("1984");
        
        System.out.println("\nDopo la rimozione del libro '1984': ");
        libreria.stampaLibri();
        
        Libro libroCercato=libreria.cercaLibro("Il signore degli anelli");
        if(libroCercato!=null) {
        	System.out.println("\nIl libro cercato e': ");
        	System.out.println(libroCercato.getTitolo()+" di: "+libroCercato.getAutore()+" ("+libroCercato.getAnnoPubblicazione()+")");
        } else {
        	System.out.println("\nIl libro cercato non e' presente nella libreria");
        }
	}

}
