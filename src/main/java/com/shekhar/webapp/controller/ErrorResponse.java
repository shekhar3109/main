package com.shekhar.webapp.controller;

public class ErrorResponse {

	private String errormessage = null;
	public ErrorResponse(String errormessage) {
		this.setErrormessage(errormessage);
	}
	public String getErrormessage() {
		return errormessage;
	}
	public void setErrormessage(String errormessage) {
		this.errormessage = errormessage;
	}
}
