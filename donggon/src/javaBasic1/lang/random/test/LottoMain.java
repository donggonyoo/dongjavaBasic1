package javaBasic1.lang.random.test;


import java.util.Set;

public class LottoMain {
	public static void main(String[] args) {
		Lottogenerator lotto = new Lottogenerator();
		int[] generator = lotto.generator();
		System.out.println("** 로또 번호 **");
		for (int i : generator) {
			System.out.print(i+" ");
			
		
		}
		System.out.println("");
		
		System.out.println("로또 번호 2 (동일한숫자 입력시 적용X)");
		LottoGeneratorTreeSet lo = new LottoGeneratorTreeSet();
		Set<Integer> lotto2 = lo.generator();
		for (Integer i : lotto2) {
			System.out.print(i+" ");
		}
		
		
	}
	

}
