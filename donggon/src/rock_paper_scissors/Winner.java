package rock_paper_scissors;

public class Winner { 
	public static void winner(Player p1 , Player p2) {
		int compare = new HandComparator().compare(p1, p2);
		switch (compare) {
		case -1: 
			System.out.println(p2.getName()+"의 승리");
			break;
		case 0 : 
			System.out.println("동점");
			break;
		case 1 :
			System.out.println(p1.getName()+"의 승리");
			break;
		}

	}
}

