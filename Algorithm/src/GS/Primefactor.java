package GS;

import java.util.Scanner;

public class Primefactor {

	public static void main(String[] args) {
       int number = 0;
       Primefactor f=new Primefactor();
       Scanner sc=new Scanner(System.in);
       System.out.println("ënter the number");
       number=sc.nextInt();
       for(int i=1;i<=number;i++)
       {
    	   if(f.prime(i))
    	   {
    		   if(number%i==0)
    			  System.out.print(i+" "); 
    	   }
       }
	}
	public boolean prime(int n)
	{
		for(int i=2;i<=(n/2);i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}

}
