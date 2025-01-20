package javaBasic1.exception.ex3.exception;

public class SendExceptionV3 extends NetworkExceptionV3{
	//전송 실패시 발생하는 예외
	
	private String date;

	public SendExceptionV3(String message,String data) {
		super(message);
		this.date = data;
	}
	
	public String getDate() {
		return date;
	}

}
