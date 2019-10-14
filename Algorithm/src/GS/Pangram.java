package GS;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean flag=false;
		System.out.println("enter the String");
		String s=sc.nextLine();
		char a[]=s.toCharArray();
        for(int i='a';i<='z';i++)
        {
        	flag=false;
        	for(int j=0;j<s.length();j++)
        	{
        		if(a[j]==(char)i)
        		{
        			flag=true;
        		}
        	}
        	if(flag==false)
        		break;
        }
        if(flag==true)
        	System.out.println("string is pangram");
        else
        	System.out.println("string is not pangram");
	}

}
