package it.unisannio.studenti.panasia.ettoreantonio.classi;

import java.util.ArrayList;

public class PaymentSystem {
	public PaymentSystem() {
		this.employees = new ArrayList<>();
	}
	
	public ArrayList<Employee> getEmployees() {
		return employees;
	}
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public void processPayments() {
		for(Employee employee: employees) {
			double payment=employee.pagamento();
			System.out.println(employee.getNome()+" - Payment: "+payment);
		}
	}
	
	private ArrayList<Employee> employees;
}
