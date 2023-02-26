package it.unisannio.studenti.panasia.ettoreantonio.classi;

public class Dolce extends ProdottoAlimentare {
	public Dolce(String nome, double prezzo, String gusto) {
		super(nome, prezzo);
		this.gusto = gusto;
	}

	public String getGusto() {
		return gusto;
	}

	@Override
	public void descrizioneProdotto() {
		System.out.println("Nome: "+getNome());
		System.out.println("Prezzo: "+getPrezzo());
		System.out.println("Gusto: "+gusto);

	}
	
	private String gusto;
}
