package GS;

public class Question9 {

	public static void main(String[] args) {
		int a[]=new int[]{1, 2, 4};
        int k=8,sum=0,len=a.length+1,j=0,min=999;
        for(int i=0;i<a.length;i++)
        {
           	sum=sum+a[i];
           	//System.out.println("sum :"+sum);
           	if(sum<=k)
           	 continue;
           	if(min==1)
           		break;
           	else
           	{
           		len=i-j+1;
           		while(j<=i)
           		{
           			sum=sum-a[j];
           			j++;
               		if(sum>k)
               		  len=i-j+1;
               		//System.out.println("length : "+len+" sum "+sum+" i "+i+" j "+j);
               		
               		 
           		}
           		if(min>len)
       				min=len;
           		//System.out.println("minimum : "+min);
           	}
        }
        if(min==999)
        	System.out.println("Not possible");
        else
          System.out.println("length : "+min);
	}
}
