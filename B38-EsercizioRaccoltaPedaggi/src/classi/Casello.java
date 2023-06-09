/**
 * Modella la raccolta dei pedaggi
 */

package classi;

public class Casello {
	//casello standard
	public Casello() {
		this.costoPerAsse=5;
		this.costoPerTonnellata=10*2; //$10 per ogni mezza tonnellata
		this.numeroTransitiNonRiscossi=0;
		this.denaroNonRiscosso=0;

	}

	//quando si specifica il costo per asse e il costo per tonnellata
	public Casello(double costoPerAsse, double costoPerTonnellata) {
		this.costoPerAsse=costoPerAsse;
		this.costoPerTonnellata=costoPerTonnellata;
		this.numeroTransitiNonRiscossi=0;
		this.denaroNonRiscosso=0;

	}

	public double getCostoPerAsse() {
		return costoPerAsse;
	}

	//dando la possibilità di modificare il costo per asse durante il periodo di funzionamento del casello
	public void setCostoPerAsse(double costoPerAsse) {
		this.costoPerAsse = costoPerAsse;
	}

	public double getCostoPerTonnellata() {
		return costoPerTonnellata;
	}

	//dando la possibilità di modificare il costo per tonnellata durante il periodo di funzionamento del casello
	public void setCostoPerTonnellata(double costoPerTonnellata) {
		this.costoPerTonnellata = costoPerTonnellata;
	}

	public int getNumeroTransitiNonRiscossi() {
		return numeroTransitiNonRiscossi;
	}

	public double getDenaroNonRiscosso() {
		return denaroNonRiscosso;
	}

	public void calcolaPedaggio(Camion c) {
		System.out.println("Camion in transito [numero assi="+c.getNumeroAssi()+", peso="+c.getPeso()+"]");

		double pedaggio=(c.getNumeroAssi()*costoPerAsse)+((c.getPeso()/1000)*costoPerTonnellata);

		System.out.println("Pedaggio: €"+pedaggio);

		numeroTransitiNonRiscossi++; //incrementa di un'unità il numero di camion transitati
		denaroNonRiscosso+=pedaggio; //somma al denaro in cassa il pedaggio raccolto dal camion in transito
	}

	//quando il casellante richiede la visualizzazione dei dati registrati dall'ultima riscossione dalla cassa
	public void transitiNonRiscossi() {
		System.out.println("Numero transiti non riscossi: "+numeroTransitiNonRiscossi);
		System.out.println("Denaro non riscosso: €"+denaroNonRiscosso);

	}

	public void riscuotiTransiti() {
		System.out.println("***Riscuotendo cassa***");
		System.out.println("Numero camion transitati: "+numeroTransitiNonRiscossi);
		System.out.println("Denaro in cassa: €"+denaroNonRiscosso);

		//azzerando i valori
		numeroTransitiNonRiscossi=0;
		denaroNonRiscosso=0;
	}

	private double costoPerAsse, costoPerTonnellata, denaroNonRiscosso;
	private int numeroTransitiNonRiscossi;
}
