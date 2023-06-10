package classi;

import java.io.PrintStream;
import java.util.Scanner;

public class Nome {
	public Nome(String titolo, String cognome, String nome) {
		this.titolo = titolo;
		this.cognome = cognome;
		this.nome = nome;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getIiniziali() {
		char inizialiNome=nome.charAt(0);
		char inizialiCognome=cognome.charAt(0);

		String iniziali=String.valueOf(inizialiNome) + String.valueOf(inizialiCognome);

		return iniziali;
	}

	@Override
	public String toString() {
		return "Nome [titolo=" + titolo + ", cognome=" + cognome + ", nome=" + nome + "]";
	}

	//input da tastiera
	public static Nome read() {
		String titolo="non determinabile", cognome="non determinabile", nome="non determinabile";
		
		try {
			Scanner sc=new Scanner(System.in);

			System.out.println("Titolo: ");
			titolo=sc.nextLine();
			if(titolo.equals(""))return null;

			System.out.println("Cognome: ");
			cognome=sc.nextLine();
			if(cognome.equals(""))return null;

			System.out.println("Nome: ");
			nome=sc.nextLine();
			if(nome.equals(""))return null;
		} catch (NullPointerException e) {
			System.err.println("Dati in lettura da tastiera non conformi");
		}

		return new Nome(titolo, cognome, nome);
	}

	//input da file
	public static Nome read(Scanner sc) {
		String titolo="non determinabile", cognome="non determinabile", nome="non determinabile";

		try {
			titolo=sc.next();
			if(!sc.hasNext())return null; //controllo di fine input

			cognome=sc.next();
			if(!sc.hasNext())return null;

			nome=sc.next();
			if(!sc.hasNext())return null;
		} catch (NullPointerException e) {
			System.err.println("Dati in lettura da file non conformi");
		}

		return new Nome(titolo, cognome, nome);
	}

	//scrittura su file
	public void print(PrintStream ps) {
		ps.print(titolo+" "+cognome+" "+nome+"\n");
	}

	private String titolo, cognome, nome;
}
