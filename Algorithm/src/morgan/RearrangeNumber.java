package morgan;

public class RearrangeNumber {

	public static void main(String[] args) {
		int a[]=new int[] {12 ,11 ,-13 ,-5 ,6 ,-7 ,5 ,-3 ,-6};
		int t=0;
        for(int i=0;i<a.length;i++)
        {
        	if(a[i]>0)
        	 continue;
        	int k=a[i];
        	for(int j=i-1;j>=t;j--)
        	{
        		a[j+1]=a[j];
        	}
        	a[t]=k;
        	t++;
        }
        for(int i=0;i<a.length;i++)
        	System.out.print(a[i]+" ");
	}

}
