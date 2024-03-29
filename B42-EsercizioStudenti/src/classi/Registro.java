package classi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

import util.Costante;
import util.EsameComparator;
import util.StudenteComparator;
import util.StudenteComparatorByNumeroEsami;
import util.StudenteNonTrovatoException;

/**
 * Modella un registro contenente studenti e esami
 */
public class Registro {
	/**
	 * Crea un registro
	 * @param scStudente
	 * @param scEsami
	 */
	public Registro(Scanner scStudente, Scanner scEsami) {
		this.studenti=new ArrayList<Studente>();
		this.esami=new ArrayList<Esame>();

		Studente s=Studente.read(scStudente);
		while (s!=null) {
			studenti.add(s);
			s=Studente.read(scStudente);
		}

		Esame e=Esame.read(scEsami);
		while (e!=null) {
			//si vuole trovare uno studente attraverso la matricola
			Studente studenteTrovato=findStudenteByMatricola(e.getMatricolaStudente());
			e.setStudente(studenteTrovato); //si imposta lo studente trovato a un esame
			studenteTrovato.addEsame(e); //viene aggiunto un esame alla lista esami dello studente trovato
			esami.add(e); //un esame viene aggiunto alla lista esami
			e=Esame.read(scEsami);
		}
	}

	/**
	 * Crea un registro filtrato
	 * @param studentiFilter
	 * @param esamiFilter
	 */
	private Registro(List<Studente> studentiFilter, List<Esame> esamiFilter) {
		this.studenti=studentiFilter;
		this.esami=esamiFilter;
	}

	/**
	 * Cerca uno studente in base alla matricola
	 * @param matricola
	 * @return Studente
	 */
	public Studente findStudenteByMatricola(String matricola) {
		for (Studente studente : studenti) {
			if(studente.getMatricola().equals(matricola))
				return studente;
		}
		throw new StudenteNonTrovatoException("Lo studente ricercato non esiste");
	}

	/**
	 * Filtra gli studenti in base al nome
	 * @param materia
	 * @return Registro
	 */
	public Registro filterStudentiByNome(String nome) {
		List<Studente> studentiFilter=new ArrayList<Studente>();
		List<Esame> esamiFilter=new ArrayList<Esame>();

		for (Studente studente : studenti) {
			if(studente.getNome().equalsIgnoreCase(nome)) {
				studentiFilter.add(studente); 
				esamiFilter.addAll(studente.getEsami());
			}
		}
		return new Registro(studentiFilter, esamiFilter);
	}

	/**
	 * Filtra gli studenti in base al cognome
	 * @param cognome
	 * @return Registro
	 */
	public Registro filterStudentiByCognome(String cognome) {
		List<Studente> studentiFilter=new ArrayList<Studente>();
		List<Esame> esamiFilter=new ArrayList<Esame>();

		for (Studente studente : studenti) {
			if(studente.getCognome().equalsIgnoreCase(cognome)) {
				studentiFilter.add(studente);
				esamiFilter.addAll(studente.getEsami());
			}
		}
		return new Registro(studentiFilter, esamiFilter);
	}

	/**
	 * Filtra gli studenti in base alla matricola
	 * @param matricola
	 * @return Registro
	 */
	public Registro filterStudentiByMatricola(String matricola) {
		List<Studente> studentiFilter=new ArrayList<Studente>();
		List<Esame> esamiFilter=new ArrayList<Esame>();

		for (Studente studente : studenti) {
			if(studente.getMatricola().equals(matricola)) {
				studentiFilter.add(studente);
				esamiFilter.addAll(studente.getEsami());
			}
		}
		return new Registro(studentiFilter, esamiFilter);
	}

	/**
	 * Filtra gli esami in base alla materia
	 * @param materia
	 * @return Registro
	 */
	public Registro filterEsamiByMateria(String materia) {
		List<Studente> studentiFilter=new ArrayList<Studente>();
		List<Esame> esamiFilter=new ArrayList<Esame>();

		for(Esame esame : esami) {
			if(esame.getMateria().equalsIgnoreCase(materia)) {
				esamiFilter.add(esame);
				studentiFilter.add(esame.getStudente());
			}
		}
		return new Registro(studentiFilter, esamiFilter);
	}

	/**
	 * Filtra gli esami in base al voto
	 * @param voto
	 * @return Registro
	 */
	public Registro filterEsamiByVoto(int voto) {
		List<Studente> studentiFilter=new ArrayList<Studente>();
		List<Esame> esamiFilter=new ArrayList<Esame>();

		for (Esame esame : esami) {
			if(esame.getVoto()==voto) {
				esamiFilter.add(esame);
				studentiFilter.add(esame.getStudente());
			}
		}
		return new Registro(studentiFilter, esamiFilter);
	}
	
