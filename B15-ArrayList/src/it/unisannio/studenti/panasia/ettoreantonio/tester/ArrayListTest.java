package it.unisannio.studenti.panasia.ettoreantonio.tester;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Integer> numeri=new ArrayList<Integer>();
		
		numeri.add(1);
		numeri.add(2);
		numeri.add(3);
		numeri.add(4);
		numeri.add(5);
		numeri.add(6);
		numeri.add(7);
		numeri.add(8);
		numeri.add(9);
		
		ArrayList<Integer> numeriPari=new ArrayList<Integer>();
		
		for (int i = 0; i < numeri.size(); i++) {
			int numero=numeri.get(i);
			if (numero%2==0) {
				numeriPari.add(numero);
			}
		}
		
		System.out.println("Numeri: "+numeri); //[1, 2, 3, 4, 5, 6, 7, 8, 9]
		System.out.println("Numeri pari: "+numeriPari); //[2, 4, 6, 8]
	}

}
