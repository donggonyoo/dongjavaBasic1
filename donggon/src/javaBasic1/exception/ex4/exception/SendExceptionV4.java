package javaBasic1.exception.ex4.exception;

public class SendExceptionV4 extends NetworkExceptionV4{
	//전송 실패시 발생하는 예외
	
	private String date;

	public SendExceptionV4(String message,String data) {
		super(message);
		this.date = data;
	}
	
	public String getDate() {
		return date;
	}

}
