package morgan;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
        String s=sc.nextLine();
        String a[]=s.split(" ");
        String p = null;
        int flag=1;
        for(int i=0;i<a.length;i++)
        {
        	StringBuilder x=new StringBuilder(a[i]);
        	x=x.reverse();
        	if(flag==1)
        	{
        		p=x+" ";
        		flag=0;
        	}
        	else
        	   p=p+x+" ";
        }
        System.out.println(p);
	}

}
