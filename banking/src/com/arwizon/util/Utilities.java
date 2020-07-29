package com.arwizon.util;

public class Utilities {

	
		// TODO Auto-generated method stub
public  static void namevalidation(String name)throws MyException
{
	if(!name.matches("[A-Za-z]+"))
		throw new MyException("name can be only alphabets");
}
public  static void phvalidation(String phname)throws MyException
{
	if(!phname.matches("[7-9]{1}[0-9]{9}"))
	{
		throw new MyException("phno can contain 10numbers");
	
	}

}
}

