package it.unisannio.studenti.panasia.ettoreantonio.tester;

import it.unisannio.studenti.panasia.ettoreantonio.classi.DownhillCurve;

public class DownhillCurveTest {

	public static void main(String[] args) {
		DownhillCurve curva=new DownhillCurve(20);
		
		double velocitaAttuale=25;
		double velocitaMassima=curva.attraversa(velocitaAttuale);
		
		System.out.println("Velocita' raggiunta sulla curva: " + velocitaAttuale + " m/s");
		System.out.println("Velocita' massima sulla curva: " + velocitaMassima + " m/s");
	}

}
