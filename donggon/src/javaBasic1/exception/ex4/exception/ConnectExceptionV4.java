package javaBasic1.exception.ex4.exception;

public class ConnectExceptionV4  extends NetworkExceptionV4{
	//연결(connect) 실패시 발생하는 예외
	private String address;

	public ConnectExceptionV4(String message,String address) {
		super(message);
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
}
