package GS;

import java.util.ArrayList;
import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println();
		String s=sc.nextLine();
		int min=0,max=0;
		ArrayList str=new ArrayList();
		ArrayList s1=new ArrayList();
		String fin=null;
		char a[]=s.toCharArray();
        int len=s.length();
        for(int i=0;i<len-1;i++)
        {
        	if(!str.contains(a[i]))
        	{
        		str.add(a[i+1]);
        	}
        	else
        	{
				/*
				 * if(str.size()>fin.length()) fin=str.toString(); str.clear();
				 */
        		
        		s1=str;
        		
        	}
        }
	}

}
