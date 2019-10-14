package morgan;

import java.util.ArrayList;
import java.util.Scanner;

public class BothHalfSameCharachter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Character> first=new ArrayList<Character>();
        System.out.println("Enter the String");
        String s=sc.next();
        char a[]=s.toCharArray();
        int len=a.length;
        if(len%2==0)
        {
        	for(int i=0;i<(len/2);i++)
            	first.add(a[i]);
            for(int i=(len/2);i<len;i++)
            {
            	if(first.contains(a[i]))
            	{
            		int index=first.indexOf(a[i]);
            		first.remove(index);
            	}
            }
        }
        else
        {
        	for(int i=0;i<(len/2);i++)
            	first.add(a[i]);
            for(int i=(len/2+1);i<len;i++)
            {
            	if(first.contains(a[i]))
            	{
            		int index=first.indexOf(a[i]);
            		first.remove(index);
            	}
            }
        }
        if(first.isEmpty())
        	System.out.println("Both half are having same characters");
        else
        	System.out.println("Both half are distinct");
	}

}
