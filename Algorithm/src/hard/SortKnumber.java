package hard;

import java.util.Scanner;

import sorting.Quicksort;

public class SortKnumber {

	static Scanner sc=new Scanner(System.in);
    static int arr[]= {5,2,7,9,4,30,11,18,32};
	static int k=0;
	static int len=arr.length;
	public static void main(String[] args) {
		System.out.println("Enter the Kth Position");
		k=sc.nextInt();
        QuickSortAcc(arr,0,k);
        QuickSortDes(arr,k+1,len-1);
        
        for(int i=0;i<len;i++)
        	System.out.print(arr[i]+" ");
	}
	
	public static void QuickSortAcc(int arr[],int low,int high)
	{
		int q=0,q1=0;
		if(low<high)
		{
			q=partionAcc(arr,low,high);
			QuickSortAcc(arr, low, q-1);
			QuickSortAcc(arr, q+1, high);
		}
	}
	public static void QuickSortDes(int arr[],int low,int high)
	{
		int q=0,q1=0;
		if(low<high)
		{
			q=partionDes(arr,low,high);
			QuickSortDes(arr, low, q-1);
			QuickSortDes(arr, q+1, high);
		}
	}
	
	public static int partionAcc(int[] arr,int l,int h)
	{
		int pivot=arr[h];
		int j=l;
		int i=l-1;
		
		//System.out.println("pivot : "+pivot+" i :"+i+" j :"+j);
		while(j<h)
		{
			if(arr[j]<pivot)
			{
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			j++;
		}
		i++;
		int temp=arr[i];
		arr[i]=pivot;
		arr[h]=temp;
		return i;
	}
	
	public static int partionDes(int[] arr,int l,int h)
	{
		int pivot=arr[h];
		int j=l;
		int i=l-1;
		
		//System.out.println("pivot : "+pivot+" i :"+i+" j :"+j);
		while(j<h)
		{
			if(arr[j]>pivot)
			{
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			j++;
		}
		i++;
		int temp=arr[i];
		arr[i]=pivot;
		arr[h]=temp;
		return i;
	}

}
