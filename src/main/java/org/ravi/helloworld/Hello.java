package org.ravi.helloworld;

public class Hello {
	private String user = "Bhushan";
	public String displayHelloMessage(){
		String message = "hi";
		message += "there, I am "+ user;
		return message;
	}

}
