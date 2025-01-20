package javaBasic1.exception.ex3.exception;

public class ConnectExceptionV3  extends NetworkExceptionV3{
	//연결(connect) 실패시 발생하는 예외
	private String address;

	public ConnectExceptionV3(String message,String address) {
		super(message);
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
}
