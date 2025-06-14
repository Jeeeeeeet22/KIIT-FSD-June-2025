package day7;

public enum ERRORS {
	
	ERROR1("ERR-1","%s is an Invalid Username"),
	ERROR2("ERR-2","Invalid Password"),
	ERROR3("Invalid Password"),
	ERROR235("ERR-235","Customised Message");
	//100's of entries
	
	private String errorId;
	private String errorMessage;
	
	private ERRORS(String errorId, String errorMessage) {
		this.errorId = errorId;
		this.errorMessage = errorMessage;
	}
	
	private ERRORS(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	

	public String getErrorId() {
		return errorId;
	}

	public void setErrorId(String errorId) {
		this.errorId = errorId;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	

}
