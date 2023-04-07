package excercise6;

public abstract class Employee {
	private String name;
	private String surname;

	Employee() {
	}

	Employee(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return ", name=" + name + ", surname=" + surname;
	}

	public abstract double salary();

}
