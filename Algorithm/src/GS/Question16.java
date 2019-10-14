package GS;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
        
		Scanner sc=new Scanner(System.in);
		int i,j,count=0,x=0,flag=0;
		System.out.println("Enter the two number");
		i=sc.nextInt();
		int mul=i;
		j=sc.nextInt();
		while(count<j)
		{
			if(x==0)
			{
				count=1;
				if(count==j)
				{
					flag=1;
					break;
				}
				x++;
			}
			else
			{
				i=i*mul;
				count=i;
				//System.out.println("count "+count);
				if(i==j)
				{
					flag=1;
					break;
				}
				x++;
			}
		}
		if(flag==1)
			System.out.println("True");
		else
			System.out.println("False");
		
	}

}
