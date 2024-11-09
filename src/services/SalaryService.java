package services;

import entities.Employee;

public class SalaryService {
	// Atributo
	private TaxService taxService;
	private PensionService pensionService;
	
	// Construtor
	public SalaryService(TaxService taxService, PensionService pensionService) {
		this.taxService = taxService;
		this.pensionService = pensionService;
	}
	
	
	/*
	// FORMA ERRADA PARA FAZER O CALCULO DO IMPOSTO NA CLASSE SALARYSERVICE
	TaxService taxService = new TaxService();
	PensionService pensionService = new PensionService();
	// -----
	 */
	public double netSalary(Employee employee) {
		
		return employee.getGrossSalary() - taxService.tax(employee.getGrossSalary())
				- pensionService.discount(employee.getGrossSalary());
	}
}
