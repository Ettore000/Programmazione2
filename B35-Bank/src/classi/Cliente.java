package classi;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Modella un cliente
 *
 */
public class Cliente implements Comparable<Cliente>{
	
	/**
	 * Crea un cliente
	 * @param id
	 * @param nome
	 * @param cognome
	 */
	public Cliente(String id, String nome, String cognome) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
	}

	/**
	 * Ottiene un ID cliente
	 * @return id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Ottiene un nome
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Ottiene un cognome
	 * @return cognome
	 */
	public String getCognome() {
		return cognome;
	}
	
	/**
	 * Legge un cliente da tastiera
	 * @return Cliente(id, nome, cognome)
	 */
	public static Cliente read() {
		Scanner sc=new Scanner(System.in);
		String id="", nome="", cognome="";
		
		System.out.print("ID: ");
		id=sc.nextLine();
		if(id.equals(""))return null;
		
		System.out.print("Nome: ");
		nome=sc.nextLine();
		if(nome.equals(""))return null;
		
		System.out.print("Cognome: ");
		cognome=sc.nextLine();
		if(cognome.equals(""))return null;
		
		return new Cliente(id, nome, cognome);
	}
	
	/**
	 * Legge un cliente da file
	 * @param sc
	 * @return Cliente(id, nome, cognome)
	 */
	public static Cliente read(Scanner sc) {
		String id="", nome="", cognome="";
		
		if(!sc.hasNext())return null;
		id=sc.next();
		
		if(!sc.hasNext())return null;
		nome=sc.next();
		
		if(!sc.hasNext())return null;
		cognome=sc.next();
		
		return new Cliente(id, nome, cognome);
	}
	
	/**
	 * Riassume un cliente
	 * @return String
	 */
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", cognome=" + cognome + "]";
	}

	/**
	 * Visualizza un cliente
	 * @return System.out
	 */
	public void print() {
		System.out.println(id+" "+nome+" "+cognome);
	}
	
	/**
	 * Scrive un cliente su file
	 * @param ps
	 */
	public void print(PrintStream ps) {
		ps.println(id+" "+nome+" "+cognome);
	}
	
	/**
	 * TODO
	 */
	@Override
	public int hashCode() {
		return 0;
		//TODO
	}
	
	/**
	 * Confronta due clienti - ottiene true se due id sono uguali
	 * @param c
	 * @return boolean
	 */
	public boolean equals(Cliente c) {
		if(id.equals(c.id))
			return true;
		return false;
	}
	
	/**
	 * Confronta due clienti - ottiene 0 se due id sono uguali
	 */
	@Override
	public int compareTo(Cliente c) {
		if(!id.equals(c.id))
			return id.compareTo(c.id);
		return id.compareTo(c.getId());
	}

	private String id, nome, cognome;
}
