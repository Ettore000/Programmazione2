/* Lezione 41
 * - HashMap
 * 
 * - cosa sono
 * - crearne una
 * - aggiungere elementi
 * - accedere agli elementi
 * - rimuovere un elemento
 * - pulire HashMap
 */

package lezioneb41_HashMap;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		//a differenza delle ArrayList, le HashMap ci permettono di salvare gli elementi come chiave valore
		HashMap<String, String> capitali=new HashMap<String, String>();
		
		capitali.put("Italia", "Roma");
		capitali.put("Inghilterra", "Londra");
		capitali.put("Germania", "Berlino");
		capitali.put("Francia", "Parigi");
		
		System.out.println(capitali.get("Germania"));
		System.out.println(capitali.get("Italia"));
		
		System.out.println(capitali);
		
		capitali.remove("Francia");
		System.out.println(capitali);
		
		capitali.clear(); //pulisce tutto l'array
		System.out.println(capitali);
	}

}
