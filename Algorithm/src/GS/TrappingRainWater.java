package GS;

public class TrappingRainWater {

	public static void main(String[] args) {
	    int arr[] = new int[]{2,0,2}; 
	    int n=arr.length;
	    int total_water=0;
	    int left[]=new int[n];
	    int right[]=new int[n];
	    left[0]=arr[0];
	    for(int i=1;i<n;i++)
	    {
	    	left[i]=Math.max(left[i-1],arr[i]);
	    }
	    
	    right[n-1]=arr[n-1];
	    for(int i=n-2;i>=0;i--)
	    {
	    	right[i]=Math.max(right[i+1],arr[i]);
	    }
	    
	    for(int i=0;i<n;i++)
	    {
             System.out.println("left : "+left[i]+" right "+right[i]);
	    }
	    
	    for(int i=0;i<n;i++)
	    {
	    	total_water=total_water+Math.min(left[i],right[i])-arr[i];
	    }
	    
	    System.out.println("Total water saved : "+total_water);
	    
	}

}
