package it.unisannio.studenti.panasia.ettoreantonio.classi;

public class Employee {
	public Employee(String nome, double salarioOrario, double oreLavorate) {
		this.nome = nome;
		this.salarioOrario = salarioOrario;
		this.oreLavorate = oreLavorate;
	}
	
	public String getNome() {
		return nome;
	}
	public double getSalarioOrario() {
		return salarioOrario;
	}
	public double getOreLavorate() {
		return oreLavorate;
	}
	
	public double pagamento() {
		return salarioOrario*oreLavorate;
	}
	
	private String nome;
	private double salarioOrario, oreLavorate;
}
