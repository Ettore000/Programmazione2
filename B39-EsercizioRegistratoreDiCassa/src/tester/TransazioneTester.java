package tester;

import classi.Registratore;
import classi.Transazione;

/**
 * TransazioneTester: test driver della classe transazione
 */
public class TransazioneTester {

	public static void main(String[] args) {
		Registratore r=new Registratore();
		
		Transazione t1=new Transazione(75.24, 100);
		Transazione t2=new Transazione(29.14, 30.1);
		Transazione t3=new Transazione(2.5, 5.5);
		
		r.pagamento(t1);
		r.riscuotiCassa();
		
		r.pagamento(t2);
		r.pagamento(t3);
		r.riscuotiCassa();
	}

}
