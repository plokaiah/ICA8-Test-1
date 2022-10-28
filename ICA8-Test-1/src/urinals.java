//author - Prem Raj Lokaiahgari

import java.lang.*;
import java.util.*;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;


public class urinals {
	public static void main(String[] args)
	{
		System.out.println("Enter Your INPUT preference:\n 1. Press 1 for input through DAT file \n 2. Press 2 for input through command prompt ");
		Scanner s1 =new Scanner(System.in);
		int a = s1.nextInt();
		
		try {
			
			if(a==1) {
				
				File file = new File("src//urinal.dat");
				FileWriter myWriter = new FileWriter("src//urinal.txt");
				
				Scanner s2 = new Scanner(file);
				
				while(s2.hasNextLine()){
				   String b = s2.nextLine();
				   boolean validation = validateString(String.valueOf(b));
				   if(validation) {
					   int c1 = countUrinals(String.valueOf(b));
					   myWriter.write(String.valueOf(c1));
					   myWriter.write('\n');
				   }      
				}
			myWriter.close();
			}
			
			else {
				while(true)
				{
					//System.out.println(k);
					System.out.println("Enter Your Strings: ");
					Scanner s3 =new Scanner(System.in);
					String c = s3.nextLine();
					if(c.equals("-1")) {
						break;
					}
					boolean validation = validateString(String.valueOf(c));
					if(validation) {
						int c2 = countUrinals(String.valueOf(c));
						System.out.println(c2);
					}
				}
			}	
		}
		catch(Exception ex1) {
			ex1.printStackTrace();
		}
		 
	}
	public static Integer countUrinals(String s)
    {
        StringBuilder input = new StringBuilder(s);
        int val = 0;
        Boolean f = true;
        int m = 0;
        while(m < input.length()) {
            if (input.charAt(m) == '0'){
                if(m==0 ){
                    if (input.charAt(m+1) == '0' ){
                        input.replace(m,m+1,"1");
                        val = val + 1;
                    }
                }
                else if (m==input.length()-1) {
                    if (input.charAt(m-1) == '0'){
                        input.replace(m,m+1,"1");
                        val = val + 1;
                    }
                }
                else {
                    if (input.charAt(m+1) == '0' && input.charAt(m-1) == '0'){
                        input.replace(m,m+1,"1");
                        val = val + 1;
                    } }
            }
            else {
            	if(m==0 ){
                    if (input.charAt(m+1) == '1' ){                       
                        f = false;                       
                    }
                }
                else if (m==input.length()-1) {
                    if (input.charAt(m-1) == '1'){
                        f = false;
                    }
                }
                else {
                    if (input.charAt(m+1) == '1' && input.charAt(m-1) == '1'){
                        f = false;
                    } }
            }
            if(f==false){
            	break;
            }
        m++ ;   
        }
        if(f) {
            return val;
            }
        else {
        	return -1;
        }
    }
	public static boolean validateString(String istr)
	{
		int c=0;
		for(int m=0;m<istr.length();m++)
		{
			if(istr.charAt(m)=='1'  || istr.charAt(m)== '0') {
				c=0;
			}
			else {
				c=1;
			}
		}
		if(c==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}

