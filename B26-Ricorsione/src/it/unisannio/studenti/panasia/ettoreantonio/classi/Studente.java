package it.unisannio.studenti.panasia.ettoreantonio.classi;

import java.util.ArrayList;

public class Studente {
	public Studente(String nome, int matricola, ArrayList<Esame> esami) {
		this.nome = nome;
		this.matricola = matricola;
		this.esami = esami;
	}
	
	public String getNome() {
		return nome;
	}
	public int getMatricola() {
		return matricola;
	}
	public ArrayList<Esame> getEsami() {
		return esami;
	}
	
	public double mediaVoti() {
		return mediaVotiHelper(esami, 0, 0);
	}
	
	public double mediaVotiHelper(ArrayList<Esame> esami, int indice, double somma) {
		if(indice==esami.size())return somma/esami.size();
		somma+=esami.get(indice).getVoto();
		
		return mediaVotiHelper(esami, indice+1, somma);
	}
	
	private String nome;
	private int matricola;
	private ArrayList<Esame> esami;
}
