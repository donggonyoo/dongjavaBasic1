package javaBasic1.lang.enumeration.test.http;

public enum HttpStatus {
	OK(200,"ok"),
	BAD_REQUEST(400,"Bad Requst"),
	NOT_FOUND(404,"Not Found"),
	INTERNAL_SERVER_ERROR(500,"INTERNAL_SERVER_ERROR");
	
	private final int code;
	private final String message;

	HttpStatus(int code, String message) {
		this.code =code;
		this.message= message;
	}
	
	public int getCode() {
		return code;
	}
	
	public String getMessage() {
		return message;
	}
	
	public static HttpStatus findByCode(int code) {
		HttpStatus[] values = HttpStatus.values();
		for (HttpStatus httpStatus : values) {
			if(httpStatus.getCode()==code) {
				return httpStatus;
		}
		}return null;
		
	}
	public boolean isSucess(int code) {
		if(code==OK.getCode()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	
	
	
	
	

}
