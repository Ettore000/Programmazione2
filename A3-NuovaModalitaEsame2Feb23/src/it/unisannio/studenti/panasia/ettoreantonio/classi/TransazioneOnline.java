package it.unisannio.studenti.panasia.ettoreantonio.classi;

import java.io.PrintStream;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TransazioneOnline extends Transazione {
	public TransazioneOnline(int id, Date data, String ip) {
		super(id, data);
		this.ip=ip;
	}

	public String getIp(){
		return ip;
	}

	public static TransazioneOnline read() {
		Scanner sc=new Scanner(System.in);

		int id=0;
		SimpleDateFormat sdf=new SimpleDateFormat("ddMMyyyy");
		Date data=null;
		String input="", ip="";
		try {
			System.out.print("ID: ");
			id=sc.nextInt();sc.nextLine();
			if(id<0)return null;

			System.out.print("Data (GGMMAAAA): ");
			input=sc.nextLine();
			data=sdf.parse(input);
			if(data==null)return null;

			System.out.print("IP (xxx.xxx.xxx.xxx): ");
			ip=sc.nextLine();
			if(ip.equals(""))return null;
		} catch (ParseException e) {
			//TODO
            System.err.println("Errore: la data inserita non è nel formato corretto.");
			e.printStackTrace();
			return null; //in questo modo se si verifica questa eccezione il programma non inserisce la nuova istanza
		} catch () {
		return new TransazioneOnline(id, data, ip);
	}

	public static TransazioneOnline readFile(Scanner sc){
		if(!sc.hasNextInt())return null;
		int id=sc.nextInt();

		if(!sc.hasNext())return null;
		String input=sc.next();
		SimpleDateFormat sdf=new SimpleDateFormat("ddMMyyyy");
		Date data=null;
		try {
			data=sdf.parse(input);
		} catch (ParseException e) {
			// TODO
			e.printStackTrace();
		}

		if(!sc.hasNext())return null;
		String ip=sc.next();

		return new TransazioneOnline(id, data, ip);
	}

	@Override
	public void print() {
		System.out.println("'o' "+getId()+" "+getData()+" "+ip);
		for(Libro libro:getLibri())System.out.println(libro);
		System.out.println();
	}

	@Override
	public void print(PrintStream nomeFile) {
		nomeFile.println("'o' "+getId()+" "+getData()+" "+ip+"\n");
		for(Libro libro:getLibri())nomeFile.println(libro);
		nomeFile.println();
	}

	private String ip;
}
