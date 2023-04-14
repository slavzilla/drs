package excercise7;

public class Competitor {

	private final String name, surname;
	private final int yearOfBirth;
	private int medalCount;

	Competitor() {
		this.name = "";
		this.surname = "";
		this.yearOfBirth = 0;

	}

	public Competitor(String name, String surname, int yearOfBirth, int medalCount) {
		this.name = name;
		this.surname = surname;
		this.yearOfBirth = yearOfBirth;
		this.medalCount = medalCount;
	}

	public int getMedalCount() {
		return medalCount;
	}

	public void setMedalCount(int medalCount) {
		this.medalCount = medalCount;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	@Override
	public String toString() {
		return "Competitor [name=" + name + ", surname=" + surname + ", yearOfBirth=" + yearOfBirth + ", medalCount="
				+ medalCount + "]";
	}

}
