package excercise2;

public class Application {

	public static void main(String[] args) {

		Car cars[] = new Car[3];
		String models[] = { "Skoda Fabia", "VW Polo", "Seat Ibiza" };
		int years[] = { 2022, 2017, 2019 };
		int capacities[] = { 999, 1200, 1500 };

		Car.setTaxBase(1.11);

		for (int i = 0; i < cars.length; i++) {
			cars[i] = new Car(models[i], years[i], capacities[i]);
		}

		double tax = calculateTaxes(cars);
		System.out.println("Ukupni porez je: " + tax);
	}

	private static double calculateTaxes(Car[] cars) {
		double tax = 0.0;
		System.out.println(String.format("%-25s%-15s%-10s\n", "Godište", "Model", "Kubikaža"));
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
			tax += cars[i].calculateTax();
		}
		return tax;
	}

}
