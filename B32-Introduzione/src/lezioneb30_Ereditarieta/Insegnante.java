package lezioneb30_Ereditarieta;

public class Insegnante extends Persona{
	String materia;
	String[] classi= {"1D","2D","3D"};

	public Insegnante(String nome, String cognome, String materia) {
		super(nome, cognome); //super, sopra (come albero genealogico)
		this.materia=materia;
	}
	
	void insegna() {
		System.out.println("Sto insegnando...");
	}

}
