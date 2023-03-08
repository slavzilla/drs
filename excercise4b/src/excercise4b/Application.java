package excercise4b;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		String input;
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Unesite string za provjeru i 0 ukoliko zelite da izadjete: \n");
			input = scanner.next();

			if (input.matches("0"))
				break;
			// za ogranicenje domena imali bismo
			// "[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.(edu|org|net|com))"
			if (input.matches("[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,3})"))
				System.out.println("Moze biti e-mail adresa.");
			else
				System.out.println("Ne moze biti e-mail adresa.");
		}
		scanner.close();
	}
}
