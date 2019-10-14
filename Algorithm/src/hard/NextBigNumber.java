package hard;

import java.util.Scanner;

public class NextBigNumber {
    int a[]=new int[10];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		String s=String.valueOf(n);
		char a[]=s.toCharArray();
		int p=-1;
		for(int i=a.length-1;i>=1;i--)
		{
			int first=a[i]-'0';
			int second =a[i-1]-'0';
			if(second>first)
				continue;
			else
				p=i-1;
			break;
		}
		if(p==-1) {
			System.out.println("Not Possible");
			System.exit(0);
		}
		char temp=a[a.length-1];
		a[a.length-1]=a[p];
		a[p]=temp;
		for(int i=0;i<a.length-1-p;i++)
		{
			for(int j=p+1;j<a.length-2-i;j++)
			{
				int first=a[j]-'0';
				int second =a[j+1]-'0';
				if(first>second)
				{
					char temp1=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		  System.out.println(s.valueOf(a));
	}

}
