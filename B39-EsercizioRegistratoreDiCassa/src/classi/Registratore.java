package classi;

/**
 * Registratore: modella il comportamento di un registratore di cassa
 */
public class Registratore {
	/**
	 * Crea un registratore di cassa senza denaro all'interno
	 */
	public Registratore() {
		this.denaroInCassa = 0;
		this.numeroAcquisti = 0;
	}

	/**
	 * Crea un registratore di cassa specificando quanto denaro c'è all'interno
	 * @param denaroInCassa
	 */
	public Registratore(double denaroInCassa) {
		this.denaroInCassa = denaroInCassa;
		this.numeroAcquisti = 0;
	}

	/**
	 * Ottiene il valore del denaro in cassa dall'ultima riscossione
	 * @return denaroInCassa
	 */
	public double getDenaroInCassa() {
		return denaroInCassa;
	}

	/**
	 * Ottiene il numero degli acquisti registrati dall'ultima riscossione
	 * @return numeroAcquisti
	 */
	public int getNumeroAcquisti() {
		return numeroAcquisti;
	}

	/**
	 * Registra il pagamento,
	 * calcola il resto,
	 * incrementa di uno il numero degli acquisti registrati,
	 * aggiunge il denaro in cassa
	 * @param t
	 */
	public void pagamento(Transazione t) {
		System.out.println("\nAcquisto in corso [Totale €"+t.getTotaleDovuto()+"]");
		System.out.println("L'acquirente ha pagato: €"+t.getPagamentoAcquirente());
		
		double restoPagamento;
		if (t.getPagamentoAcquirente()>t.getTotaleDovuto()) {
			restoPagamento=t.getPagamentoAcquirente()-t.getTotaleDovuto();
			System.out.println("Resto: €"+restoPagamento);
		}
		
		numeroAcquisti++; //incremento numero acquisti
		denaroInCassa+=t.getTotaleDovuto(); //aggiunta del denaro in cassa
	}

	/**
	 * Riscuote la cassa e azzera il numero degli acquisti registrati
	 */
	public void riscuotiCassa() {
		System.out.println("\n\n***Riscuotendo cassa***");
		System.out.println("Numero acquisti registrati: "+numeroAcquisti);
		System.out.println("Denaro in cassa: €"+denaroInCassa);

		numeroAcquisti=0;
		denaroInCassa=0;
	}

	/**
	 * Riassume il registratore di cassa
	 */
	@Override
	public String toString() {
		return "Registratore [denaroInCassa=" + denaroInCassa + ", numeroAcquisti=" + numeroAcquisti + "]";
	}

	private double denaroInCassa;
	private int numeroAcquisti;
}
