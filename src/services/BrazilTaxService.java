package services;

public class BrazilTaxService extends TaxService{
	// Atributo
	
	@Override
	public double tax(double amount) {
		return amount * 0.3;
	}
	
}
