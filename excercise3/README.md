### Treće vježbe
Kreirati Java program koji učitava riječi iz tekstualnog fajla i određuje njihovu učestalost pojavljivanja. Prilikom prikaza rezultata riječi je potrebno sortirati po broju pojavljivanja, od one koja se najčešće pojavljuje do one koja se najmanje pojavljuje u fajlu. Ne praviti razliku između malih i velikih slova, i ignorisati znake interpunkcije.

<details><summary><b>Driver program</b></summary>
<sub>

```Java
public class Application {

	public static void main(String[] args) {

		List<String> lines = null;

		try {
			Path path = Path.of("putanja/do/fajla/Rijeci.txt");
			lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		} catch (IOException e) {
			System.err.println("Greška prilikom čitanja fajla.");
			System.exit(1);
		}
		
	}

}
```
</sub>
</details>
