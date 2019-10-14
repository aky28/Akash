package Easy;

import java.util.ArrayList;
import java.util.Scanner;

public class AdjacentDuplicates {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the String");
       String s=sc.nextLine();
       char a[]=s.toCharArray();
       ArrayList<Character> mn=new ArrayList<Character>();
       for(int i=0;i<s.length();i++)
    	   mn.add(a[i]);
       int x=mn.size();
       int flag=0;
       for(int i=0;i<x;i++)
       {
    	   while(x>0)
    	   {
    		   if((i<x-1) && (mn.get(i)==mn.get(i+1)))
    		   {
    			   //System.out.println(mn.get(i)+" "+mn.get(i-1));
    			   mn.remove(i);
    			   mn.remove(i);
    			   x=x-2;
    			   i=i-1;
    			   if(i<0)
    			   {
    				   flag=1;
    				   break;
    			   }
    			  // System.out.println(mn);
    		   }
    		   else
    			   break;
    	   }
    	   if(flag==1)
    		   break;
    	   
       }
       System.out.println(mn);
	}

}
