package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import services.PensionService;
import services.SalaryService;
import services.TaxService;

public class Program {

	public static void main(String[] args) {
		/* Exemplo didático
		Fazer um programa ler os dados de um funcionário(nome, salário bruto) e depois mostrar o salário líquido,
		que consiste no valor bruto descontado impostos e previdência.
		Regras:
		1) imposto é 20%
		2) Previdencia é 10%
		
		Exemplo:
		Nome: MARIA                              (digitar MARIA)
		Salário bruto: 4000.00                   (digitar 4000.00)
		Salário liquido = 2800.00
		*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Salario bruto: ");
		double grossSalary = sc.nextDouble();
		
		Employee employee = new Employee(name, grossSalary);
		
		TaxService taxService = new TaxService();
		PensionService pensionService = new PensionService();
		SalaryService salaryService = new SalaryService(taxService, pensionService);
		
		double netSalary = salaryService.netSalary(employee);
		System.out.printf("Salario liquido = %.2f%n", netSalary);
		
		sc.close();
		
		/*
		 * 
		 * TaxService taxService = new TaxService();
		PensionService pensionService = new PensionService();
		
		
		double netSalary = grossSalary * 0.7;
		System.out.printf("Salario liquido = %.2f%n", netSalary);
		 * 
		 */
		
	}

}
