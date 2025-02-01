package rock_paper_scissors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public  class Hand {
	private List<Integer> hand;
	private List<String> handString;
	
	
	public Hand(int a , int b) {
		hand = new ArrayList<Integer>();
		hand.add(a);
		hand.add(b);
	}
	
	public void viewHand() {
		handString = new ArrayList<String>();
		for (Integer object : hand) {
			if(object==1) {
				handString.add("가위");
			}
			else if(object==2) {
				handString.add("바위");
			}
			else {
				handString.add("보");
			}
		}
		System.out.println(handString);
	}
	
	public int getHand() {
		Collections.shuffle(hand);
		return hand.remove(0);
	}

}
