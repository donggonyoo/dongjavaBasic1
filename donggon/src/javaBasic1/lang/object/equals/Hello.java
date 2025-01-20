package javaBasic1.lang.object.equals;

import java.util.Objects;

public class Hello {
	private String name;
	
	Hello(String name){
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hello other = (Hello) obj;
		return Objects.equals(name, other.name);
	}
	

}
