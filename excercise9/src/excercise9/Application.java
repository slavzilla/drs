package excercise9;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {

	public static void main(String[] args) {

		String line;
		BufferedReader input;
		String employee;
		LinkedList<String> employees = new LinkedList<String>();
		Pattern pattern = Pattern.compile("<img src='/tumber(.*)alt='(.*)'");

		try {

			// Citanje fajla
			input = new BufferedReader(new FileReader("employees_page.txt", StandardCharsets.UTF_8));
			while ((line = input.readLine()) != null) {
				Matcher matcher = pattern.matcher(line);
				if (matcher.find()) {
					employee = matcher.group(2);
					if (employee.startsWith("dr") || employee.startsWith("mr")) {
						employee = employee.replaceFirst("dr|mr", "");
					}
					employee = employee.strip(); // zbog praznine nakon titule
					employees.add(employee);
				}
			}
			input.close();
			//sortiranje liste pomocu komparatora
			employees.sort(new NameComparator());

			// Upis u fajl, false kako ne bi radio nadovezivanje
			FileWriter output = new FileWriter("employees.txt", StandardCharsets.UTF_8, false);

			for (String name : employees) {
				output.write(String.format("%s\n", name));
				System.out.println(name);
			}

			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
