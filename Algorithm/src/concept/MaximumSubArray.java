package concept;


///naive approach
public class MaximumSubArray {

	public static void main(String[] args) {
		int a[]=new int[] {3,-2,5,-1};
		int sum=0;
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				sum=sum+a[j];
				if(sum>max)
					max=sum;
			}
			sum=0;
		}
		System.out.println(max);
	}
}