	/**
	 * Filtra gli esami con voto inferiore al parametro
	 * @param voto
	 * @return Registro
	 */
	public Registro filterEsamiByVotoInf(int voto) {
		List<Studente> studentiFilter=new ArrayList<Studente>();
		List<Esame> esamiFilter=new ArrayList<Esame>();

		for (Esame esame : esami) {
			if(esame.getVoto()<voto) {
				esamiFilter.add(esame);
				studentiFilter.add(esame.getStudente());
			}
		}
		return new Registro(studentiFilter, esamiFilter);
	}
	
	/**
	 * Filtra gli esami con voto superiore a al parametro
	 * @param voto
	 * @return Registro
	 */
	public Registro filterEsamiByVotoSup(int voto) {
		List<Studente> studentiFilter=new ArrayList<Studente>();
		List<Esame> esamiFilter=new ArrayList<Esame>();

		for (Esame esame : esami) {
			if(esame.getVoto()>voto) {
				esamiFilter.add(esame);
				studentiFilter.add(esame.getStudente());
			}
		}
		return new Registro(studentiFilter, esamiFilter);
	}

	/**
	 * Filtra gli esami in base alla matricola dello studente segnata nell'esame
	 * @param matricolaStudente
	 * @return Registro
	 */
	public Registro filterEsamiByMatricolaStudente(String matricolaStudente) {
		List<Studente> studentiFilter=new ArrayList<Studente>();
		List<Esame> esamiFilter=new ArrayList<Esame>();

		for (Esame esame : esami) {
			if(esame.getMatricolaStudente().equals(matricolaStudente)) {
				esamiFilter.add(esame);
				studentiFilter.add(esame.getStudente());
			}
		}
		return new Registro(studentiFilter, esamiFilter);
	}

	/**
	 * Ordina gli studenti in base al cognome
	 */
	public void sortStudentiByCognome() {
		Comparator<Studente> compStudente=new StudenteComparator();
		TreeSet<Studente> treeStudenti=new TreeSet<Studente>(compStudente);
		
		for (Studente studente : studenti) {
			treeStudenti.add(studente);
		}
		for (Studente studente : treeStudenti) {
			studente.print();
		}
	}
	
	/**
	 * Ordina gli studenti in base al numero di esami superati
	 */
	public void sortStudentiByNumeroEsamiSuperati() {
		Comparator<Studente> compStudente=new StudenteComparatorByNumeroEsami();
		TreeSet<Studente> treeStudenti=new TreeSet<Studente>(compStudente);
		
		for (Studente studente : studenti) {
			treeStudenti.add(studente);
		}
		for (Studente studente : treeStudenti) {
			System.out.println("Studente: "+studente.getNome()+" "+studente.getCognome()+", esami superati="+studente.getNumeroEsami());
		}
	}

	/**
	 * Ordina gli esami in base alla materia, al voto e alla matricola degli studenti
	 */
	public void sortEsamiByMateria() {
		Comparator<Esame> compEsame = new EsameComparator();
		
		TreeSet<Esame> treeEsami = new TreeSet<Esame>(compEsame);
		
		for(Esame esame : esami) {
			treeEsami.add(esame);
		}
		for(Esame esame : treeEsami) {
			esame.print();
		}
	}

	/**
	 * Ottiene la media dei voti degli esami svolti da uno studente
	 * @return votoMedio
	 */
	public double getVotoMedio() {
		double votoMedio=0;
		int conta=0, somma=0;

		for (Esame esame : esami) {
			somma+=esame.getVoto();
			conta++;
		}
		votoMedio=somma/conta;

		return votoMedio;
	}

	/**
	 * Ottiene il voto con valore massimo
	 * @return votoMassimo
	 */
	public int getVotoMassimo() {
		int votoMassimo=Costante.VOTO_MINIMO;

		for (Esame esame : esami) {
			if(esame.getVoto()>votoMassimo)
				votoMassimo=esame.getVoto();
		}

		return votoMassimo;
	}

	/**
	 * Ottiene il voto con valore minimo
	 * @return votoMinimo
	 */
	public int getVotoMinimo() {
		int votoMinimo=Costante.VOTO_MASSIMO;

		for (Esame esame : esami) {
			if(esame.getVoto()<votoMinimo)
				votoMinimo=esame.getVoto();
		}

		return votoMinimo;
	}

	/**
	 * Visualizza su schermo una lista di studenti
	 */
	public void printStudenti() {
		System.out.println("Studenti");
		for (Studente studente : studenti) {
			studente.print();
		}
	}

	/**
	 * Visualizza su schermo una lista di esami
	 */
	public void printEsami() {
		System.out.println("Esami");
		for (Esame esame : esami) {
			esame.print();
		}
	}

	/**
	 * Visualizza su schermo una lista di studenti e una lista di esami
	 */
	public void print() {
		printStudenti();
		printEsami();
	}

	private List<Studente> studenti;
	private List<Esame> esami;
}
