package com.ezXpense.backend.exceptions;

public class OrganizationsNotFoundException extends Exception {
private static final long serialVersionUID = 1L;
	
	@Override
	public String toString(){
		return "No organizations present";
	}
}
