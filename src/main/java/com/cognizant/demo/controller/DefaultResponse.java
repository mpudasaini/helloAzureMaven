package com.cognizant.demo.controller;

public class DefaultResponse {
	private String message;

	public DefaultResponse() {
		super();
	}

	public DefaultResponse(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
