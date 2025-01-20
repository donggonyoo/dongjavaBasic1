package javaBasic1.lang.random.test;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class LottoGeneratorTreeSet {
	Random rand = new Random();
	private Set<Integer> lotto = new TreeSet<>();
	
	public Set<Integer> generator() {
	while(lotto.size() < 6) {
		int a = rand.nextInt(45)+1;
		lotto.add(a);
		
	}
	return lotto;
	}
}
