package morgan;

import java.util.Scanner;

public class SpiralMatrix {
    static int r=0,c=0,i=0,j=0,l=0;
	public static void spiral(int m[][],int n)
	{
		while(c<n && r<n)
		{
			for(i=r;i<n-c;i++)
				System.out.print(m[c][i]+" ");
			i--;
			c++;
			for(j=c;j<n-r;j++)
				System.out.print(m[j][i]+" ");
			r++;
			j--;
			for(i=n-c-1;i>=0+l;i--)
				System.out.print(m[j][i]+" ");
			l++;
			i++;
			for(j=n-r-l;j>=c;j--)
				System.out.print(m[j][i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and coloumn");
        int n=sc.nextInt();
        int mat[][]=new int [n][n];
        for(int i=0;i<n;i++)
        {
        	for(int j=0;j<n;j++)
        	{
        	   mat[i][j]=sc.nextInt();	
        	}
        }
        for(int i=0;i<n;i++)
        {
        	for(int j=0;j<n;j++)
        	{
        	  System.out.print(mat[i][j]+" ");
        	}
        	System.out.println();
        }
        spiral(mat,n);
	}

}
