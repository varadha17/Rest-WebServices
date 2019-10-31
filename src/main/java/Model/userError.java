package Model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class userError {
	
	private String errormessage;
	private int errorcode;
	private String success;
	
	public userError() {
		
	}
	
	public userError(String message, int code, String success) {
		
		super();
		this.errormessage = message;
		this.errorcode = code;
		this.success = success;
		
	}
	
	public String getErrormessage() {
		return errormessage;
	}

	public void setErrormessage(String errormessage) {
		this.errormessage = errormessage;
	}

	public int getErrorcode() {
		return errorcode;
	}

	public void setErrorcode(int errorcode) {
		this.errorcode = errorcode;
	}

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

}
