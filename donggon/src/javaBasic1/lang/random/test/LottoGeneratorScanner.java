package javaBasic1.lang.random.test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Stream;

public class LottoGeneratorScanner {
	Random random = new Random();
	private Set<Integer> lotto = new HashSet<>();
	private List<Integer> lotto2;
	
	public List<Integer> generator() {
	while(lotto.size() < 6) {
		System.out.println("숫자를 입력하세요 : ");
		int a = random.nextInt(45)+1;
		lotto.add(a);
		
	}
	lotto2 = new ArrayList<>(lotto);
	return lotto2;
	
	}
}
