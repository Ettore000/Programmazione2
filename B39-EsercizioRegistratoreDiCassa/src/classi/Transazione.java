package classi;

public class Transazione {
	public Transazione(double totaleDovuto, double pagamentoAcquirente) {
		this.totaleDovuto = totaleDovuto;
		this.pagamentoAcquirente=pagamentoAcquirente;
	}

	public double getTotaleDovuto() {
		return totaleDovuto;
	}
	
	public double getPagamentoAcquirente() {
		return pagamentoAcquirente;
	}

	private double totaleDovuto, pagamentoAcquirente;
}
