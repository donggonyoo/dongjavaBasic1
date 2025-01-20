package javaBasic1.lang.random.test;

import java.util.Random;

public class Lottogenerator {
	Random random = new Random();
	private int count;
	int []lotto= new int[6];
	
	public int[] generator() {
		while(count < 6) {
			int num = random.nextInt(45)+1;
			if(isUnique(num)) {
				lotto[count] = num;
				count++;
			}
		}
		return lotto;

	}
	private boolean isUnique(int num) {
		for (int i = 0; i < count; i++) {
			if(lotto[i] == num) {
				return false;
			}
		}return true;
		
	}

}





