package rock_paper_scissors;

import java.util.ArrayList;

public class Player {
	private String name;
	private int a;
	private int b;
	Hand hand;
	private int result;
	
	

	public Player(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setHand(int a , int b) {
		this.a = a;
		this.b = b;
		hand = new Hand(getA(), getB());
		
	}
	
	
	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public void view() {
		System.out.print(getName()+"의 덱 : ");
		hand.viewHand();
		System.out.println();
	}
	public void viewResult() {
		result= hand.getHand();
		switch(result) {
		case 1 :
			System.out.println(getName()+": 가위");
			break;
		case 2 :
			System.out.println(getName()+": 바위");
			break;
		case 3 :
			System.out.println(getName()+": 보");
			break;
		}
	}
	
	public int getHand() {
		return result;
	}

	public void setHand() {
	}

}
