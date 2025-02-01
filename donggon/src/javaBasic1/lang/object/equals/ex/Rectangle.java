package javaBasic1.lang.object.equals.ex;

import java.util.Objects;

public class Rectangle {
	private int height;//높이
	private int width;//넓이
	
	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}
	

	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(height, width);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		return height == other.height && width == other.width;
	}
	
	
	
	

}
