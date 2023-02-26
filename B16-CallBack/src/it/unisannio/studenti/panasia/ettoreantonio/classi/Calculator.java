package it.unisannio.studenti.panasia.ettoreantonio.classi;

public class Calculator {
	public void operate(double num1, double num2, Operation operation) {
		double result=operation.perform(num1, num2);
		System.out.println("Il risultato dell'operazione e': "+result);
	}
}
