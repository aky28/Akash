package concept;

public class DutchNationalFlag {

	static int n[]=new int[] {0,1,2,0,1,2,2,2,0,0,1,1,0};
	public static void main(String[] args) {
		
		int l=0;
		int mid=0;
		int h=n.length-1;
		while(mid<=h)
		{
			switch(n[mid])
			{
				case 0:swap(n,l,mid);
				       l++;
				       mid++;
				       break;
				       
				case 1:mid++;
				       break;
				       
				case 2:swap(n,mid,h);
				       h--;
				       break;
			}
		}
		
		for(int i=0;i<n.length;i++)
			System.out.print(n[i]+" ");
	}
	public static void swap(int a[],int l,int h)
	{
		int temp=a[l];
		a[l]=a[h];
		a[h]=temp;
	}

}
