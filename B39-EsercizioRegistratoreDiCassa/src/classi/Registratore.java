package classi;

public class Registratore {
	//cassa vuota
	public Registratore() {
		this.denaroInCassa = 0;
		this.numeroAcquisti = 0;
		this.restoPagamento = 0;
	}

	//cassa non vuota
	public Registratore(double denaroInCassa) {
		this.denaroInCassa = denaroInCassa;
		this.numeroAcquisti = 0;
		this.restoPagamento = 0;
	}

	public double getDenaroInCassa() {
		return denaroInCassa;
	}

	public int getNumeroAcquisti() {
		return numeroAcquisti;
	}

	public double getRestoPagamento() {
		return restoPagamento;
	}

	public void pagamento(Transazione t) {
		System.out.println("\nAcquisto in corso [Totale €"+t.getTotaleDovuto()+"]");

		System.out.println("L'acquirente ha pagato: €"+t.getPagamentoAcquirente());
		
		if (t.getPagamentoAcquirente()>t.getTotaleDovuto()) {
			restoPagamento=t.getPagamentoAcquirente()-t.getTotaleDovuto();
			System.out.println("Resto: €"+restoPagamento);
		}
		
		numeroAcquisti++; //incremento numero acquisti
		denaroInCassa+=t.getTotaleDovuto(); //aggiunta del denaro in cassa
	}

	public void riscuotiCassa() {
		System.out.println("\n\n***Riscuotendo cassa***");
		System.out.println("Numero acquisti registrati: "+numeroAcquisti);
		System.out.println("Denaro in cassa: €"+denaroInCassa);

		numeroAcquisti=0;
		denaroInCassa=0;
	}

	//Riassunto del pagamento
	@Override
	public String toString() {
		return "Registratore [denaroInCassa=" + denaroInCassa + ", numeroAcquisti=" + numeroAcquisti + "]";
	}

	private double denaroInCassa, restoPagamento;
	private int numeroAcquisti;
}
