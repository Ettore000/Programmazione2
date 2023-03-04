package it.unisannio.studenti.panasia.ettoreantonio.tester;

import it.unisannio.studenti.panasia.ettoreantonio.classi.Employee;
import it.unisannio.studenti.panasia.ettoreantonio.classi.PaymentSystem;

public class PaymentSystemTest {

	public static void main(String[] args) {
		PaymentSystem paymentSystem=new PaymentSystem();
		
		Employee e1 = new Employee("Mario Rossi", 10.0, 40.0);
		Employee e2 = new Employee("Paolo Bianchi", 15.0, 35.5);
        Employee e3 = new Employee("Giuseppe Verdi", 12.5, 42.0);
        
        paymentSystem.addEmployee(e1);
        paymentSystem.addEmployee(e2);
        paymentSystem.addEmployee(e3);
        
        paymentSystem.processPayments();
	}

}
