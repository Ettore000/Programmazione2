package it.unisannio.studenti.panasia.ettoreantonio.tester;

import java.util.Stack;

import it.unisannio.studenti.panasia.ettoreantonio.classi.ReverseStack;

public class ReverseStackTest {

	public static void main(String[] args) {
		//Si crea lo stack iniziale
		Stack<Integer> stack=new Stack<Integer>();
		
		//Si inseriscono degli elementi
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		//si stampa lo stack iniziale
		System.out.println("Stack originale: "+stack); //Stack originale: [1, 2, 3]
		
		//si istanzia la classe ReverseStack e si invoca il metodo statico reverse immettendo come input il nostro Stack iniziale
		Stack<Integer> reversedStack=ReverseStack.reverse(stack);
		
		//stampiamo lo stack invertito, risultato dall'identificatore di istanza reversedStack
		System.out.println("Stack invertito: "+reversedStack); //Stack invertito: [3, 2, 1]
	}

}
