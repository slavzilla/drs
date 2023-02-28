package excercise3;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {

		List<String> lines = null;
		ArrayList<String> words = new ArrayList<String>();

		// Koristimo klasu Integer, posto primitivni tipovi ne mogu biti elementi ArrayList
		ArrayList<Integer> occurrences = new ArrayList<Integer>();
		int index;

		try {
			Path path = Paths.get("words.txt");
			lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		} catch (IOException e) {
			System.err.println("Greska prilikom otvaranja fajla.");
			System.exit(1);
		}

		for (String line : lines) {
			line = line.toLowerCase();
			String lineWords[] = line.split("[ ,.;!?]");
			for (String lineWord : lineWords) {
				if (lineWord.length() > 0) {
					index = words.indexOf(lineWord);
					if (index == -1) {
						words.add(lineWord);
						occurrences.add(1);
					} else
						occurrences.set(index, occurrences.get(index) + 1);
				}

			}
		}

		int sortedIndices[] = getSortedIndices(occurrences);

		System.out.printf("%-15s%-5s\n", "Rijeci", "Ponavljanja");
		System.out.println("_".repeat(30));

		for (int i = 0; i < occurrences.size(); i++) {
			System.out.println(
					String.format("%-15s%-5s\n", words.get(sortedIndices[i]), occurrences.get(sortedIndices[i])));
		}
	}

	public static int[] getSortedIndices(ArrayList<Integer> occurrences) {

		int len = occurrences.size();
		int[] indices = new int[len];
		int[] data = new int[len];

		for (int i = 0; i <= len - 1; i++) {
			indices[i] = i;
			data[i] = occurrences.get(i);
		}

		for (int i = 0; i < len - 1; i++) {
			// Trazimo najmanji element u nesortiranom nizu
			int index = i;
			for (int j = i + 1; j < len; j++)
				if (data[j] > data[index])
					index = j;

			// Mijenjamo elemente podataka
			swap(data, i, index);

			// Mijenjamo elemente idneksa
			swap(indices, i, index);
		}

		return indices;
	}

	public static void swap(int arr[], int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
}
