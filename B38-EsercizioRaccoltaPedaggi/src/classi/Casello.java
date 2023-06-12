package classi;

/**
 * Casello: modella la raccolta dei pedaggi
 */
public class Casello {
	/**
	 * Crea un casello con parametri standard non modificabili
	 */
	public Casello() {
		this.costoPerAsse=5;
		this.costoPerTonnellata=10*2; //$10 per ogni mezza tonnellata
		this.numeroTransitiNonRiscossi=0;
		this.denaroNonRiscosso=0;

	}

	/**
	 * Crea un casello specificando il costo per asse e il costo per tonnellata
	 * @param costoPerAsse
	 * @param costoPerTonnellata
	 */
	public Casello(double costoPerAsse, double costoPerTonnellata) {
		this.costoPerAsse=costoPerAsse;
		this.costoPerTonnellata=costoPerTonnellata;
		this.numeroTransitiNonRiscossi=0;
		this.denaroNonRiscosso=0;

	}

	/**
	 * Ottiene il costo per asse
	 * @return costoPerAsse
	 */
	public double getCostoPerAsse() {
		return costoPerAsse;
	}

	/**
	 * Modifica il costo per asse durante il periodo di funzionamento del casello
	 * @param costoPerAsse
	 */
	public void setCostoPerAsse(double costoPerAsse) {
		this.costoPerAsse = costoPerAsse;
	}

	/**
	 * Ottiene il costo per tonnellata
	 * @return costoPerTonnellata
	 */
	public double getCostoPerTonnellata() {
		return costoPerTonnellata;
	}

	/**
	 * Modifica il costo per tonnellata durante il periodo di funzionamento del casello
	 * @param costoPerTonnellata
	 */
	public void setCostoPerTonnellata(double costoPerTonnellata) {
		this.costoPerTonnellata = costoPerTonnellata;
	}

	/**
	 * Ottiene il numero di camion transitati dall'ultima riscossione della cassa
	 * @return numeroTransitiNonRiscossi
	 */
	public int getNumeroTransitiNonRiscossi() {
		return numeroTransitiNonRiscossi;
	}

	/**
	 * Ottiene il denaro contenuto nella cassa accumulato dall'ultima riscossione
	 * @return denaroNonRiscosso
	 */
	public double getDenaroNonRiscosso() {
		return denaroNonRiscosso;
	}

	/**
	 * Calcola il pedaggio per un camion in base al numero di assi e al peso;
	 * Incrementa di uno il numero di camion transitati;
	 * Aggiunge il denaro ricavato alla cassa
	 * @param c
	 */
	public void calcolaPedaggio(Camion c) {
		System.out.println("Camion in transito [numero assi="+c.getNumeroAssi()+", peso="+c.getPeso()+"]");

		double pedaggio=(c.getNumeroAssi()*costoPerAsse)+((c.getPeso()/1000)*costoPerTonnellata);

		System.out.println("Pedaggio: €"+pedaggio);

		numeroTransitiNonRiscossi++; //incrementa di un'unità il numero di camion transitati
		denaroNonRiscosso+=pedaggio; //somma al denaro in cassa il pedaggio raccolto dal camion in transito
	}

	/**
	 * Visualizzazione su schermo dei dati registrati dall'ultima riscossione della cassa,
	 * ovvero: il numero dei camion transitati e il denaro raccolto in cassa
	 */
	public void transitiNonRiscossi() {
		System.out.println("Numero transiti non riscossi: "+numeroTransitiNonRiscossi);
		System.out.println("Denaro non riscosso: €"+denaroNonRiscosso);

	}

	/**
	 * Riscosssione del denaro in cassa;
	 * La cassa viene svuotata e viene azzerato il valore del numero dei camion transitati
	 */
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
