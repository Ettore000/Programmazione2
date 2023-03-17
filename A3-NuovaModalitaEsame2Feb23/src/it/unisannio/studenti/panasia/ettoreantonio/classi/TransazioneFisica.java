package it.unisannio.studenti.panasia.ettoreantonio.classi;

import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TransazioneFisica extends Transazione {
	public TransazioneFisica(int id, Date data, String citta) {
		super(id, data);
		this.citta=citta;
	}

	public String getCitta(){
		return citta;
	}

	public static TransazioneFisica read() {
		Scanner sc=new Scanner(System.in);

		int id=0;
		SimpleDateFormat sdf=new SimpleDateFormat("ddMMyyyy");
		Date data=null;
		String citta="", input="";
		try {
			System.out.print("ID: ");
			//legge il tipo Int e va a capo
			id=sc.nextInt();sc.nextLine();
			//non può esistere un ID negativo
			if(id<0)return null;

			System.out.print("Data (GGMMAAAA): ");
			input=sc.nextLine();
			data=sdf.parse(input);
			if(data==null)return null;

			System.out.print("Citta': ");
			citta=sc.nextLine();
			if(citta.equals(""))return null;
		} catch (ParseException e) {
			//TODO aggiusta tutte le gestioni delle exception
			System.err.println("Errore nella registrazione di una transazione fisica");
			e.printStackTrace();
		}
		return new TransazioneFisica(id, data, citta);
	}

	public static TransazioneFisica read(Scanner sc){
		if(!sc.hasNextInt())return null;
		int id=sc.nextInt();

		if(!sc.hasNext())return null;
		String input=sc.next();
		SimpleDateFormat sdf=new SimpleDateFormat("ddMMyyyy");
		Date data=null;
		try {
			data = sdf.parse(input);
		} catch (ParseException e) {
			// TODO
			e.printStackTrace();
		}

		if(!sc.hasNext())return null;
		String citta=sc.next();

		return new TransazioneFisica(id, data, citta);
	}

	@Override
	public void print() {
		System.out.println("'f' "+getId()+" "+getData()+" "+citta);
		for(Libro libro:getLibri())System.out.println(libro);
		System.out.println();
	}

	@Override
	public void print(PrintStream ps) {
		ps.println("'f' "+getId()+" "+getData()+" "+citta+"\n");
		for(Libro libro:getLibri())ps.println(libro);
		ps.println();
	}

	private String citta;
}
