package model.services;

public class USATaxService implements TaxService {
	
	public double tax(double amount) {
		if (amount <= 200.0) {
			return amount * 0.4;
		} else {
			return amount * 0.30;
		}
	}

}
