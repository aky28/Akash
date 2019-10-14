package GS;

import java.util.Scanner;

public class permutationSteps {

	public int count(int n)
	{
	   if(n==1)
		   return 1;
	   else if(n==2)
		   return 2;
	   else if(n==3)
		   return 3;
	   else
	      return count(n-1)+count(n-2)+count(n-3);
	}
	
	public static void main(String[] args) {
       int n;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the number of stairs");
       n=sc.nextInt();
       permutationSteps p=new permutationSteps();
       System.out.println("Total number of permutations "+p.count(n));
	}

}
