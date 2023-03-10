package excercise5b;

public class Manager extends Employee {
	private float supplement;
	private float bonus;

	Manager(String name, String surname, float coefficient, float supplement, float bonus) {
		super(name, surname, coefficient);
		this.supplement = supplement;
		this.bonus = bonus;
	}

	public float getSupplement() {
		return supplement;
	}

	public void setSupplement(float supplement) {
		this.supplement = supplement;
	}

	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}

	@Override
	public float amount() {
		return super.getCoefficient() * super.getMinimumWage() * (1 + bonus + supplement);
	}

	@Override
	public String expensePurpose() {
		return "Plata za rukovodioca: " + super.getName() + " " + super.getSurname();
	}

}
