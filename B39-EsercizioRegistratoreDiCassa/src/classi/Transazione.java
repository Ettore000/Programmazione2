package classi;

/**
 * Transazione: modella una transazione
 */
public class Transazione {
	/**
	 * Crea una transazione specificando il totale dovuto per la spesa e i soldi con cui l'acquirente paga
	 * @param totaleDovuto
	 * @param pagamentoAcquirente
	 */
	public Transazione(double totaleDovuto, double pagamentoAcquirente) {
		this.totaleDovuto = totaleDovuto;
		this.pagamentoAcquirente=pagamentoAcquirente;
	}

	/**
	 * Ottiene il totale dovuto per la spesa
	 * @return totaleDovuto
	 */
	public double getTotaleDovuto() {
		return totaleDovuto;
	}
	
	/**
	 * Ottiene il pagamento dell'acquirente
	 * @return pagamentoAcquirente
	 */
	public double getPagamentoAcquirente() {
		return pagamentoAcquirente;
	}

	private double totaleDovuto, pagamentoAcquirente;
}
