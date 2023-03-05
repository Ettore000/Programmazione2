package classi;

public class Persona {
	public Persona(String nome, String cognome, Bicicletta bicicletta) {
		this.nome = nome;
		this.cognome = cognome;
		this.bicicletta = bicicletta;
	}
	
	public String getNome() {
		return nome;
	}
	public String getCognome() {
		return cognome;
	}
	public Bicicletta getBicicletta() {
		return bicicletta;
	}

	private String nome, cognome;
	private Bicicletta bicicletta;
}
