package GS;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int f=0,t=0;
		System.out.println("Enter the String");
		String s=sc.nextLine();
		System.out.println("Enter the first word");
		String w1=sc.next();
		System.out.println("Enter the second word");
		String w2=sc.next();
		String[] a=s.split(" ");
		int l=a.length;
		
		System.out.println("length "+l);
		for(int i=0;i<l;i++)
		{
			if(a[i].equals(w1))
			{
				f=i;
			}
			if(a[i].equals(w2))
				t=i;
		}
		System.out.println("The difference are "+(t-f-1));

	}

}
