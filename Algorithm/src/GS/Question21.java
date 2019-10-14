package GS;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 0/1 string");
		String s=sc.next();
		char a[]=s.toCharArray();
		char b[]=s.toCharArray();
		int l=s.length();
		int count=0,count1=0;
		for(int i=1;i<l;i++)
		{
			if(a[i]==a[i-1])
			{
				count++;
				if(a[i]=='0')
					a[i]='1';
				else
					a[i]='0';
			}
		}
		for(int i=l-2;i>=0;i--)
		{
			if(b[i]==b[i+1])
			{
				count1++;
				if(b[i]=='0')
					b[i]='1';
				else
					b[i]='0';
			}
		}
		if(count<count1)
		   System.out.println("count :"+count);
		else
			 System.out.println("count :"+count1);
	}

}
