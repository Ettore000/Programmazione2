package it.unisannio.studenti.panasia.ettoreantonio.tester;

import it.unisannio.studenti.panasia.ettoreantonio.classi.AddOperation;
import it.unisannio.studenti.panasia.ettoreantonio.classi.Calculator;
import it.unisannio.studenti.panasia.ettoreantonio.classi.DivideOperation;
import it.unisannio.studenti.panasia.ettoreantonio.classi.MultiplyOperation;
import it.unisannio.studenti.panasia.ettoreantonio.classi.Operation;
import it.unisannio.studenti.panasia.ettoreantonio.classi.SubtractOperation;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		
		double num1=10;
		double num2=5;
		
		Operation add=new AddOperation();
		Operation subtract = new SubtractOperation();
        Operation multiply = new MultiplyOperation();
        Operation divide = new DivideOperation();
        
        calculator.operate(num1, num2, add); //15.0
        calculator.operate(num1, num2, subtract); //5.0
        calculator.operate(num1, num2, multiply); //50.0
        calculator.operate(num1, num2, divide); //2.0
	}

}
