package javaBasic1.nested.anonymous;

import javaBasic1.nested.local.Printer;

public class AnonymousOuter {
	private int outInstance  = 1;

	public void process(int param) {
		int localVar = 2;
		Printer a = new Printer() {
			
			@Override
			public void print() {	
			}
		};

		Printer printer = new Printer() {
			int value = 3;

			@Override
			public void print() {
				System.out.println("value : "+value);
				System.out.println("localF : "+localVar);
				System.out.println("param : "+param);
				System.out.println("outInstacneF : "+outInstance);


			}
		}; 
		printer.print();
		System.out.println("printer.class : "+printer.getClass());
		System.out.println("printerA.class : "+a.getClass());
		{
		}

	}
	public static void main(String[] args) {
		AnonymousOuter anonymousOuter = new AnonymousOuter();
		anonymousOuter.process(6);

	}

}
