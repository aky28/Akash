package sorting;

public class Quicksort {

	int partition(int arr[],int l,int h)
	{
		int pivot=arr[h];
		int i=l-1;
		int j=l;
		while(j<h)
		{
			//System.out.println("i : "+i+" j :"+j);
			if(arr[j]<pivot)
			{
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
				j++;
		}
		
		int temp=arr[i+1];
		arr[i+1]=arr[h];
		arr[h]=temp;
		//System.out.println(arr);
		return i+1;
	}
	void quicksort(int arr[],int low,int high)
	{
		
		if(low<high)
		{
			int q;
			q=partition(arr,low,high);
			quicksort(arr,low,q-1);
			quicksort(arr,q+1,high);
		}
	}
	public static void main(String[] args) {
		int a[]= {2,1,10,5,3};
		int l=a.length;
		//System.out.println(l);
		
		Quicksort q=new Quicksort();
		q.quicksort(a,0,l-1);
		for(int i=0;i<l;i++)
		   System.out.print(a[i]+" ");
	}

}
