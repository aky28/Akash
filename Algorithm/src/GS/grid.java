package GS;

import java.util.Scanner;

public class grid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int total=1;
		System.out.println("enter the number");
		int n=sc.nextInt();
		for(int i=2;i<=n;i++)
		{
			total=total+i*i;
		}
        
		System.out.println(total);
	}

}
