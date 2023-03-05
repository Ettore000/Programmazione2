package classi;

import java.util.ArrayList;
import java.util.List;

public class SicomFVG {
	public SicomFVG(String name, int securityLevel) {
		this.name = name;
		this.employees = new ArrayList<Employee>();
		this.securityLevel = securityLevel;
	}
	
	public String getName() {
		return name;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public int getSecurityLevel() {
		return securityLevel;
	}
	
	public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public void setSecurityLevel(int securityLevel) {
        this.securityLevel = securityLevel;
    }

	private String name;
    private List<Employee> employees;
    private int securityLevel;
}
