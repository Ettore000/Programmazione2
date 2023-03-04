package it.unisannio.studenti.panasia.ettoreantonio.tester;

import java.util.Scanner;

import it.unisannio.studenti.panasia.ettoreantonio.classi.Auto;
import it.unisannio.studenti.panasia.ettoreantonio.classi.Camion;
import it.unisannio.studenti.panasia.ettoreantonio.classi.Moto;
import it.unisannio.studenti.panasia.ettoreantonio.classi.Veicolo;

public class VeicoloTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Inserisci la distanza percorsa in km: ");
		double distanza=sc.nextDouble();sc.nextLine(); //nextLine() viene chiamato subito dopo per pulire il buffer di input e passare alla prossima linea
		
		System.out.println("Inserisci il tipo di veicolo (auto, moto, camion): ");
		String tipoVeicolo = sc.next().toLowerCase();sc.nextLine();
		
		Veicolo veicolo=null;
		switch (tipoVeicolo) {
		case "auto":
			veicolo=new Auto();
			break;
		case "moto":
			veicolo=new Moto();
			break;
		case "camion":
			System.out.println("Inserisci il numero di assi: ");
			int numAssi=sc.nextInt();sc.nextLine();
			System.out.println("inserisci il peso del camion in tonnellate: ");
			double peso=sc.nextDouble();sc.nextLine();
			
			veicolo=new Camion(numAssi, peso);
			break;
		default:
			System.out.println("Tipo di veicolo non valido");
			System.exit(0);
			break;
		}
		double pedaggio=veicolo.calcolaPedaggio(distanza);
		System.out.println("Il pedaggio per il veicolo: "+veicolo.getTipoVeicolo()+" che ha percorso "+distanza+"km e' di euro "+pedaggio);
		sc.close();
	}

}
