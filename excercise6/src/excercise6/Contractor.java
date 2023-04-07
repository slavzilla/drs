package excercise6;

public class Contractor extends Employee {
	double percentage;
	double gross;

	Contractor() {
	}

	Contractor(String name, String surname, double percentage, double gross) {
		super(name, surname);
		this.percentage = percentage;
		this.gross = gross;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public double getGross() {
		return gross;
	}

	public void setGross(double gross) {
		this.gross = gross;
	}

	public double salary() {
		return getPercentage() * getGross();
	}

	@Override
	public String toString() {
		return "Contractor [percentage=" + percentage + ", gross=" + gross + super.toString() + "]";
	}
	
	

}
