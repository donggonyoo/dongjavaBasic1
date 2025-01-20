package javaBasic1.lang.random;

import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {
		Random random = new Random(1);
		
		int ranInt = random.nextInt();
		System.out.println("ranInt : "+ranInt);
		
		double ranDouble = random.nextDouble();
		System.out.println("ranDouble : "+ranDouble);
		
		boolean ranBool = random.nextBoolean();
		System.out.println("ranBool : "+ranBool);
		
		int ranInt2 = random.nextInt(15); //0~14
		System.out.println("ranInt2 : "+ranInt2);
		
		int ranInt3 = random.nextInt(15)+1; //1~15
		System.out.println("ranInt3 : "+ranInt3);

	}

}
