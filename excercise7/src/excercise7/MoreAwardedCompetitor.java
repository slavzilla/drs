package excercise7;

import java.util.Comparator;

public class MoreAwardedCompetitor implements Comparator<Competitor> {

	@Override
	public int compare(Competitor firstCompetitor, Competitor secondCompetitor) {
		if (firstCompetitor.getMedalCount() == secondCompetitor.getMedalCount())
			return 0;
		else if (firstCompetitor.getMedalCount() > secondCompetitor.getMedalCount())
			return -1;
		else
			return 1;
	}

}