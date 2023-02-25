package it.unisannio.studenti.panasia.ettoreantonio.classi;

public class Pane extends ProdottoAlimentare {
	public Pane(String nome, double prezzo, String tipo) {
		super(nome, prezzo);
		this.tipo=tipo;
	}

	public String getTipo() {
		return tipo;
	}

	@Override
	public void descrizioneProdotto() {
		System.out.println("Nome: "+getNome());
		System.out.println("Prezzo: "+getPrezzo());
		System.out.println("Tipo: "+tipo);

	}
	
	private String tipo;
}
