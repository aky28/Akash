package concept;

import java.util.Scanner;

public class NoOfDigit {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		n=sc.nextInt();
		/*
		 * int a[]=new int[n]; for(int i=0;i<n;i++) { System.out.println("Enter the "+
		 * (i+1)+"number"); a[i]=sc.nextInt(); }
		 */		System.out.println("enter the size of number");
		int s=sc.nextInt();
		System.out.println(NoOfDigit.permute(n,s));
		
	}
	public static int permute(int x,int y)
	{
		int prod=1;
		for(int i=0;i<(x-y);i++)
			prod=prod*x--;
		for(int i=(x-y);i>0;i--)
			prod=prod/i;
		return prod;
	}

}
