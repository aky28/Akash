package GS;

import java.util.ArrayList;
import java.util.Arrays;

public class Question23 {

	public static void main(String[] args) {
		/*
		 * int a[]=new int[] {9,8,7,6,5,4,3,2,1}; int n=a.length; int b[]=new int[n];
		 * int k=0,sum=0; for(int i=0;i<n;i++) { for(int j=0;j<n-i-1;j++) {
		 * if(a[j]>a[j+1]) { int temp=a[j]; a[j]=a[j+1]; a[j+1]=temp; } } } for(int
		 * i=0;i<n;i++) System.out.print(a[i]+" "); System.out.println(); sum=a[0]+a[1];
		 * b[k++]=sum; for(int i=2;i<n;i++) { sum=sum+a[i]; b[k++]=sum; } sum=0;
		 * 
		 * for(int i=0;i<k;i++) System.out.print(b[i]+" "); for(int i=0;i<k;i++)
		 * sum=sum+b[i];
		 * 
		 * System.out.println("Answer "+sum);
		 */
		
		int a[]=new int[] {2,6,4,3};
		int k=0,sum=0;
		int len=a.length;
		int b[]=new int[len];
		ArrayList arr=new ArrayList();
		for(int i=0;i<len;i++)
		{
			len=a.length;
			Arrays.sort(a);
			System.out.println("a ");
			for(int p=0;p<len;p++)
			 System.out.print(a[p]+" ");
			System.out.println("len :"+len);
			for(int j=2;j<len;j++)
				arr.add(a[j]);
			b[k]=a[0]+a[1];
			arr.add(b[k++]);
			a=new int[arr.size()];
			for(int j=0;j<arr.size();j++)
				a[j]=(int)arr.get(j);
			arr.clear();
		}
		for(int i=0;i<k;i++)
			sum=sum+b[i];
		System.out.println(sum);
		
	}

}
