package com.arwizon.Main;
import java.util.Scanner;
import java.io.*;
import com.arwizon.Model.*;
import com.arwizon.util.MyException;
import com.arwizon.util.Utilities;
public class Bankingapplication {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int leng,opt;
		
		Scanner scw= new Scanner(System.in);
		System.out.println("Enter array size");
					 leng=scw.nextInt();
		Customer[] c=new Customer[leng];

		while(true) {
System.out.println("Enter 1 to add,enter2 to display\nenter3 to search by name and display details\nenter 4 to exit ");
opt=scw.nextInt();

switch(opt) 
{

case 1:
	{
	for(int i=0;i<c.length;i++)
{
		Scanner scrn=new Scanner(System.in);
		System.out.println("enterr name");
		String name= scrn.next();
		try {
			Utilities.namevalidation(name);
			System.out.println("tryblock executed");
			//break;
		}
		catch(MyException e)
		{
			System.out.println(e.getMessage());
			System.out.println("catchblock executed");
			
			i--;
			continue;
		}
		System.out.println("enter ph. number");
		String  phonenoo= scrn.next();
		try {
			Utilities.phvalidation(phonenoo);
			System.out.println("tryblock executed");
			//break;
		}
		catch(MyException e)
		{
			System.out.println(e.getMessage());
			System.out.println("catchblock executed");
			
			i--;
			continue;
		}
		/*String phonenoo=null;
		while(true)
		{

boolean flag=true;

System.out.println("enter ph. number");
 phonenoo= scrn.next();
 
String patternph="[7-9]{1}[0-9]{9}";
if(phonenoo.matches(patternph))
{
	flag=false;
	break;
}
else 
	System.out.println("enter valid phno");
	
}	*/
	
System.out.println("enter account type");
String accounttype= scrn.next();
Customer ci= new Customer();
ci.setName(name);
ci.setph(phonenoo);
ci.setaccount(accounttype);
ci.setcustomerid(Customer.getcount());
c[i]=ci;
	}
	break;


}
   case 2:
		
	for(Customer ce:c)
	{
		if (ce!=null)
		
		System.out.println(ce);
		
	}
	
	break;
		
	case 3:
	{
		System.out.println("enter cust name to search");
		
		Scanner scr=new Scanner(System.in);
		String namee=scr.next();
		boolean flag=false;
		for(int i=0;i<c.length;i++)
		{
			if(namee.equals(c[i].getName()))
{
	System.out.println(c[i]);
	flag=true;
}
		}
		if(!flag)
			System.out.println("no customer found");

	break;
	
		}

case 4:
	System.exit(1);

}
}
	}	
}