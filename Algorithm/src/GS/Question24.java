package GS;

import java.util.Scanner;

public class Question24 {

	public static void main(String[] args) {
		System.out.println("Enter the range");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n+1];
		int arr[]=new int[n+1];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the "+(i+1)+" number");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<=n;i++)
		{
			a[arr[i]]++;
		}
		for(int i=1;i<=n;i++)
		{
			
			if(a[i]==2)
			  System.out.println("The number which is repeated "+i);
			else if(a[i]==0)
				System.out.println("The number which is not there "+i);

		}

	}

}
