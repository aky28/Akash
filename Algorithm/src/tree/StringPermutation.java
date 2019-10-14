package tree;

import java.util.Scanner;

public class StringPermutation {
    static String str=null;
    static int count=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        str=sc.next();
        int len=str.length();
        permutation(str, 0, len-1);
	}
	public static void permutation(String s,int i,int n)
	{
		int j;
		if(i==n)
		{
			count++;
			System.out.println(count+" : "+s);
		}
		else
		{
			for(j=i;j<=n;j++)
			{
				s=swap(s,i,j);
				permutation(s,i+1,n);
				s=swap(s,i,j);
			}
		}
	}
	public static String swap(String s,int i,int j)
	{
		char a[]=s.toCharArray();
		char temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		//return String.valueOf(a);
		
		return String.valueOf(a);
	}

}
