package rock_paper_scissors;

import java.util.Comparator;

public class HandComparator implements Comparator<Player> {
	@Override
	public int compare(Player o1, Player o2) {
		return o1.getHand()>o2.getHand()? 1 : 
			(o1.getHand()==o2.getHand())?0:-1;
	}

	
}
