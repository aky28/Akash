package GS;

import java.util.Scanner;

public class uglyNumber {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     uglyNumber un=new uglyNumber();
     int flag=0,count=0,p=1;
     System.out.println("Enter the number");
     int x=sc.nextInt();
		/*
		 * for(int i=6;i<=(x/2);i++) { if(un.prime(i)) { if(x%i==0) { flag=1; } } }
		 */
     while(count!=x)
     {
    	 for(int i=6;i<=(p);i++)
    	 {
    		 if(un.prime(i))
    		 {
    			 if(p%i==0)
    			 {
    				 flag=1;
    				 break;
    			 }
    			 
    		 }
    	 }
    	 if(flag!=1)
    	 {
    	  count++;
    	  p++;
    	 }
    	 else
    	  p++;
    	 
    	// System.out.println("P : "+(p-1)+" flag :"+flag);
    	 flag=0;
     }
     
     System.out.println("The ugly number is "+(p-1));
	}

	public boolean prime(int n)
	{
		if(n==1)
		 return true;
		for(int i=2;i<=(n/2);i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
}
