package excercise6;

public class Intern extends Employee {
	double baseSalary;
	int yearsOfService;
	double coefficient;

	Intern() {
		setBaseSalary(0);
		setYearsOfService(0);
		setCoefficient(0);
	}

	Intern(String name, String surname, double baseSalary, int yearsOfService, double coefficient) {
		super(name, surname);
		setBaseSalary(baseSalary);
		setYearsOfService(yearsOfService);
		setCoefficient(coefficient);
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) throws IllegalArgumentException {
		if (baseSalary < 0) {
			throw new IllegalArgumentException("Osnovica mora biti > 0");
		} else {
			this.baseSalary = baseSalary;
		}
	}

	public int getYearsOfService() {
		return yearsOfService;
	}
	
	//unchecked exception, throws nije neophodno, ali dobra praksa
	public void setYearsOfService(int yearsOfService) throws IllegalArgumentException {
		if (yearsOfService < 0) {
			throw new IllegalArgumentException("Staz mora biti > 0");
		} else {
			this.yearsOfService = yearsOfService;
		}
	}

	public double getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(double coefficient) throws IllegalArgumentException {
		if (coefficient < 0) {
			throw new IllegalArgumentException("Koeficijent mora biti > 0");
		} else {
			this.coefficient = coefficient;
		}
	}

	public double salary() {
		return getBaseSalary() * getCoefficient() * (1 + getYearsOfService() / 50.0);
	}

	@Override
	public String toString() {
		return "Intern [baseSalary=" + baseSalary + ", yearsOfService=" + yearsOfService + ", coefficient="
				+ coefficient + super.toString() + "]";
	}
	
	
	
}
