package it.unisannio.studenti.panasia.ettoreantonio.classi;

import java.util.Stack;

public class ReverseStack {
	//il metodo statico prende come parametro uno Stack di interi
	public static Stack<Integer> reverse(Stack<Integer> stack) {
		//si crea un altro stack di interi
		Stack<Integer> reversedStack=new Stack<Integer>();
		
		//esegue il codice all'interno finché lo stack non è stato tutto scansionato
		while (!stack.isEmpty()) {
			//prende ogni elemento e in ordine cronologico li spinge in alto nella lista
			reversedStack.push(stack.pop());
			//ogni volta che si ripete il ciclo gli elementi che prima erano in cima scalano di una posizione
			//il metodo pop serve a estrarre l'elemento in cima allo stack di partenza
		}
		//alla fine del ciclo avremo come risultato in reversedStack lo stack inverso rispetto a stack
		
		return reversedStack;
	}
}
