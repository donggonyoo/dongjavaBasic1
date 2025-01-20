package javaBasic1.time;

import java.time.temporal.ChronoField;

public class ChronoFieldMain {

	public static void main(String[] args) {
		int i = 1;
		ChronoField[] values = ChronoField.values();
		for (ChronoField c : values) {
			System.out.println(i+"."+c+" range : "+c.range());
			i++;
		}
		System.out.println("\nMONTH_OF_YEAR.range() "
		+ChronoField.MONTH_OF_YEAR.range());
		
		System.out.println("\nDAY_OF_MONTH.range() "
		+ChronoField.DAY_OF_MONTH.range());

	}

}
