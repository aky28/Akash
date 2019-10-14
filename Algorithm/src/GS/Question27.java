package GS;

import java.util.Scanner;

public class Question27 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of line");
        int no=sc.nextInt();
        int number=1;
        int space=no;
        for(int i=0;i<no;i++)
        {
        	for(int k=1;k<=space;k++)
        		System.out.print(" ");
        	
        	number=1;
        	for(int j=0;j<=i;j++)
        	{
        		System.out.print(number+" ");
        		number=number*(i-j)/(j+1);
        	}
        	space--;
        	System.out.println();
        }
	}

}
