package GS;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of linr");
		int no=sc.nextInt();
		int count=1;
		for(int i=1;i<=no;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(count+" ");
				count++;
			}
		    System.out.println();	
		}

	}

}
