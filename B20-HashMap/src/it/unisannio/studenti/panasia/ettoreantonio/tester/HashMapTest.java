package it.unisannio.studenti.panasia.ettoreantonio.tester;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, Integer> voti=new HashMap<String, Integer>();
		
		voti.put("Alice", 95);
		voti.put("Bob", 80);
		voti.put("Charlie", 75);
		voti.put("Dave", 90);
		voti.put("Eve", 85);
        
        System.out.println("Voti: ");
        for(String studente: voti.keySet()) {
        	int voto=voti.get(studente);
        	System.out.println(studente+": "+voto);
        }
	}

}
