package it.unisannio.studenti.panasia.ettoreantonio.classi;

public class Pasta extends ProdottoAlimentare {
	public Pasta(String nome, double prezzo, String formato) {
		super(nome, prezzo);
		this.formato = formato;
	}

	public String getFormato() {
		return formato;
	}

	@Override
	public void descrizioneProdotto() {
		System.out.println("Nome: "+getNome());
		System.out.println("Prezzo: "+getPrezzo());
		System.out.println("Formato: "+formato);

	}
	
	private String formato;
}
