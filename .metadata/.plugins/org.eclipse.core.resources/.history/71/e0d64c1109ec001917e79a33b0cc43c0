package concept;
public class largestSumContiArray {

	public static void main(String[] args) {
		int a[]=new int[] {-2,-3,4,-1,-2,1,5,-3};
        int sum=0;
        int max_point=0;
        for(int i=0;i<a.length;i++)
        {
        	max_point=max_point+a[i];
        	if(max_point<0)
        		max_point=0;
        	else
        	{
        		if(sum<max_point)
        			sum=max_point;
        	}
        }
        System.out.println(sum);
	}

}
