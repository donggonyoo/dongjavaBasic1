package javaBasic1.nested.nested.ex1;

public class NetWork {
	
	public void sendMessage(String a ) {
		NetworkMessage networkMessage = new NetworkMessage(a);
		networkMessage.print();
	}
	
	 private static class NetworkMessage{
		 private String me;
		 
		  NetworkMessage(String me) {
			 this.me = me;
		 }
		 public void print() {
			 System.out.println(me);
			 
		 }
		 
	 }

}
