package excercise5b;

public class Warehouseman extends Employee {
	private int norm;
	private int hours;

	Warehouseman(String name, String surname, float coefficient, int norm, int hours) {
		super(name, surname, coefficient);
		this.norm = norm;
		this.hours = hours;
	}

	public int getNorm() {
		return norm;
	}

	public void setNorm(int norm) {
		this.norm = norm;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	@Override
	public float amount() {
		return super.getCoefficient() * super.getMinimumWage()
				* ((hours < norm) ? (0.8f) : (1 + (hours - norm) / 100.0f));
	}

	@Override
	public String expensePurpose() {
		return "Plata za magacionera: " + super.getName() + " " + super.getSurname();
	}

}
