package org.ravi.helloworld;

/*
* This is Hello-world class
*/
public class Hello {
	private String user = "Bhushan";

	public String displayHelloMessage(){
		String message = "hi";
		message += "there, I am "+ user;
		return message;
	}

}
