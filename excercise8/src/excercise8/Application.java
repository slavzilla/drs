package excercise8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Application {

	public static void main(String[] args) {
		BufferedReader input;
		File file = new File("vehicles.txt");

		String line;
		List<Vehicle> cars = new ArrayList<Vehicle>();
		Map<String, Integer> vehicleCount = new HashMap<>();
		List<Entry<String, Integer>> entries;

		if (file.isFile()) {
			try {
				input = new BufferedReader(new FileReader(file));
				while ((line = input.readLine()) != null) {
					cars.add(lineToVehicle(line));
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("Racunamo broj pojavljivanja vozila po brendu...\n");
		for (var car : cars) {
			System.out.println(car);
			String key = car.getBrand();
			if (vehicleCount.containsKey(key))
				vehicleCount.put(key, vehicleCount.get(key) + 1);
			else
				vehicleCount.put(key, 1);
		}

		System.out.println("\nStampamo sadrzaj mape sortirane po kljucevima...\n");
		Set<String> keys = vehicleCount.keySet();
		for (var brand : keys) {
			System.out.println(String.format("%-15s%-5s\n", brand, vehicleCount.get(brand)));
		}

		System.out.println("Vrsimo sortiranje po vrijednosti...\n");
		entries = new ArrayList<>(vehicleCount.entrySet());
		entries.sort(Entry.comparingByValue(Comparator.reverseOrder()));
		for (var entry : entries) {
			System.out.println(String.format("%-15s%-5s\n", entry.getKey(), entry.getValue()));
		}

	}

	public static Vehicle lineToVehicle(String line) {
		String args[] = line.split("#");
		return new Vehicle(args);
	}

}
