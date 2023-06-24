package tester;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import classi.Registro;
import util.Costante;

/**
 * Test driver della classe Registro
 */
public class RegistroTester {

	public static void main(String[] args) throws FileNotFoundException {
		Registro registro=new Registro(new Scanner(new File(Costante.FILE_STUDENTI)), new Scanner(new File(Costante.FILE_ESAMI)));
		
		registro.
	}

}
