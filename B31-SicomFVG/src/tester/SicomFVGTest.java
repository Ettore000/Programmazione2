package tester;

import classi.Employee;
import classi.SicomFVG;

public class SicomFVGTest {

	public static void main(String[] args) {
		SicomFVG sicom = new SicomFVG("SicomFVG", 3);

        // Create 4 employees
        Employee emp1 = new Employee("John", "Doe");
        Employee emp2 = new Employee("Jane", "Doe");
        Employee emp3 = new Employee("Bob", "Smith");
        Employee emp4 = new Employee("Alice", "Jones");

        // Add employees to the company
        sicom.addEmployee(emp1);
        sicom.addEmployee(emp2);
        sicom.addEmployee(emp3);
        sicom.addEmployee(emp4);

        // Set the security level
        sicom.setSecurityLevel(4);

        // Print the company details
        System.out.println("Company Name: " + sicom.getName());
        System.out.println("Security Level: " + sicom.getSecurityLevel());
        System.out.println("Employee List:");
        for (Employee emp : sicom.getEmployees()) {
            System.out.println(emp.getFirstName() + " " + emp.getLastName());
        }
	}

}
