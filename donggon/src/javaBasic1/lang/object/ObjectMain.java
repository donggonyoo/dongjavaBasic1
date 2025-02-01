package javaBasic1.lang.object;

public class ObjectMain {
	public static void main(String[] args) {
		Child child = new Child();
		child.Method();
		
		
		//toString(); 은 Object클래스의메서드
		String string = child.toString();
		System.out.println(string);
		System.out.println();
		
		Parent_ pChild = child; //부모는 자식 인스턴스를 담을 수 있음
		pChild.Method(); 
		System.out.println(pChild); //System.out.println 은 toString을 내장하고있음

	}

}
