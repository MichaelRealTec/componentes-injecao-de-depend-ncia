package entities;

public class Employee {
	// Atributo
	private String name;
	private Double grossSalary;
	
	// Método Getter e Setter	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getGrossSalary() {
		return grossSalary;
	}
	
	public void setGrossSalary(Double grossSalary) {
		this.grossSalary = grossSalary;
	}
	// Método Construtor	
	public Employee() {
		
	}
	
	public Employee(String name, Double grossSalary) {
		this.name = name;
		this.grossSalary = grossSalary;
	}
		
	// Método
	
	
}
