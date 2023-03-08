### Četvrte vježbe, prvi zadatak
Napisati Java program kojim se otvara proizvoljan .txt fajl i određuje i ispisuje statistika sadržaja tog fajla. Statistika sadrži:
- broj rečenica u fajlu;
- broj riječi u fajlu;
- broj karaktera u fajlu;
- broj brojeva (ne cifri) u fajlu, npr. 3.45, -1.095678 ili 1. 

<details><summary><b>Driver program</b></summary>
<sub>

```Java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {
		String line;
		String[] words;

		int sentenceCount = 0;
		int wordCount = 0;
		int characterCount = 0;
		int numberCount = 0;

		try {
			BufferedReader a = new BufferedReader(new FileReader(
					"tekst.txt"));

			while((line = a.readLine()) != null) {
				words = line.split("\\s+");
				for(String s : words) {
					wordCount++;
					characterCount = characterCount + s.length();

					if(s.matches("")) //TODO dopisati regularni izraz za recenicu
						sentenceCount++;
					
					if(s.matches("")) //TODO dopisati regularni izraz za broj
						numberCount++;			
				}
			}
			a.close();

		} catch(IOException e) {
			e.printStackTrace();
		}

		System.out.println("Broj recenica:\n" + sentenceCount + "\n");
		System.out.println("Broj rijeci:\n" + wordCount + "\n");
		System.out.println("Broj karaktera:\n" + characterCount + "\n");
		System.out.println("Broj brojeva:\n" + numberCount + "\n");

	}
}
```
</sub>
</details>

**Objašnjenje**: Pomoću klase `FileReader` čitamo podatke iz fajla. Ova klasa pristupa direktno fajlu koji se nalazi u sekundarnoj memoriji (na disku), što može biti sporo. Upotrebom klase `BufferedReader` poboljšavamo performanse učitavanja time što fajl učitavamo direktno u primarnu memoriju (RAM). Alternativa ovom pristupu jesu statičke metode iz klase `Files`, a koje smo koristili na prošlom času.
