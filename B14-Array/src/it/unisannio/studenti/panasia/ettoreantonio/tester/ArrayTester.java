package it.unisannio.studenti.panasia.ettoreantonio.tester;

public class ArrayTester {

	public static void main(String[] args) {
		//Crea l'Array e lo inizializza
		int[] array= {5, 2, 8, 1, 9};
		
		//min e max con inizializzazione al primo elemento dell'array
		int max=array[0], min=array[0];
		
		//scansiona l'array per trovare il valore min e max
		for (int i = 1; i < array.length; i++) {
			if(array[i]>max) {
				max=array[i];
			} else if(array[i]<min) {
				min=array[i];
			}
		}
		
		//stampa a video
		System.out.println("Valore massimo: "+max); //9
		System.out.println("Valore minimo: "+min); //1
	}

}
