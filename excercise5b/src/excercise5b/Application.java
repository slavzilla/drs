package excercise5b;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		int i, num, norm, hours, expensesLen = 0;
		String name, surname, description;
		float coefficient, supplement, bonus, quantity, unitPrice;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Unesi minimalnu cijenu rada");
			Employee.setMinimumWage(scanner.nextFloat());
			System.out.println("Unesi broj ukupnih unosa troskova: ");
			num = scanner.nextInt();
			Expense expenses[] = new Expense[num];
			System.out.println("Unesi broj rukovodilaca");
			num = scanner.nextInt();
			System.out.println("Unesi rukovodioce u sljedecem formatu:\nIme Prezime Koeficijent Dodatak Premija");
			for (i = 0; i < num; i++) {
				System.out.printf("Radnik broj %d\n", i + 1);
				name = scanner.next();
				surname = scanner.next();
				coefficient = scanner.nextFloat();
				supplement = scanner.nextFloat();
				bonus = scanner.nextFloat();
				expenses[expensesLen++] = new Manager(name, surname, coefficient, supplement, bonus);
			}
			System.out.println("Unesi broj magacionera");
			num = scanner.nextInt();
			System.out.println(
					"Unesi magacionere u sljedecem formatu:\nIme Prezime Koeficijent Norma Broj ostvarenih sati");
			System.out.println("");
			for (i = 0; i < num; i++) {
				System.out.printf("Magacioner broj %d\n", i + 1);
				name = scanner.next();
				surname = scanner.next();
				coefficient = scanner.nextFloat();
				norm = scanner.nextInt();
				hours = scanner.nextInt();
				expenses[expensesLen++] = new Warehouseman(name, surname, coefficient, norm, hours);
			}
			System.out.println("Unesi broj materijalnih troskova");
			num = scanner.nextInt();
			System.out.println("Unesi materijalne troskove u sledecem formatu:\nOpis troska Kolicina Cijena");
			for (i = 0; i < num; i++) {
				System.out.printf("Trosak broj %d\n", i + 1);
				description = scanner.next();
				quantity = scanner.nextFloat();
				unitPrice = scanner.nextFloat();
				expenses[expensesLen++] = new MaterialCost(description, quantity, unitPrice);
			}
			System.out.printf("%-30s%-50s%-30s\n", "Tip troška", "Svrha troška", "Iznos");
			for (i = 0; i < expensesLen; i++) {
				System.out.printf("%-30s%-50s%-30s\n", expenses[i].expenseType(), expenses[i].expensePurpose(),
						expenses[i].amount());
			}
		}
	}

}
