package excercise6;

public class Application {

	public static void main(String[] args) {
		Intern intern1 = new Intern("Marko", "Maric", 20.5, 12, 3.4);
		System.out.println(intern1);
		System.out.println("Plata " + intern1.salary());

		Intern intern2 = new Intern();
		intern2.setName("Petar");
		intern2.setSurname("Petrovic");

		try {
			intern2.setBaseSalary(-5);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		intern2.setYearsOfService(13);
		intern2.setCoefficient(3.5);
		System.out.println(intern2);
		System.out.println("Plata " + intern2.salary());

		Intern intern3 = new Intern("Ivan", "Ivanovic", 21.5, 15, 5.4);
		System.out.println("Ime: " + intern3.getName());
		System.out.println("Prezime: " + intern3.getSurname());
		System.out.println("Osnovica: " + intern3.getBaseSalary());
		System.out.println("Staz: " + intern3.getYearsOfService());
		System.out.println("Koeficijent: " + intern3.getCoefficient());
		System.out.println("Plata " + intern3.salary());

		Contractor contractor1 = new Contractor("Ana", "Petrovic", 500, 0.30);
		System.out.println(contractor1);
		System.out.println("Plata " + contractor1.salary());

		Contractor contractor2 = new Contractor("Filip", "Markovic", 520, 0.35);

		Contractor contractor3 = new Contractor("Ilija", "Filipovic", 700, 0.42);

		Employee employees[] = new Employee[6];
		employees[0] = intern1;
		employees[1] = intern2;
		employees[2] = intern3;
		employees[3] = contractor1;
		employees[4] = contractor2;
		employees[5] = contractor3;

		double contractorsSalary = 0;
		double internsSalary = 0;

		for (Employee employee : employees) {
			if (employee instanceof Intern) {
				internsSalary += employee.salary();
			} else {
				contractorsSalary += employee.salary();
			}
		}
		System.out.println("Plate procenat " + contractorsSalary);
		System.out.println("Plate stazisti " + internsSalary);

	}

}
