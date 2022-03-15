package com.cg.smms.exception;

public class ObjectNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public ObjectNotFoundException(String st) {
		super(st);
		System.out.println(st + " Details Not Found in Database");
	}
}
