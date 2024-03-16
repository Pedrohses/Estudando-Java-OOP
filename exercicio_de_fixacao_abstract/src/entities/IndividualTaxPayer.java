package entities;

public final class IndividualTaxPayer extends TaxPayer {

	private Double expendituresHealth;

	public IndividualTaxPayer() {
		super();
	}

	public IndividualTaxPayer(String name, Double anualIncome, Double expendituresHealth) {
		super(name, anualIncome);
		this.expendituresHealth = expendituresHealth;
	}

	public Double getExpendituresHealth() {
		return expendituresHealth;
	}

	public void setExpendituresHealth(Double expendituresHealth) {
		this.expendituresHealth = expendituresHealth;
	}

	@Override
	public Double taxes() {
		if (anualIncome < 20000.0) {
			return (anualIncome * 0.15) - (expendituresHealth * 0.5);
		}
		return (anualIncome * 0.25) - (expendituresHealth * 0.5);
	}
}