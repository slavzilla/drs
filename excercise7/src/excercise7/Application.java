package excercise7;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {
		Competitor competitor1 = new Competitor("Vuk", "Slavic", 1998, 27);
		Competitor competitor2 = new Competitor("Ana", "Asanin", 2000, 19);
		Competitor competitor3 = new Competitor("Lidija", "Vuksanovic", 2002, 18);
		Competitor competitor4 = new Competitor("Tarik", "Avdovic", 2001, 23);

		LinkedList<Competitor> competitors = new LinkedList<Competitor>();
		competitors.add(competitor1);
		competitors.add(competitor2);
		competitors.add(competitor3);
		competitors.add(competitor4);
		competitors.add(competitor1);
		competitors.add(competitor2);

		Iterator<Competitor> iter = competitors.iterator();
		System.out.println("Stampanje liste pomocu iteratora:");
		while (iter.hasNext())
			System.out.println(iter.next() + " ");

		Collections.sort(competitors, new MoreAwardedCompetitor());

		System.out.println("\nPo uspjesnosti:");
		for (Competitor takmicar : competitors)
			System.out.println(takmicar);

		Collections.sort(competitors, new OlderCompetitor());

		System.out.println("\nPo starosti:");
		for (Competitor competitor : competitors)
			System.out.println(competitor);

		Set<Competitor> hSet = new HashSet<Competitor>(competitors);
		Set<Competitor> tSet = new TreeSet<Competitor>(new MoreAwardedCompetitor());
		tSet.addAll(hSet);

		System.out.println("\nPo uspjesnosti(TreeSet):");
		for (Competitor competitor : tSet)
			System.out.println(competitor);
	}

}
