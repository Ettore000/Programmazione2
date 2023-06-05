package lezioneb34_copiareOggetti.pacchetto1;

public class Persona {
	public Persona(String nome, String cognome) {
		this.nome=nome;
		this.cognome=cognome;
	}
	
	//copia tramite costruttore
	public Persona(Persona persona) {
		this.copy(persona);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + "]";
	}
	
	//copia tramite metodi
	public void copy(Persona persona) {
		this.setNome(persona.getNome()); //dal Main
		this.setCognome(persona.getCognome());
	}

	private String nome, cognome;
}
