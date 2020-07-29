package com.arwizon.util;

public class MyException extends Exception {
String detailmsg;
public 	MyException(String msg)
	{
		this.detailmsg=msg;
}
public String getMessage()
{
	return detailmsg;
	
}
}