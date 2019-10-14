package GS;

public class MergeSort {

	public static void main(String[] args) {
        int a[]= {1,12,15,26};
        int b[]= {2,13,17,30,45};
        
        int l1=a.length;
        int l2=b.length;
        int c[]=new int[l1+l2];
        int i=0,j=0,k=0,median;
        
        while(i<l1 && j<l2)
        {
        	if(a[i]>b[j])
        	{
        		c[k++]=b[j++];
        	}
        	else
        		c[k++]=a[i++];
        }
        while(i<l1)
        	c[k++]=a[i++];
        while(j<l2)
        	c[k++]=b[j++];
        
        for(int f=0;f<k;f++)
        	System.out.print(c[f]+" ");
        if((l1+l2)%2==0)
        {
        	 median=(c[k/2]+c[(k/2)-1])/2;
        }
        else
        	median=c[k/2];
        System.out.println();
        System.out.println(median);
	}

}
