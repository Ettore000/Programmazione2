package it.unisannio.studenti.panasia.ettoreantonio.scenari;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import it.unisannio.studenti.panasia.ettoreantonio.classi.Veicolo;

public class AggiungiAlFile {

	public static void main(String[] args) throws FileNotFoundException {
		//lo scenario SalvaSuFile sovrascrive i dati presenti, mentre questo li aggiunge
		
		List<Veicolo> veicoli=new ArrayList<Veicolo>();
		veicoli.add(new Veicolo("Toyota", "Corolla", 2018, 18000.0));
		veicoli.add(new Veicolo("Honda", "Civic", 2019, 20000.0));
        veicoli.add(new Veicolo("Ford", "Mustang", 2020, 30000.0));
        
        /*
         * true -> aggiunge
         * false -> sovrascrive
         */
        FileOutputStream fos=new FileOutputStream(new File("veicoli.txt"), true);
        PrintStream ps=new PrintStream(fos);
        for(Veicolo veicolo:veicoli)ps.println(veicolo);
        
        ps.close();
        System.out.println("***Scenario concluso con successo***");
	}

}
