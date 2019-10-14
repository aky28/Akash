package morgan;

import java.util.Scanner;

public class NthNumber {
    static int arrb[]=new int[1000];
	static int a[]=new int[] {0,1,2,3,4,5};
	public static void main(String[] args) {
	    System.out.println("Enter the nth term");
	    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=a.length;
        int x=base(n-1,l);
        //System.out.println("x value : "+x+" l value : "+l);
        for(int t=x-1;t>=0;t--)
			System.out.print(arrb[t]);
	}
	
	public static int base(int n,int b)
	{
		int i=0,k=0;
		if(n==0)
			return 0;
		else
		{
			while(n>0)
			{
				arrb[i++]=n%b;
				//System.out.println(arrb[i-1]);
				n=n/b;
			}
			return i;
		}
	}

}
