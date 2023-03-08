package excercise4a;

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
