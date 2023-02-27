### Treće vježbe
Kreirati Java program koji učitava riječi iz tekstualnog fajla i određuje njihovu učestalost pojavljivanja. Prilikom prikaza rezultata riječi je potrebno sortirati po broju pojavljivanja, od one koja se najčešće pojavljuje do one koja se najmanje pojavljuje u fajlu. Ne praviti razliku između malih i velikih slova, i ignorisati znake interpunkcije.

```
public class Application {

	public static void main(String[] args) {

		List<String> listOfTextLines = null;

		try {
			Path path = Paths.get("putanja/do/fajla/Rijeci.txt");
			listOfTextLines = Files.readAllLines(path, StandardCharsets.UTF_8);
		} catch (IOException e) {
			System.err.println("Greška prilikom čitanja fajla.");
			System.exit(1);
		}
		
	}

}
```

