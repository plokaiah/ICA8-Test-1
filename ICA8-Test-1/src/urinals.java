//author - Prem Raj Lokaiahgari

import java.lang.*;
import java.util.*;

public class urinals {
	public static void main(String[] args)
	{
		System.out.println("Enter Your Input Strings: ");
		getString();
	}
	
	public static void getString()
	{
		Scanner s1 =new Scanner(System.in);
		String k = s1.nextLine();
		
		while(!k.equals("-1"))
		{
			if(validateString(k))
			{
				System.out.println("Success");
			}
			else 
			{
				System.out.println("Not Success");
			}
			k = s1.nextLine();
		}
	}
	
	public static boolean validateString(String inpStr)
	{
		int c=0;
		int i=0;
		while(i<inpStr.length())
		{
			if(inpStr.charAt(i)=='0'  || inpStr.charAt(i)== '1') {
				c=0;
			}
			else {
				c=1;
			}
			i=i+1;
		}
		if(c==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
}

