package javaBasic1.lang.string.Immutable.ex;

//날짜를 입력받는 클래스를 불변클래스로 만들어봐라 (사이드이펙트가 발생해선 안됨)

public class ImmutableDate {
	private final  int year;
	private final  int month;
	private final  int day;
	
	public ImmutableDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public ImmutableDate setYear(int year) {
		return new ImmutableDate(year, this.month, this.day);
	}
	
	public ImmutableDate setMonth(int month) {
		return new ImmutableDate(this.year, month, this.day);
	}
	
	public ImmutableDate setDay(int day) {
		return new ImmutableDate(this.year, this.month, day);
	}

	@Override
	public String toString() {
		return "[ "+year+"년 " + month +"월 "+day+"일 ]";
	}
	
	
	

}
