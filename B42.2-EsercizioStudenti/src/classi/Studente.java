package classi;

import java.util.ArrayList;
import java.util.List;

public class Studente implements Comparable<Studente>{
	public Studente(String nome, String cognome, String matricola) {
		this.nome = nome;
		this.cognome = cognome;
		this.matricola = matricola;
		this.esami = new ArrayList<Esame>();
	}
	
	public String getNome() {
		return nome;
	}
	public String getCognome() {
		return cognome;
	}
	public String getMatricola() {
		return matricola;
	}
	public List<Esame> getEsami() {
		return esami;
	}
	
	public void addEsame(Esame e) {
		esami.add(e);
	}
	
	public void removeEsame(Esame e) {
		esami.remove(e);
	}

	@Override
	public int compareTo(Studente s) {
		if(!cognome.equalsIgnoreCase(s.getCognome()))
			return cognome.compareToIgnoreCase(s.getCognome());
		if(!nome.equalsIgnoreCase(s.getNome()))
			return nome.compareToIgnoreCase(s.getNome())
	}

	private String nome, cognome, matricola;
	private List<Esame> esami;
}
