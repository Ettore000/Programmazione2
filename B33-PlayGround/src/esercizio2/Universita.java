package esercizio2;

public class Universita {
	public Universita(Docente[] docenti) {
		this.docenti = new Docente[docenti.length];
	}
	
	public int etaMinima() {
		int min=docenti[0].getEta();
		for (int i = 0; i < docenti.length; i++) {
			docenti[i]=new Docente(docenti[i]);
		}
		
		return min;
	}

	private Docente[] docenti;
}
