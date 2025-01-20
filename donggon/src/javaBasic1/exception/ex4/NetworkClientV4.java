package javaBasic1.exception.ex4;

import javaBasic1.exception.ex4.exception.ConnectExceptionV4;
import javaBasic1.exception.ex4.exception.SendExceptionV4;

public class NetworkClientV4 {
	private final String address;
	private boolean connectError;
	private boolean sendError;
	private boolean testError;

	public NetworkClientV4(String address) {
		this.address = address;
	}
	public void connect(){
		if(connectError) {
			throw new ConnectExceptionV4("connectError  ", address+ "서버에 연결 실패  ");
		}System.out.println(address+" 연결 성공");}

	
	public void send(String data) {
		if(sendError) {
			throw new SendExceptionV4("sendError  ","  데이터 전송 실패 : "+data);}
		System.out.println(address+"데이터 전송 성공 : "+data);}
	
	
	public void test() throws RuntimeException{
		if(testError) {
			throw new RuntimeException(address);
		}
		System.out.println("RunTime 테스트정상");}

	public void disconnect() {
		System.out.println(address+"의 서버연결해제");}
	
	
	public void initError(String error) {
		if(error.contains("error1")) {
			connectError = true;}
		
		else if(error.contains("error2")) { //error2를 포함하는가?
			sendError = true;}
		
		else if(error.contains("error3")) {
			testError = true;}}


}
