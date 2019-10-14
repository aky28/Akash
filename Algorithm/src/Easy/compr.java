package Easy;

import java.util.Scanner;

public class compr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		char a[]=s.toCharArray();
		int len=s.length();
		int i=1,j=0;
		for(int p=0;p<len;p++)
		{
			if(p<len-1 && a[p]==a[p+1])
			{
				i++;
			}
			else
			{
				j++;
				
				a[j++]=(char)(i+'0');
				if(p<len-1)
				 a[j]=a[p+1];
				System.out.println("j : "+j);
				i=1;
			}
			
		}
		
		
		//System.out.println("j :"+j);
		for(int k=0;k<j;k++)
			System.out.print(a[k]);
	}

}
