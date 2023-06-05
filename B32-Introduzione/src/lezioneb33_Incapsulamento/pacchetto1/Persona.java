package lezioneb33_Incapsulamento.pacchetto1;

public class Persona {
	private String nome, cognome;
	
	Persona(String nome, String cognome) {
		this.nome=nome;
		this.cognome=cognome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void setNome(String nome) {
		this.nome=nome;//nome passato in parametro
	}
	
	public void setCognome(String cognome) {
		this.cognome=cognome;
	}
}
