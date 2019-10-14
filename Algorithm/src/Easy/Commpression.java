package Easy;

import java.util.Scanner;

public class Commpression {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		char a[]=new char[s.length()+2];
		a=s.toCharArray();
		int len=s.length();
		int count=1,flag=0,j=0;
		for(int i=0;i<len-1;i++)
		{
			if(a[i]==a[i+1])
			{
				count++;
				if(flag==0)
				{
					System.out.println("j :"+j);
					j=i+1;
					flag=1;
				}
				continue;
			}
			else
			{
				a[j]=(char) (count+'0');
				flag=0;
				count=1;
				if(j+1>=len-1)
				{
					a[j+2]=(char) (count+'0');
					break;
				}
				for(int l=j+1;l<len-1;l++)
				{
					a[l]=a[l+1];
				}
				System.out.println(String.valueOf(a));
				len--;
				j=0;
				i--;
			}
				
		}
		for(int h=0;h<len;h++)
			System.out.print(a[h]);

	}

}
