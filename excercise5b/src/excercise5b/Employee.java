package excercise5b;

public abstract class Employee implements Expense {
	private final String name;
	private final String surname;
	private float coefficient;

	private static float minimumWage;

	Employee(String name, String surname, float coefficient) {
		this.name = name;
		this.surname = surname;
		this.coefficient = coefficient;
	}

	public final float getCoefficient() {
		return coefficient;
	}

	public final void setCoefficient(float coefficient) {
		this.coefficient = coefficient;
	}

	public final static float getMinimumWage() {
		return minimumWage;
	}

	public final static void setMinimumWage(float minimumWage) {
		Employee.minimumWage = minimumWage;
	}

	public final String getName() {
		return name;
	}

	public final String getSurname() {
		return surname;
	}

	@Override
	public String expenseType() {
		return "Plata";
	}

}
