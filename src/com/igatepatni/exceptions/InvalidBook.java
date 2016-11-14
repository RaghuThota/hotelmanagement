package com.igatepatni.exceptions;

public class InvalidBook  extends Exception
{
	
    String message;
    public InvalidBook(String message) 
    {
		this.message=message;
	
	}
	public String getMessage() 
	{
		return message;
	}
	public void setMessage(String message) 
	{
		this.message = message;
	}
}
