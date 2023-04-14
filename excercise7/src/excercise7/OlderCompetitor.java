package excercise7;

import java.util.Comparator;

public class OlderCompetitor implements Comparator<Competitor> {

	@Override
	public int compare(Competitor firstCompetitor, Competitor secondCompetitor) {
		if (firstCompetitor.getYearOfBirth() == secondCompetitor.getYearOfBirth())
			return 0;
		else if (firstCompetitor.getYearOfBirth() > secondCompetitor.getYearOfBirth())
			return -1;
		else
			return 1;
	}

}
