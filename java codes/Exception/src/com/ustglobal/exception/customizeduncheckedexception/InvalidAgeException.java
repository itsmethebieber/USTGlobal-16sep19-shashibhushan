package com.ustglobal.exception.customizeduncheckedexception;

public class InvalidAgeException extends RuntimeException{
	String message = "Invalid age below 18years not allowed";
	public InvalidAgeException() {
	}
		public InvalidAgeException(String message) {
			this.message= message;
		}
	
	public String GetMessage() {
		return message;
		
}

}
