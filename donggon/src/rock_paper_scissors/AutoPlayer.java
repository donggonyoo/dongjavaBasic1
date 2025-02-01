package rock_paper_scissors;

import java.util.Random;

public class AutoPlayer extends Player {

	public AutoPlayer(String name) {
		super(name);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setHand() {
		int c = new Random().nextInt(1,3);
		int d = new Random().nextInt(1,3);
		super.setHand(c, d);
	}

	@Override
	public int getA() {
		// TODO Auto-generated method stub
		return super.getA();
	}

	@Override
	public int getB() {
		// TODO Auto-generated method stub
		return super.getB();
	}

	@Override
	public void view() {
		// TODO Auto-generated method stub
		super.view();
	}

	@Override
	public void viewResult() {
		// TODO Auto-generated method stub
		super.viewResult();
	}

	@Override
	public int getHand() {
		// TODO Auto-generated method stub
		return super.getHand();
	}

}
