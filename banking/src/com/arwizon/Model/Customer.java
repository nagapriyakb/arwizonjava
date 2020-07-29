package com.arwizon.Model;
import java.util.Scanner;
public class Customer {
	private static int count;
	private String name;
	private String phoneno;
	private String accounttype;
	private int Customerid;
	static {
		count=101;
	}
	public Customer()
	{
		count++;
	}
	public static int getcount()
	{
		return count;
	}
	Scanner scr=new Scanner(System.in);
	public String  getName()
	{
		return name;
	}
	public void  setName(String name)
	{
		this.name= name;
	}
	public void  setph(String ph)
	{
		this.phoneno= ph;
	}
	public void  setaccount(String acc)
	{
		this.accounttype= acc;
	}
	public void  setcustomerid(int n)
	{
		this.Customerid= n;
	}
	public String toString()
	{
		return"cust name="+ name +",custphno="+ phoneno +",custacc="+ accounttype +",custid="+ Customerid;
	}
		public void getdata()
	{
		System.out.println("enter name");
		name= scr.next();
		System.out.println("enter ph. number");
		phoneno= scr.next();
		System.out.println("enter account type");
		accounttype= scr.next();
		
		
	}
	public void displaydata()
	{
System.out.println("cust name="+ name +",cust ph="+ phoneno +"cust"+ accounttype);
}
}