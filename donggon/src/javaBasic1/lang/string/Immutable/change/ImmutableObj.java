package javaBasic1.lang.string.Immutable.change;



public class ImmutableObj {
	private final int count;
	
	public ImmutableObj(int count) {
		this.count = count;
	}
	public int getCount() {
		return this.count;
	}
	
	public ImmutableObj add(int count) {
		return new ImmutableObj(this.count+count);
	}

}
